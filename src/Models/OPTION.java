package Models;

import Composite.Component;

/**
 * 
 * Componente de Opções do componente Select do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class OPTION  extends Component {

	private String value;
	private String description;
	
	public OPTION(){
		this.description = "";
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String getHTML() {
		String html = "<option";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += this.value != null && this.value != "" ? " id='"+this.value+"'" : "";
		
		html += this.description;
		
		html += "/>";
		
		return indexing(html);
	}
	
}
