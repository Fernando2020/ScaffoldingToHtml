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

	private ArrayList<Component> components;
	private String title;
	private String archiveName;
	private String path;

	public HTMLArchive() {
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
		for (int i = 0; i < this.components.size(); i++) {
			children += components.get(i).getHTML();
		}
		return children;
	}

	@Override
	public String getHTML() {
		String html = "<html lang='pt-br'";
		html += this.getId() != null && this.getId() != "" ? " id='" + this.getId() + "'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='" + this.getClasse() + "'" : "";
		html += ">";
		html += "<head>";
		html += "\n<meta charset='utf-8'/>";
		html += "\n<link href='../css/style.css' rel='stylesheet'/>";
		html += this.title != null && this.title != "" ? "\n<title>" + this.title + "<\title>" : "";
		html += "</head>";

		html += this.getChildren();

		html += "</html>";

		return indexing(html);

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
			res += "\n****************\nHTML\n****************\n";
			res += "[0] - VOLTAR/SAIR\n";
			res += "[2] - BODY\n";
			res += "[5] - FOOTER\n";
			res += "[11] - HEADER\n";
			res += "[19] - SIDEBAR\n";

			Dialogue.print(res);
			i = Dialogue.printResponseInt("Digite o número para inserir um elemento no HTML:");
			if (i == 0){
				return;
			}
			id = Dialogue.printResponseString("Insira um ID para o elemento ou continue:");
			classe = Dialogue.printResponseString("Insira uma CLASSE para o elemento ou continue:");
			GeneralController.getGeneralElements(this, GeneralController.getEnum(i), id, classe);
		}

	}
}
