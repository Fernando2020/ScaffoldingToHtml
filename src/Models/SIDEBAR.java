package Models;

import java.util.ArrayList;
import Composite.Component;
import Controllers.GeneralController;
import Views.Dialogue;

/**
 * 
 * Componente do Menu lateral do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class SIDEBAR extends Component{
	
	private ArrayList<Component> components;
	private String description;
	
	public SIDEBAR(){
		this.components = new ArrayList<Component>();
		this.description = "";
		this.getPermissionComponent();
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void add(Component comp) {
		this.components.add(comp);
	}
		
	@Override
	public String getChildren(){
		String children = "";
		for(int i=0; i<this.components.size(); i++){
			children += components.get(i).getHTML();
		}
		return children;
	}
	
	@Override
	public String getHTML() {		
		String html = "<div class='sidenav'";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += ">";
				
		html += "<a href='#'>MENU</a>";
		html += this.description + this.getChildren();

		html += "</div>";
		
		return indexing(html);
	}
	
	@Override
	public void getPermissionComponent() {
		String res = "";
		String id = "";
		String classe = "";
		this.description = Dialogue.printResponseString("Insira DESCRICAO para o elemento ou continue:");
		int i = 0;
		while (true) {
			res += "\n****************\nSIDEBAR\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[1] - A\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o número para inserir um elemento no SIDEBAR:");
			if (i == 0){
				return;
			}
			id = Dialogue.printResponseString("Insira um ID para o elemento ou continue:");
			classe = Dialogue.printResponseString("Insira uma CLASSE para o elemento ou continue:");
			GeneralController.getGeneralElements(this, GeneralController.getEnum(i), id, classe);
		}
	}
}
