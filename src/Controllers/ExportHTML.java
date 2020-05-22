package Controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import Models.HTMLArchive;

/**
 * 
 * Classe controladora resposável por exportar os arquivos .Html
 * 
 * @version 1.0.0
 * @author Fernando Geraldo Nogueira
 *
 */

public class ExportHTML {
	public static void SetHtmlArchive(HTMLArchive html) throws IOException {
		String path = new File("../Scaffolding/src/files/" + html.getPath() + html.getArchiveName()).getCanonicalPath();
		PrintWriter pw = new PrintWriter(new FileOutputStream(path + ".html"));
		pw.write(html.getHTML());
		pw.flush();
		pw.close();
	}
}
