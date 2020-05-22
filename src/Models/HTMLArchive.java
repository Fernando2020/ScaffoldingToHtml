package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente responsável pela organização das tags criadas do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class HTMLArchive extends Component{

	private ArrayList<Component> components;
	private String title;
	private String archiveName;
	private String path; 
	
	public HTMLArchive(){
		this.components = new ArrayList<Component>();
		this.path = "html/"; 
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
	public String getChildren(){
		String children = "";
		for(int i=0; i<this.components.size(); i++){
			children += components.get(i).getHTML();
		}
		return children;
	}
	
	@Override
	public String getHTML() {
		String html = "<html lang='pt-br'";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
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
}
