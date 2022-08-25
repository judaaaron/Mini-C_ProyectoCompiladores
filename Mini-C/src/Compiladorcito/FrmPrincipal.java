/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compiladorcito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static Compiladorcito.Tokens.*;
import java.awt.Color;
import java_cup.runtime.Symbol;
import javax.swing.JOptionPane;

/**
 *
 * @author Juda
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setResizable(false);
        setTitle("MINI-C");
        this.pack();
        this.setLocationRelativeTo(null);

    }

    private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) txt_resultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\t\tRepresentación\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txt_lex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case INT:
                    resultado += " Se indetificó el token: <int>\t\t" + lexer.lexeme + "\n";
                    break;
                case IF:
                    resultado += " Se indetificó el token: <if>\t\t" + lexer.lexeme + "\n";
                    break;
                case ELSE:
                    resultado += " Se indetificó el token: <else>\t\t" + lexer.lexeme + "\n";
                    break;
                case BREAK:
                    resultado += " Se indetificó el token: <break>\t\t" + lexer.lexeme + "\n";
                    break;
                case WHILE:
                    resultado += " Se indetificó el token: <while>\t\t" + lexer.lexeme + "\n";
                    break;
                case PRINTF:
                    resultado += " Se indetificó el token función: <printf>\t" + lexer.lexeme + "\n";
                    break;
                case SCANF:
                    resultado += " Se indetificó el token función: <scanf>\t" + lexer.lexeme + "\n";
                    break;
                case FOR:
                    resultado += " Se indetificó el token: <for>\t\t" + lexer.lexeme + "\n";
                    break;
                case RETURN:
                    resultado += " Se indetificó el token: <return>\t\t" + lexer.lexeme + "\n";
                    break;
                case ASIGNACION:
                    resultado += " Se indetificó el token: <asignacion> \t" + lexer.lexeme + "\n";
                    break;
                case TERNARIO:
                    resultado += " Se indetificó el token operador: <ternario>\t" + lexer.lexeme + "\n";
                    break;
                case NUMEROS:
                    resultado += " Se indetificó número de tipo: <entero>\t" + lexer.lexeme + "\n";
                    break;
                case OPADICION:
                    resultado += " Se indetificó el token operador: <suma/resta>\t" + lexer.lexeme + "\n";
                    break;
                case OPMULTI:
                    resultado += " Se indetificó el token operador: <mul/div>\t" + lexer.lexeme + "\n";
                    break;
                case OPREL:
                    resultado += " Se indetificó el token operador: <logico>\t" + lexer.lexeme + "\n";
                    break;
                case INCREMENT:
                    resultado += " Se indetificó el token : <autoincremento>\t" + lexer.lexeme + "\n";
                    break;
                case DECREMENT:
                    resultado += " Se indetificó el token: <autodecremento>\t" + lexer.lexeme + "\n";
                    break;
                case PARENTESISIZ:
                    resultado += " Se indetificó el token: <parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case PARENTESISDE:
                    resultado += " Se indetificó el token: <parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case LLAVEIZ:
                    resultado += " Se indetificó el token: <llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case LLAVEDER:
                    resultado += " Se indetificó el token: <llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case INTP:
                    resultado += " Se indetificó el token: <puntero de enteros>\t" + lexer.lexeme + "\n";
                    break;
                case CHARP:
                    resultado += " Se indetificó el token: <puntero de chars>\t" + lexer.lexeme + "\n";
                    break;
                case MAIN:
                    resultado += " Se indetificó el token: <main>\t\t" + lexer.lexeme + "\n";
                    break;
                case AND:
                    resultado += " Se indetificó el token operador logico: <and>\t" + lexer.lexeme + "\n";
                    break;
                case OR:
                    resultado += " Se indetificó el token operador logico: <or>\t" + lexer.lexeme + "\n";
                    break;
                case PUNTOCOMA:
                    resultado += " Se indetificó el token: <punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case DOSPUNTOS:
                    resultado += " Se indetificó el token: <dos puntos>\t" + lexer.lexeme + "\n";
                    break;
                case ID:
                    resultado += " Se indetificó el token: <identificador>\t" + lexer.lexeme + "\n";
                    break;
                case COMA:
                    resultado += " Se indetificó el token: <coma>\t" + lexer.lexeme + "\n";
                    break;
                case PORCENTAJED:
                    resultado += " Se indetificó el token: <conststr int>\t" + lexer.lexeme + "\n";
                    break;
                case PORCENTAJEC:
                    resultado += " Se indetificó el token: <conststr char>\t" + lexer.lexeme + "\n";
                    break;
                case COMILLA:
                    resultado += " Se indetificó el token: <comilla simple>\t" + lexer.lexeme + "\n";
                    break;
                case COMILLAS:
                    resultado += " Se indetificó el token: <comilla doble>\t" + lexer.lexeme + "\n";
                    break;
                case LETRAS:
                    resultado += " Se indetificó un caracter:\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btn_archivo = new javax.swing.JButton();
        btn_compilar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_lex = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_sin = new javax.swing.JTextArea();
        btn_analizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_resultado = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Analisis Sintáctico");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 150, 30));

        btn_archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/code.png"))); // NOI18N
        btn_archivo.setContentAreaFilled(false);
        btn_archivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/code (1).png"))); // NOI18N
        btn_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_archivoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 40, 330, 60));

        btn_compilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compilador (2).png"))); // NOI18N
        btn_compilar.setContentAreaFilled(false);
        btn_compilar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compilador (3).png"))); // NOI18N
        btn_compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compilarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_compilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 200, 70));

        txt_lex.setEditable(false);
        txt_lex.setColumns(20);
        txt_lex.setRows(5);
        jScrollPane3.setViewportView(txt_lex);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 390, 330));

        txt_sin.setEditable(false);
        txt_sin.setColumns(20);
        txt_sin.setRows(5);
        jScrollPane2.setViewportView(txt_sin);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 770, 270));

        btn_analizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_analizar.setContentAreaFilled(false);
        btn_analizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search (1).png"))); // NOI18N
        btn_analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_analizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 160, 60));

        txt_resultado.setColumns(20);
        txt_resultado.setRows(5);
        jScrollPane1.setViewportView(txt_resultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 330, 330));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Analisis Lexico");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 150, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MINI-C Compiler");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargar codigo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 800, 590));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 790, 320));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cargar codigo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_archivoActionPerformed

        txt_resultado.setText("");
        JFileChooser chooser = new JFileChooser("./Pruebas");
        chooser.showOpenDialog(this);
        String ruta = chooser.getSelectedFile().getAbsolutePath();
        File archivo = new File(ruta);
        archivo = chooser.getSelectedFile();
        String texto = "", aux = "", ant = "";
        boolean flag = true;
        if (archivo != null) {
            FileReader archivos = null;
            try {
                archivos = new FileReader(archivo);
            } catch (FileNotFoundException ex) {
            }
            BufferedReader lee = new BufferedReader(archivos);
            try {
                while ((aux = lee.readLine()) != null) {
                    if (flag) {
                        flag = false;
                    } else {
                        texto += ant + "\n";
                    }
                    ant = aux;
                }

                texto += ant;

                txt_resultado.setText(texto);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo" + ex);
            }
            try {
                lee.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo" + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "" + "\nNo se ha encontrado el archivo", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_archivoActionPerformed

    private void btn_compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compilarActionPerformed

//        // TODO add your handling code here:
        String ST = txt_resultado.getText();
        Sintax s = new Sintax(new Compiladorcito.LexerCup(new StringReader(ST)));

        try {
            s.parse();
            txt_sin.setText("Analisis realizado correctamente");
            txt_sin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txt_sin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txt_sin.setForeground(Color.red);
        }


    }//GEN-LAST:event_btn_compilarActionPerformed

    private void btn_analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analizarActionPerformed

        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_analizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_analizar;
    private javax.swing.JButton btn_archivo;
    private javax.swing.JButton btn_compilar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txt_lex;
    private javax.swing.JTextArea txt_resultado;
    private javax.swing.JTextArea txt_sin;
    // End of variables declaration//GEN-END:variables
}
