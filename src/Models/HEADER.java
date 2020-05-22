package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente de Cabeçalho do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class HEADER extends Component{

	private ArrayList<Component> components;
	private String description;
	
	public HEADER(){
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
		String html = "<header";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += ">";
				
		html += this.description + this.getChildren();

		html += "</header>";
		
		return indexing(html);
	}
}
