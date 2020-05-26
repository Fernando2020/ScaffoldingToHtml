package Controllers;

import Composite.Component;
import Enum.ComponentEnum;
import FactoryAndFlyheight.ComponentFactory;

/****
 * Classe resposável pelo controle geral da criação e composição dos components
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */
public class GeneralController {

	private static void addGeneralElements(Component father, Component children){
		try {
			father.add(children);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getGeneralElements(Component father, ComponentEnum el, String id, String classe){
		addGeneralElements(father, ComponentFactory.getComponent(el, id, classe));
	}
	
	public static ComponentEnum getEnum(int select){
		switch (select) {
		case 1:
			return ComponentEnum.A;
		case 2:
			return ComponentEnum.BODY;
		case 3:
			return ComponentEnum.BUTTON;
		case 4:
			return ComponentEnum.DIV;
		case 5:
			return ComponentEnum.FOOTER;
		case 6:
			return ComponentEnum.FORM;
		case 7:
			return ComponentEnum.H1;
		case 8:
			return ComponentEnum.H2;
		case 9:
			return ComponentEnum.H3;
		case 10:
			return ComponentEnum.H4;
		case 11:
			return ComponentEnum.HEADER;
		case 12:
			return ComponentEnum.HTMLArchive;
		case 13:
			return ComponentEnum.IMG;
		case 14:
			return ComponentEnum.INPUT;
		case 15:
			return ComponentEnum.LABEL;
		case 16:
			return ComponentEnum.OPTION;
		case 17:
			return ComponentEnum.P;
		case 18:
			return ComponentEnum.SELECT;
		case 19:
			return ComponentEnum.SIDEBAR;
		case 20:
			return ComponentEnum.TABLE;
		case 21:
			return ComponentEnum.TD;
		case 22:
			return ComponentEnum.TEXTAREA;
		case 23:
			return ComponentEnum.TH;
		case 24:
			return ComponentEnum.TR;
		default:
			return null;
		}
	}
	
}
