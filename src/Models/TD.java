package Models;

import java.util.ArrayList;
import Composite.Component;
import Controllers.GeneralController;
import Views.Dialogue;

/**
 * 
 * Componente de Dados da tabela do padr�o HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class TD extends Component {

	private String permission;
	private ArrayList<Component> components;
	private String description;

	public TD(){
		this.permission = "[0];[1];[3];[7];[8];[9];[10];[13];[14];[15];[17];[18];[22]";
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
		String html = "<td";
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += ">";
		
		html += this.description + this.getChildren();

		html += "</td>";
		
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
			res = "\n****************\nTD\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[1] - A\n";
			res += "[3] - BUTTON\n";
			res += "[7] - H1\n";
			res += "[8] - H2\n";
			res += "[9] - H3\n";
			res += "[10] - H4\n";
			res += "[13] - IMG\n";
			res += "[14] - INPUT\n";
			res += "[15] - LABEL\n";
			res += "[17] - P\n";
			res += "[18] - SELECT\n";
			res += "[22] - TEXTAREA\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o n�mero para inserir um elemento no TD:");
			if (i == 0){
				return;
			}
			if (!numberAllowed("[" + i + "]")) {
				Dialogue.print("N�mero inv�lido ou n�o permitido, digite novamente.");
				continue;
			}
			id = Dialogue.printResponseString("Insira um ID para o elemento ou continue:");
			classe = Dialogue.printResponseString("Insira uma CLASSE para o elemento ou continue:");
			GeneralController.getGeneralElements(this, GeneralController.getEnum(i), id, classe);
		}
	}
	
}