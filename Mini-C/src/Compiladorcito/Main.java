
package Compiladorcito;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Juda & Paulina
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String ruta1 = "./src/Compiladorcito/Lexer.flex";//la ruta es absoluta, pero cuando la intentamos hacer relativa y no funciona
        String ruta2 = "./src/Compiladorcito/LexerCup.flex";
        String[] rutaS = { "-parser", "Sintax",
                "./src/Compiladorcito/Sintax.cup" };
        generar(ruta1, ruta2, rutaS);
    }

    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths
                .get("./src/Compiladorcito/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("./sym.java"),
                Paths.get("./src/Compiladorcito/sym.java"));

        Path rutaSin = Paths.get("./src/Compiladorcito/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }

        Files.move(
                Paths.get("./Sintax.java"),
                Paths.get("./src/Compiladorcito/Sintax.java"));
    }
}
