package Models;

import java.util.ArrayList;
import Composite.Component;
import Controllers.GeneralController;
import Views.Dialogue;

/**
 * 
 * Componente Corpo do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class BODY extends Component {

	private String permission;
	private ArrayList<Component> components;

	public BODY() {
		this.permission = "[0];[1];[3];[4];[6];[7];[8];[9];[10];[13];[14];[15];[17];[18];[20];[22]";
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
		String html = "<body>";

		html += this.getChildren();

		html += "</body>";

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
			res = "\n****************\nBODY\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[1] - A\n";
			res += "[3] - BUTTON\n";
			res += "[4] - DIV\n";
			res += "[6] - FORM\n";
			res += "[7] - H1\n";
			res += "[8] - H2\n";
			res += "[9] - H3\n";
			res += "[10] - H4\n";
			res += "[13] - IMG\n";
			res += "[14] - INPUT\n";
			res += "[15] - LABEL\n";
			res += "[17] - P\n";
			res += "[18] - SELECT\n";
			res += "[20] - TABLE\n";
			res += "[22] - TEXTAREA\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o número para inserir um elemento no BODY:");
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
