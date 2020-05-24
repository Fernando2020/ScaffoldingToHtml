package Models;

import java.util.ArrayList;
import Composite.Component;
import Controllers.GeneralController;
import Views.Dialogue;

/**
 * 
 * Componente Link do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class A extends Component{
	
	private String permission;
	private ArrayList<Component> components;
	private String description;
	private String href;
	private String target;
	
	public A(){
		this.permission = "[0];[7];[8];[9];[10];[13];[15];[17]";
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

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
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
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += !this.href.equals("") ? " href='" + this.href + "'" : ""; 
		html += !this.target.equals("") && this.target.equals("s") ? " target='_blank'" : "";
		html += ">";
		
		html += this.description + this.getChildren();
		
		html += "</a>";

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
		this.href = Dialogue.printResponseString("Insira HREF para o elemento ou continue:");
		this.description = Dialogue.printResponseString("Insira DESCRICAO para o elemento ou continue:");
		this.target = Dialogue.printResponseString("Insira TARGET para o elemento ou continue (s/n):");
		int i = 0;
		while (true) {
			res = "\n****************\nA\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[7] - H1\n";
			res += "[8] - H2\n";
			res += "[9] - H3\n";
			res += "[10] - H4\n";
			res += "[13] - IMG\n";
			res += "[15] - LABEL\n";
			res += "[17] - P\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o número para inserir um elemento no A:");
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
