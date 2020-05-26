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

	public void add(Component comp) throws Exception {
		throw new Exception("Este componente não implementa essa funcionalidade");
	}

	public void remove(Component comp) throws Exception {
		throw new Exception("Este componente não implementa essa funcionalidade");
	}

	public String getHTML() throws Exception {
		throw new Exception("Este componente não implementa essa funcionalidade");
	}

	public String indexing(String sentenca) {
		return "\n" + sentenca + "\n";
	}
	
	public String getChildren() throws Exception {
		throw new Exception("Este componente não implementa essa funcionalidade");
	}
	
	public void getPermissionComponent() throws Exception{
		throw new Exception("Este componente não implementa essa funcionalidade");
	}
	
	public boolean numberAllowed(String number){
		return false;
	}

}
