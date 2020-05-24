package Controllers;

import Enum.ComponentEnum;
import FactoryAndFlyheight.ComponentFactory;
import Models.HTMLArchive;
import Views.Dialogue;

/**
 * 
 * Classe controladora respos�vel por controlar o Di�logo do usu�rio com a
 * m�quina
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class DialogueController {
	
	private HTMLArchive html;
			
	public void start(){
		html = (HTMLArchive)ComponentFactory.getComponent(ComponentEnum.HTMLArchive, "html1", "");
		Dialogue.print(html.getHTML());
		try{
			ExportHTML.SetHtmlArchive(html);
			Dialogue.print("Arquivo "+html.getArchiveName()+".html gerado com sucesso");
		}catch(Exception e){
			Dialogue.print(e.getMessage().toString());
		}
	}
}
