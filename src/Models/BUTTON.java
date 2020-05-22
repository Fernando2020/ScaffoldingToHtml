package Models;

import Composite.Component;

/**
 * 
 * Componente Botão do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class BUTTON  extends Component {

	private String description;
	private String type;

	public BUTTON(){
		this.description = "";
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getHTML() {
		String html = "<button";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += this.type != null && this.type != "" ? " type='" + this.type + "'" : "";
		html += ">";
		html += this.description;
		html += "</button>";

		return indexing(html);
	}
	
}