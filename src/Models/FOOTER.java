package Models;

import java.util.ArrayList;

import Composite.Component;

/**
 * 
 * Componente Rodapé do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class FOOTER extends Component{

	private ArrayList<Component> components;
	private String description;
	
	public FOOTER(){
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
		String html = "<footer class='footer'";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += ">";
				
		html += this.description + this.getChildren();

		html += "</footer>";
		
		return indexing(html);
	}

}
