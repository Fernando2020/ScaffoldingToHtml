package Controllers;

import Enum.ComponentEnum;
import FactoryAndFlyheight.ComponentFactory;
import Models.A;
import Models.BODY;
import Models.DIV;
import Models.FOOTER;
import Models.HEADER;
import Models.HTMLArchive;
import Models.IMG;
import Models.SIDEBAR;
import Models.TABLE;
import Models.TD;
import Models.TH;
import Models.TR;
import Views.Dialogue;

/**
 * 
 * Classe controladora resposável por controlar o Diálogo do usuário com a
 * máquina
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class DialogueController {

	public static void start(){

		
		HTMLArchive html = (HTMLArchive)ComponentFactory.getComponent(ComponentEnum.HTMLArchive, null, null);
		html.setArchiveName("edit");
		
		HEADER header = (HEADER)ComponentFactory.getComponent(ComponentEnum.HEADER, null, null);
		header.setDescription("Redes Sociais");
		SIDEBAR sidebar = (SIDEBAR)ComponentFactory.getComponent(ComponentEnum.SIDEBAR, null, null);
		A a1 = (A)ComponentFactory.getComponent(ComponentEnum.A, "a1", null);
		a1.setDescription("GOOGLE");
		a1.setHref("http://www.google.com.br/");
		a1.setTarget(true);
		A a2 = (A)ComponentFactory.getComponent(ComponentEnum.A, "a2", null);
		a2.setDescription("FACEBOOK");
		a2.setHref("http://www.facebook.com.br/");
		a2.setTarget(true);
		sidebar.add(a1);
		sidebar.add(a2);
		BODY body = (BODY)ComponentFactory.getComponent(ComponentEnum.BODY, null, null);
		IMG img = (IMG)ComponentFactory.getComponent(ComponentEnum.IMG, null, null);
		img.setSrc("https://cristianethiel.com.br/wp-content/uploads/2017/12/Como-Escolher-a-Melhor-Rede-Social-para-o-seu-Neg%C3%B3cio-Featured-750x515.png");
		img.setHeight("300px");
		img.setWidth("100%");
		DIV div0 = (DIV)ComponentFactory.getComponent(ComponentEnum.DIV, "div0", "row");
		DIV div1 = (DIV)ComponentFactory.getComponent(ComponentEnum.DIV, "div1", "col-md-6");
		div1.add(img);
		DIV div2 = (DIV)ComponentFactory.getComponent(ComponentEnum.DIV, "div2", "col-md-6");
		TABLE table = (TABLE)ComponentFactory.getComponent(ComponentEnum.TABLE, null, null);
		
		table.setBorder("1");
		
		TR trh1 = (TR)ComponentFactory.getComponent(ComponentEnum.TR, "trh1", null);
		TH th1 = (TH)ComponentFactory.getComponent(ComponentEnum.TH, "th1", null);
		th1.setDescription("IDADE");
		TH th2 = (TH)ComponentFactory.getComponent(ComponentEnum.TH, "th2", null);
		th2.setDescription("NOME");
		trh1.add(th1);
		trh1.add(th2);
		
		TR trd1 = (TR)ComponentFactory.getComponent(ComponentEnum.TR, "trd1", null);
		TD td1 = (TD)ComponentFactory.getComponent(ComponentEnum.TD, "th1", null);
		td1.setDescription("10");
		TD td2 = (TD)ComponentFactory.getComponent(ComponentEnum.TD, "th2", null);
		td2.setDescription("José Carlos");
		trd1.add(td1);
		trd1.add(td2);
		TR trd2 = (TR)ComponentFactory.getComponent(ComponentEnum.TR, "trd2", null);
		TD td3 = (TD)ComponentFactory.getComponent(ComponentEnum.TD, "th3", null);
		td3.setDescription("15");
		TD td4 = (TD)ComponentFactory.getComponent(ComponentEnum.TD, "th4", null);
		td4.setDescription("Manuel Da Silva");
		trd2.add(td3);
		trd2.add(td4);

		table.add(trh1);
		table.add(trd1);
		table.add(trd2);
		
		TABLE tableFlyheight = (TABLE)ComponentFactory.getComponent(ComponentEnum.TABLE, null, null);
		
		div2.add(table);
		div2.add(tableFlyheight);
		
		
		div0.add(div1);
		div0.add(div2);
		
		body.add(div0);
		
		FOOTER footer = (FOOTER)ComponentFactory.getComponent(ComponentEnum.FOOTER, null, null);
		footer.setDescription("By: Fernando");
		
		html.add(header);
		html.add(sidebar);
		html.add(body);
		html.add(footer);
		
		Dialogue.prints(html.getHTML());
		
		try{
			ExportHTML.SetHtmlArchive(html);
		}catch(Exception e){
			Dialogue.prints(e.getMessage().toString());
		}
	}
}
