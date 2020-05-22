package FactoryAndFlyheight;

import java.util.HashMap;
import Composite.Component;
import Enum.ComponentEnum;
import Models.A;
import Models.BODY;
import Models.BUTTON;
import Models.DIV;
import Models.FOOTER;
import Models.FORM;
import Models.H1;
import Models.H2;
import Models.H3;
import Models.H4;
import Models.HEADER;
import Models.HTMLArchive;
import Models.IMG;
import Models.INPUT;
import Models.LABEL;
import Models.OPTION;
import Models.P;
import Models.SELECT;
import Models.SIDEBAR;
import Models.TABLE;
import Models.TD;
import Models.TEXTAREA;
import Models.TH;
import Models.TR;

/**
 * 
 * Classe resposável por fabricar e controlar as instâncias dos componentes,
 * também possui a responsabilidade do flyheight, não permitindo um objeto com
 * as mesmas características de um componente ja existente seja criado.
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class ComponentFactory {

	private static HashMap<String, Component> flyheight = new HashMap<String, Component>();

	public static Component getComponent(ComponentEnum e, String id, String classe) {
		if (e.equals(ComponentEnum.A)) {
			A element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new A();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.BODY)) {
			BODY element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new BODY();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.BUTTON)) {
			BUTTON element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new BUTTON();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.DIV)) {
			DIV element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new DIV();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.FOOTER)) {
			FOOTER element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new FOOTER();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.FORM)) {
			FORM element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new FORM();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.H1)) {
			H1 element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new H1();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.H2)) {
			H2 element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new H2();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.H3)) {
			H3 element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new H3();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.H4)) {
			H4 element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new H4();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.HEADER)) {
			HEADER element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new HEADER();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.HTMLArchive)) {
			HTMLArchive element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new HTMLArchive();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.IMG)) {
			IMG element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new IMG();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.INPUT)) {
			INPUT element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new INPUT();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.LABEL)) {
			LABEL element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new LABEL();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.OPTION)) {
			OPTION element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new OPTION();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.P)) {
			P element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new P();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.SELECT)) {
			SELECT element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new SELECT();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.SIDEBAR)) {
			SIDEBAR element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new SIDEBAR();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.TABLE)) {
			TABLE element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new TABLE();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.TD)) {
			TD element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new TD();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.TEXTAREA)) {
			TEXTAREA element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new TEXTAREA();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.TH)) {
			TH element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new TH();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		if (e.equals(ComponentEnum.TR)) {
			TR element = null;
			if (flyheight.containsKey(e.toString() + id + classe)) {
				return flyheight.get(e.toString() + id + classe);
			} else {
				element = new TR();
				element.setClasse(classe);
				element.setId(id);
				flyheight.put(e.toString() + id + classe, element);
				return element;
			}
		}
		return null;
	}

}
