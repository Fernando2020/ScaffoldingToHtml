package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente de Parágrafo do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class P  extends Component {

	private ArrayList<Component> components;
	private String description;

	public P(){
		this.components = new ArrayList<Component>();
		this.description = "";
	}
	
	@Override
	public void add(Component comp) {
		this.components.add(comp);
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		String html = "<h1";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += ">";
		
		html += this.description + this.getChildren();
	
		html += "</h1>";
		
		return indexing(html);
	}
	
}
