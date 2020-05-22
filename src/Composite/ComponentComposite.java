package Composite;

/**
 * 
 * Classe abstrata resposável por representar o Composite de todos os
 * componentes
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */
public abstract class ComponentComposite extends ComponentBase {

	public void add(Component comp) {
		return;
	}

	public void remove(Component comp) {
		return;
	}

	public String getHTML() {
		return "";
	}

	public String indexing(String sentenca) {
		return "\n" + sentenca + "\n";
	}

	public String getProperties() {
		return "";
	}

	public String getComponents() {
		return "";
	}

	public String getChildren() {
		return null;
	}

}
