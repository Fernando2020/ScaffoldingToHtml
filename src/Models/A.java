package Models;

import java.util.ArrayList;
import Composite.Component;
import Controllers.GeneralController;
import Views.Dialogue;

/**
 * 
 * Componente Link do padr�o HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class A extends Component{
	
	private ArrayList<Component> components;
	private String description;
	private String href;
	private boolean target;
	
	public A(){
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

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public boolean isTarget() {
		return target;
	}

	public void setTarget(boolean target) {
		this.target = target;
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
		String html = "<a";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += this.href != null && this.href != "" ? " href='" + this.href + "'" : ""; 
		html += this.target ? " target='_blank'" : "";
		html += ">";
		
		html += this.description + this.getChildren();
		
		html += "</a>";

		return indexing(html);
	}
	
	@Override
	public void getPermissionComponent() {
		String res = "";
		String id = "";
		String classe = "";
		this.href = Dialogue.printResponseString("Insira HREF para o elemento ou continue:");
		this.description = Dialogue.printResponseString("Insira DESCRICAO para o elemento ou continue:");
		this.target = Dialogue.printResponseBoolean("Insira TARGET para o elemento ou continue (true/false):");
		int i = 0;
		while (true) {
			res += "\n****************\nA\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[7] - H1\n";
			res += "[8] - H2\n";
			res += "[9] - H3\n";
			res += "[10] - H4\n";
			res += "[13] - IMG\n";
			res += "[15] - LABEL\n";
			res += "[17] - P\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o n�mero para inserir um elemento no A:");
			if (i == 0){
				return;
			}
			id = Dialogue.printResponseString("Insira um ID para o elemento ou continue:");
			classe = Dialogue.printResponseString("Insira uma CLASSE para o elemento ou continue:");
			GeneralController.getGeneralElements(this, GeneralController.getEnum(i), id, classe);
		}
	}
	
}
