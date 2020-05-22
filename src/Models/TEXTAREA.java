package Models;

import Composite.Component;

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
	private int cols;
	private int rows;

	public TEXTAREA(){
		this.cols = -1;
		this.rows = -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	@Override
	public String getHTML() {
		String html = "<input";
		html += this.getId() != null && this.getId() != "" ? "id='"+this.getId()+"'" : "";
		html += this.getClasse() != null && this.getClasse() != "" ? "class='"+this.getClasse()+"'" : "";
		html += this.cols > -1 ? " cols='" + this.cols+ "'" : "";
		html += this.rows > -1 ? " rows='" + this.rows+ "'" : "";
		html += "/>";

		return indexing(html);
	}
	
}