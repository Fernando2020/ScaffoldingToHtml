package Models;

import Composite.Component;
import Views.Dialogue;


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
		this.getPermissionComponent();
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
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += !this.type.equals("") ? " type='" + this.type + "'" : "";
		html += ">";
		html += this.description;
		html += "</button>";

		return indexing(html);
	}
	
	@Override
	public void getPermissionComponent() {
		this.type = Dialogue.printResponseString("Insira TYPE para o elemento ou continue:");
		this.description = Dialogue.printResponseString("Insira DESCRICAO para o elemento ou continue:");
		return;
	}
	
}