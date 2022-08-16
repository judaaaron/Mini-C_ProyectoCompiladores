
package Compiladorcito;

import java.io.File;

/**
 *
 * @author Juda & Paulina
 */
public class Main {
    public static void main(String[] args) {
        String ruta = "C:/Users/Juda/Desktop/Mini-C_ProyectoCompiladores/Mini-C/src/Compiladorcito/Lexer.flex";
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
