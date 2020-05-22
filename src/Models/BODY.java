package Models;

import java.util.ArrayList;
import Composite.Component;

/**
 * 
 * Componente Corpo do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class BODY extends Component {

	private ArrayList<Component> components;

	public BODY() {
		this.components = new ArrayList<Component>();
	}
	
	@Override
	public void add(Component comp) {
		this.components.add(comp);
	}

	@Override
	public String getChildren() {
		String children = "";
		for (int i = 0; i < this.components.size(); i++) {
			children += components.get(i).getHTML();
		}
		return children;
	}

	@Override
	public String getHTML() {
		String html = "<body>";

		html += this.getChildren();

		html += "</body>";

		return indexing(html);
	}

}
