package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente Link do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class A extends Component{
	
	private ArrayList<Component> components;
	private String description;
	private String href;
	private boolean target;
	
	public A(){
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

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public boolean isTarget() {
		return target;
	}

	public void setTarget(boolean target) {
		this.target = target;
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
		String html = "<a";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += this.href != null && this.href != "" ? " href='" + this.href + "'" : ""; 
		html += this.target ? " target='_blank'" : "";
		html += ">";
		
		html += this.description + this.getChildren();
		
		html += "</a>";

		return indexing(html);
	}
	
}
