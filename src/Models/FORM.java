package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente Formulário do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class FORM extends Component {

	private ArrayList<Component> components;
	private String action;
	private String method;

	public FORM(){
		this.components = new ArrayList<Component>();
	}

	@Override
	public void add(Component comp) {
		this.components.add(comp);
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
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
		String html = "<form";
		html += this.getId() != null && this.getId() != "" ? "id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? "class='"+this.getClasse()+"'" : "";
		html += this.action != null && this.action != "" ? " action='" + this.action + "'" : "";
		html += this.method != null && this.method != "" ? " method='" + this.method + "'" : "";
		html += ">";
		
		html += this.getChildren();
		
		html += "</form>";
		
		return indexing(html);
	}
	
}
