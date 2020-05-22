package Models;

import java.util.ArrayList;

import Composite.Component;

/**
 * 
 * Componente do Menu lateral do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class SIDEBAR extends Component{
	private ArrayList<Component> components;
	private String description;
	
	public SIDEBAR(){
		this.components = new ArrayList<Component>();
		this.description = "";
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
		String html = "<div class='sidenav'";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += ">";
				
		html += "<a href='#'>MENU</a>";
		html += this.description + this.getChildren();

		html += "</div>";
		
		return indexing(html);
	}
}
