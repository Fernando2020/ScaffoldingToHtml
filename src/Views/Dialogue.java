package Views;

import java.util.Scanner;

/**
 * 
 * Classe responsável pela saída das mensagens para a tela do usuário
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class Dialogue {

	private static Scanner scan = new Scanner(System.in); ;
		
	public static void print(String sentenca) {
		System.out.println(sentenca);
	}
	
	public static String getString() {
		return scan.next().toString();
	}
	
	public static int getInt() {
		try{
			return scan.nextInt();
		}catch(Exception e){return 0;}
	}
	
	public static boolean getBoolean() {
		try{
			return scan.nextBoolean();
		}catch(Exception e){return false;}
	}
	
	public static String printResponseString(String sentenca) {
		System.out.print(sentenca);
		return scan.next().toString();
	}
	
	public static int printResponseInt(String sentenca) {
		try{
			System.out.print(sentenca);
			return scan.nextInt();
		}catch(Exception e){return 0;}
	}
	
	public static int printResponseIntDefault(String sentenca) {
		try{
			System.out.print(sentenca);
			return scan.nextInt();
		}catch(Exception e){return -1;}
	}
	
	public static boolean printResponseBoolean(String sentenca) {
		try{
			System.out.print(sentenca);
			return scan.nextBoolean();
		}catch(Exception e){return false;}
	}
		
}
