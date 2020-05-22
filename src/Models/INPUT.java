package Models;

import Composite.Component;

/**
 * 
 * Componente de entrada de dados do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class INPUT  extends Component {

	private String type;
	private String value;
	private String name;
	private boolean required;
	private boolean readonly;
	private int max;
	private int min;
	private boolean checked;

	public INPUT(){
		this.max = -1;
		this.min = -1;
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

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	@Override
	public String getHTML() {
		String html = "<input";
		html += this.getId() != null && this.getId() != "" ? " id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? " class='"+this.getClasse()+"'" : "";
		html += this.type != null && type != "" ? " type='" + this.type + "'" : "";
		html += this.value != null && value != "" ? " value='" + this.value + "'" : "";
		html += this.name != null && name != "" ? " name='" + this.name + "'" : "";
		html += this.required ? " required" : "";
		html += this.readonly ? " readonly" : "";
		html += this.type == "number" && this.max > -1 ? " max='" + this.max + "'" : "";
		html += this.type == "number" && this.min > -1 ? " min='" + this.min + "'" : "";
		html += this.type == "checkbox" && this.checked ? " checked" : "";
		html += "/>";

		return indexing(html);
	}
	
}