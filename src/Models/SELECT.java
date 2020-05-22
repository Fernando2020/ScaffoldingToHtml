package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente de DropDown ou Select do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class SELECT  extends Component {

	private ArrayList<Component> components;

	public SELECT(){
		this.components = new ArrayList<Component>();
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
		String html = "<select";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += ">";
		
		html += this.getChildren();
	
		html += "</select>";
		
		return indexing(html);
	}
}
