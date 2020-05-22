package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente de Tabela do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class TABLE  extends Component {

	private ArrayList<Component> components;
	private String border;

	public TABLE(){
		this.components = new ArrayList<Component>();
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
	public String getChildren(){
		String children = "";
		for(int i=0; i<this.components.size(); i++){
			children += components.get(i).getHTML();
		}
		return children;
	}
	
	@Override
	public String getHTML() {
		String html = "<table";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += this.border != null && this.border != "" ? " border='"+this.border+"'" : "";
		html += ">";
		
		html += this.getChildren();

		html += "</table>";
		
		return indexing(html);
	}
	
}