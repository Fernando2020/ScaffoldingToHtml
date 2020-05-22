package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente de T�tulo do padr�o HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class H2  extends Component {

	private ArrayList<Component> components;
	private String description;

	public H2(){
		this.components = new ArrayList<Component>();
		this.description = "";
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
		String html = "<h2";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += ">";
		
		html += this.description + this.getChildren();
	
		html += "</h2>";
		
		return indexing(html);
	}
	
}