package Models;

import java.util.ArrayList;
import Composite.Component;
import Controllers.GeneralController;
import Views.Dialogue;

/**
 * 
 * Componente responsável pela organização das tags criadas do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class HTMLArchive extends Component {

	private String permission;
	private ArrayList<Component> components;
	private String title;
	private String archiveName;
	private String path;

	public HTMLArchive() {
		this.permission = "[0];[2];[5];[11];[19]";
		this.components = new ArrayList<Component>();
		this.path = "html/";
		this.getPermissionComponent();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArchiveName() {
		return archiveName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setArchiveName(String archiveName) {
		this.archiveName = archiveName;
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
		String html = "<html lang='pt-br'";
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += ">";
		html += "<head>";
		html += "\n<meta charset='utf-8'/>";
		html += "\n<link href='../css/style.css' rel='stylesheet'/>";
		html += !this.title.equals("") ? "\n<title>" + this.title + "</title>" : "";
		html += "</head>";

		html += this.getChildren();

		html += "</html>";

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
		this.archiveName = Dialogue.printResponseString("Insira o NOME DO ARQUIVO:");
		this.title = Dialogue.printResponseString("Insira TÍTULO para o elemento ou continue:");
		int i = 0;
		while (true) {
			res = "\n****************\nHTML\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[2] - BODY\n";
			res += "[5] - FOOTER\n";
			res += "[11] - HEADER\n";
			res += "[19] - SIDEBAR\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o número para inserir um elemento no HTML:");
			if (i == 0) {
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
