package Models;

import java.util.ArrayList;
import Composite.Component;
import Controllers.GeneralController;
import Views.Dialogue;

/**
 * 
 * Componente de Tabela do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class TABLE  extends Component {

	private String permission;
	private ArrayList<Component> components;
	private String border;

	public TABLE(){
		this.permission = "[0];[24]";
		this.components = new ArrayList<Component>();
		this.getPermissionComponent();
	}
	
	@Override
	public void add(Component comp) {
		this.components.add(comp);
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
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
		String html = "<table";
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += !this.border.equals("") ? " border='"+this.border+"'" : null;
		html += ">";
		
		html += this.getChildren();

		html += "</table>";
		
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
		this.border = Dialogue.printResponseString("Insira BORDER para o elemento ou continue:");
		int i = 0;
		while (true) {
			res = "\n****************\nTABLE\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[24] - TR\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o número para inserir um elemento no TABLE:");
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