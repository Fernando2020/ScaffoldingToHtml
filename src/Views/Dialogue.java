package Views;

import java.util.Scanner;

/**
 * 
 * Classe respons�vel pela sa�da das mensagens para a tela do usu�rio
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class Dialogue {

	private Scanner scan;
	
	public Dialogue(){
		this.scan = new Scanner(System.in);
	}
	
	public void print(String sentenca) {
		System.out.println(sentenca);
	}
	
	public String printResponse(String sentenca) {
		System.out.println(sentenca);
		return this.scan.next().toString();
	}
	
	public String printResponseComponentOrExit(String sentenca){
		String html = "Deseja inserir um componente:\n";
		html += sentenca;
		print(html);
		return scan.next();
	}
	
}
