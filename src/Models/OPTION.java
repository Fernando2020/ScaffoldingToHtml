package Models;

import Composite.Component;
import Views.Dialogue;

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
		this.getPermissionComponent();
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
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += !this.value.equals("") ? " id='"+this.value+"'" : "";
		html += "/>";
		
		html += this.description;
		
		html += "</option>";
		
		return indexing(html);
	}
	
	@Override
	public void getPermissionComponent() {
		this.value = Dialogue.printResponseString("Insira VALUE para o elemento ou continue:");
		this.description = Dialogue.printResponseString("Insira DESCRICAO para o elemento ou continue:");
		return;
	}
	
}
