
package Compiladorcito;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Juda & Paulina
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/src/Compiladorcito/Lexer.flex";
        String ruta2 = "C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/src/Compiladorcito/Lexer.flex";
        String [] rutaS = {"-parser", "Sintax", "C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/src/Compiladorcito/Sintax.cup"};
        generar(ruta2, rutaS);
    }
    
    public static void generar(String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        
        Path rutaSym = Paths.get("C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/src/Compiladorcito/sym.java");
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/sym.java"), 
                Paths.get("C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/src/Compiladorcito/sym.java")
        );
        
        Path rutaSin = Paths.get("C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/src/Compiladorcito/Sintax.java");
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
        
        Files.move(
                Paths.get("C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/Sintax.java"), 
                Paths.get("C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/src/Compiladorcito/Sintax.java")
        );
    }
}
