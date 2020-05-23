package Models;

import java.util.ArrayList;
import Composite.Component;
import Controllers.GeneralController;
import Views.Dialogue;

/**
 * 
 * Componente de Par�grafo do padr�o HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class P  extends Component {

	private ArrayList<Component> components;
	private String description;

	public P(){
		this.components = new ArrayList<Component>();
		this.description = "";
		this.getPermissionComponent();
	}
	
	@Override
	public void add(Component comp) {
		this.components.add(comp);
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		String html = "<p";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += ">";
		
		html += this.description + this.getChildren();
	
		html += "</p>";
		
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
			res += "\n****************\nP\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[1] - A\n";
			res += "[13] - IMG\n";
			res += "[15] - LABEL\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o n�mero para inserir um elemento no P:");
			if (i == 0){
				return;
			}
			id = Dialogue.printResponseString("Insira um ID para o elemento ou continue:");
			classe = Dialogue.printResponseString("Insira uma CLASSE para o elemento ou continue:");
			GeneralController.getGeneralElements(this, GeneralController.getEnum(i), id, classe);
		}
	}
	
}
