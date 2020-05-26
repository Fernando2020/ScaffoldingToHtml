package Models;

import java.util.ArrayList;
import Composite.Component;
import Controllers.GeneralController;
import Views.Dialogue;

/**
 * 
 * Componente de DropDown ou Select do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class SELECT  extends Component {

	private String permission;
	private ArrayList<Component> components;

	public SELECT(){
		this.permission = "[0];[16]";
		this.components = new ArrayList<Component>();
		this.getPermissionComponent();
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
		String html = "<select";
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += ">";
		
		html += this.getChildren();
	
		html += "</select>";
		
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
		int i = 0;
		while (true) {
			res = "\n****************\nSELECT\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[16] - OPTION\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o número para inserir um elemento no SELECT:");
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
