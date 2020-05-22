package Models;

import java.util.ArrayList;
import Composite.Component;


/**
 * 
 * Componente Div do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class DIV extends Component {

	private ArrayList<Component> components;

	public DIV(){
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
		String html = "<div";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += ">";
		
		html += this.getChildren();

		html += "</div>";
		
		return indexing(html);
	}
	
}
