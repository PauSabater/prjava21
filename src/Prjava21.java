
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Pau s
 */
public class Prjava21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write(" <h1>DAW2 m08uf4pr2</h1>");bw.newLine();
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Nova p&agrave;gina  web");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    Nova p&agrave;gina web");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
} } 
    
}
