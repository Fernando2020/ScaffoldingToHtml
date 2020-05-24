package Models;

import Composite.Component;
import Views.Dialogue;

/**
 * 
 * Componente de entrada de dados do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class INPUT extends Component {

	private String type;
	private String value;
	private String name;
	private String required;
	private String readonly;
	private String max;
	private String min;
	private String checked;

	public INPUT() {
		this.getPermissionComponent();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public String getReadonly() {
		return readonly;
	}

	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	@Override
	public String getHTML() {
		String html = "<input";
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += !this.type.equals("") ? " type='" + this.type + "'" : "";
		html += !this.value.equals("") ? " value='" + this.value + "'" : "";
		html += !this.name.equals("") ? " name='" + this.name + "'" : "";
		html += !this.required.equals("") && this.required.equals("s") ? " required" : "";
		html += !this.readonly.equals("") && this.readonly.equals("s")? " readonly" : "";
		html += this.type.equals("number") && !this.max.equals("") ? " max='" + this.max + "'" : "";
		html += this.type.equals("number") && !this.min.equals("") ? " min='" + this.min + "'" : "";
		html += this.type.equals("checkbox") && !this.readonly.equals("") && this.readonly.equals("s") ? " checked" : "";
		html += "/>";

		return indexing(html);
	}

	@Override
	public void getPermissionComponent() {
		this.type = Dialogue.printResponseString("Insira TYPE para o elemento ou continue:");
		this.value = Dialogue.printResponseString("Insira VALUE para o elemento ou continue:");
		this.name = Dialogue.printResponseString("Insira NAME para o elemento ou continue:");
		this.required = Dialogue.printResponseString("Insira REQUIRED para o elemento ou continue (s/n):");
		this.readonly = Dialogue.printResponseString("Insira READONLY para o elemento ou continue (s/n):");
		if (this.type == "number") {
			this.max = Dialogue.printResponseString("Insira MAX para o elemento ou continue:");
			this.min = Dialogue.printResponseString("Insira MIN para o elemento ou continue:");
		} else if (this.type == "checkbox") {
			this.checked = Dialogue.printResponseString("Insira CHECKED para o elemento ou continue (s/n):");
		}
		return;
	}

}