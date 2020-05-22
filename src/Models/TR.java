package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente de Linhas da tabela do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class TR extends Component {

	private ArrayList<Component> components;

	public TR(){
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
		String html = "<tr";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += ">";
		
		html += this.getChildren();

		html += "</tr>";
		
		return indexing(html);
	}
	
}