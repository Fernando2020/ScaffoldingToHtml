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
	
	private String permission;
	private ArrayList<Component> components;
	private String description;
	
	public SIDEBAR(){
		this.permission = "[0];[1]";
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
	public String getChildren() {
		String children = "";
		try {
			for (int i = 0; i < this.components.size(); i++) {
				children += components.get(i).getHTML();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return children;
	}
	
	@Override
	public String getHTML() {		
		String html = "<div class='sidenav'";
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += ">";
				
		html += "<a href='#'>"+this.description+"</a>";
		html +=  this.getChildren();

		html += "</div>";
		
		return indexing(html);
	}

	@Override
	public boolean numberAllowed(String number) {
		return this.permission.indexOf(number) > -1;
	}
	
	@Override
	public void getPermissionComponent() {
		String res = "";
		String id = "";
		String classe = "";
		this.description = Dialogue.printResponseString("Insira DESCRICAO para o elemento ou continue:");
		int i = 0;
		while (true) {
			res = "\n****************\nSIDEBAR\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[1] - A\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o número para inserir um elemento no SIDEBAR:");
			if (i == 0){
				return;
			}
			if (!numberAllowed("[" + i + "]")) {
				Dialogue.print("Número inválido ou não permitido, digite novamente.");
				continue;
			}
			id = Dialogue.printResponseString("Insira um ID para o elemento ou continue:");
			classe = Dialogue.printResponseString("Insira uma CLASSE para o elemento ou continue:");
			GeneralController.getGeneralElements(this, GeneralController.getEnum(i), id, classe);
		}
	}
}
