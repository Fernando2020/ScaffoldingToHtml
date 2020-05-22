package Composite;

/**
 * 
 * Classe abstrata resposável por representar um Componente
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */
public abstract class ComponentBase {

	private String id;
	private String classe;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

}
