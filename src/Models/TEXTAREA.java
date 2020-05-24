package Models;

import Composite.Component;
import Views.Dialogue;


/**
 * 
 * Componente de Texto do padrão HTML
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class TEXTAREA  extends Component {

	private String name;
	private String cols;
	private String rows;

	public TEXTAREA(){
		this.getPermissionComponent();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCols() {
		return cols;
	}

	public void setCols(String cols) {
		this.cols = cols;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}
	
	@Override
	public String getHTML() {
		String html = "<input";
		html += !this.getId().equals("") ? " id='"+this.getId()+"'" : "";
		html += !this.getClasse().equals("") ? " class='"+this.getClasse()+"'" : "";
		html += !this.cols.equals("") ? " cols='" + this.cols+ "'" : null;
		html += !this.rows.equals("") ? " rows='" + this.rows+ "'" : null;
		html += "/>";

		return indexing(html);
	}
	
	@Override
	public void getPermissionComponent() {
		this.name = Dialogue.printResponseString("Insira NAME para o elemento ou continue:");
		this.cols = Dialogue.printResponseString("Insira o número de COLUNAS para o elemento ou continue:");
		this.rows = Dialogue.printResponseString("Insira o número de LINHAS para o elemento ou continue:");
		return;
	}
	
}