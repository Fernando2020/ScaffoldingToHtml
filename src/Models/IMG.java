package Models;

import Composite.Component;
import Views.Dialogue;

/**
 * 
 * Componente de Imagem do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class IMG extends Component {

	private String src;
	private String alt;
	private String width;
	private String height;

	public IMG(){
		this.getPermissionComponent();
	}
	
	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	
	@Override
	public String getHTML() {
		String html = "<img";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += this.alt != null && this.alt != "" ? " alt='" + this.alt + "'" : "";
		html += this.width != null && this.width != "" ? " width='" + this.width + "'" : "";
		html += this.height != null && this.height != "" ? " height='" + this.height + "'" : "";
		html += this.src != null && this.src != "" ? " src='" + this.src + "'" : "";
		html += "/>";

		return indexing(html);
	}
	
	@Override
	public void getPermissionComponent() {
		this.src = Dialogue.printResponseString("Insira SRC para o elemento ou continue:");
		this.alt = Dialogue.printResponseString("Insira ALT para o elemento ou continue:");
		this.height = Dialogue.printResponseString("Insira HEIGHT para o elemento ou continue:");
		this.width = Dialogue.printResponseString("Insira WHIDTH para o elemento ou continue:");
		return;
	}
	
}
