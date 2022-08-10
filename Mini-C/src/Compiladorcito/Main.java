/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compiladorcito;

import java.io.File;

/**
 *
 * @author Juda
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
