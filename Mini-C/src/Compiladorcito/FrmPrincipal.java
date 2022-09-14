package Compiladorcito;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.Lexer;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Juda & Paulina
 */
public class FrmPrincipal extends javax.swing.JFrame {

    NumeroLinea numerolinea;

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btn_archivo = new javax.swing.JButton();
        btn_compilar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_sin = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_resultado = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Compilar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 150, 30));

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

        txt_sin.setEditable(false);
        txt_sin.setBackground(new java.awt.Color(0, 0, 0));
        txt_sin.setColumns(20);
        txt_sin.setRows(5);
        txt_sin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setViewportView(txt_sin);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 770, 270));

        txt_resultado.setColumns(20);
        txt_resultado.setRows(5);
        jScrollPane1.setViewportView(txt_resultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 760, 320));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MINI-C Compiler");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargar codigo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, 30));

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

    private void btn_archivoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_archivoActionPerformed

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
                numerolinea = new NumeroLinea(txt_resultado);
                jScrollPane1.setRowHeaderView(numerolinea);
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
            JOptionPane.showMessageDialog(null, "" + "\nNo se ha encontrado el archivo", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

     private void btn_compilarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_compilarActionPerformed

        txt_sin.setText("");
        int contErrors = 0;
        String longitud = txt_resultado.getText();
        if (!longitud.isEmpty()) {
            LexerCup lexer;
            parser p = null;

            try {
                long startTime = System.currentTimeMillis();
                String ST = txt_resultado.getText();
                lexer = new LexerCup((new StringReader(ST)));
                p = new parser(lexer);
                p.parse();

                if (lexer.erroresLexicos.isEmpty() && p.errores.isEmpty()) {
                    txt_sin.append("Analizando léxico..." + "\n");
                    txt_sin.append("No se encontraron errores léxicos" + "\n");
                    txt_sin.append("Analizando sintaxis..." + "\n");
                    txt_sin.append("No se encontraron errores sintácticos" + "\n");
                    txt_sin.append("\n");
                    long endTime = System.currentTimeMillis() - startTime; // tiempo en que se ejecuta su método
                    txt_sin.append("Compiliación finalizada con 0 errores, tiempo total: " + endTime + "ms\n");
//                    String formato = "edge [color=purple];" + hacerDFS(p.raiz);
//                    p.raiz.exportarArbol(formato, "AST");
//                    JOptionPane.showMessageDialog(this, "Árbol generado de forma satisfactoria");
                      txt_sin.setForeground(Color.green);
                } else if (lexer.erroresLexicos.isEmpty() && !(p.errores.isEmpty())) {
                    txt_sin.append("Analizando léxico..." + "\n");
                    txt_sin.append("No se encontraron errores léxicos" + "\n");
                    txt_sin.append("Analizando sintaxis..." + "\n");
                    txt_sin.append("Se encontraron errores sintácticos" + "\n");
                    txt_sin.append("\n");
                    for (int i = 0; i < p.errores.size(); i++) {
                        System.out.println(p.errores.get(i));
                        txt_sin.append(p.errores.get(i).toString() + "\n");
                        txt_sin.setForeground(Color.red);
                    }
                    contErrors += p.errores.size() / 2;
                    long endTime = System.currentTimeMillis() - startTime; // tiempo en que se ejecuta su método
                    txt_sin.append("\n");
                    if (contErrors == 1) {
                        txt_sin.append("Compiliación fallida con: " + contErrors + " error, tiempo total: " + endTime + "ms\n");
                    } else {
                        txt_sin.append("Compiliación fallida con: " + contErrors + " errores, tiempo total: " + endTime + "ms\n");
                    }
                    txt_sin.setForeground(Color.red);

                } else if (!(lexer.erroresLexicos.isEmpty()) && p.errores.isEmpty()) {
                    txt_sin.append("Analizando léxico..." + "\n");
                    txt_sin.append("Se encontraron errores léxicos" + "\n");
                    for (int i = 0; i < lexer.erroresLexicos.size(); i++) {
                        txt_sin.append(lexer.erroresLexicos.get(i) + "\n");
                        txt_sin.setForeground(Color.red);
                        contErrors++;
                    }
                    txt_sin.append("Analizando sintaxis..." + "\n");
                    txt_sin.append("No se encontraron errores sintácticos" + "\n");
                    txt_sin.append("\n");
                    long endTime = System.currentTimeMillis() - startTime; // tiempo en que se ejecuta su método
                    txt_sin.append("\n");
                    if (contErrors == 1) {
                        txt_sin.append("Compiliación fallida con: " + contErrors + " error, tiempo total: " + endTime + "ms\n");
                    } else {
                        txt_sin.append("Compiliación fallida con: " + contErrors + " errores, tiempo total: " + endTime + "ms\n");
                    }
                    txt_sin.setForeground(Color.red);

                } else if (!(lexer.erroresLexicos.isEmpty()) && !(p.errores.isEmpty())) {
                    txt_sin.append("Analizando léxico..." + "\n");
                    txt_sin.append("Se encontraron errores léxicos" + "\n");
                    for (int i = 0; i < lexer.erroresLexicos.size(); i++) {
                        txt_sin.append(lexer.erroresLexicos.get(i) + "\n");
                        txt_sin.setForeground(Color.red);
                        contErrors++;
                    }
                    txt_sin.append("Analizando sintaxis..." + "\n");
                    txt_sin.append("Se encontraron errores sintácticos" + "\n");
                    for (int i = 0; i < p.errores.size(); i++) {
                        System.out.println(p.errores.get(i));
                        txt_sin.append(p.errores.get(i).toString() + "\n");
                        txt_sin.setForeground(Color.red);

                    }
                    contErrors += p.errores.size() / 2;
                    long endTime = System.currentTimeMillis() - startTime; // tiempo en que se ejecuta su método
                    txt_sin.append("\n");
                    if (contErrors == 1) {
                        txt_sin.append("Compiliación fallida con: " + contErrors + " error, tiempo total: " + endTime + "ms\n");
                    } else {
                        txt_sin.append("Compiliación fallida con: " + contErrors + " errores, tiempo total: " + endTime + "ms\n");
                    }
                    txt_sin.setForeground(Color.red);
                }
                txt_sin.append("\n");

            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Symbol sym = p.getS();
                System.out.println("error en columna " + (sym.right) + " fila: " + (sym.left) + ", texto: " + sym.toString());
                txt_sin.setForeground(Color.green);
            }
        } else {
            JOptionPane.showMessageDialog(this, "no se ha cargado algun archivo o escrito código");
        }

    }// GEN-LAST:event_btn_compilarActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    public String hacerDFS(Nodo node) {
        ArrayList<String> recorrido = new ArrayList<>();
        DFS(node, recorrido);
        DFSAristas(node, node.getIdNodo(), recorrido);
        String formato = "";
        for (int i = 0; i < recorrido.size(); i++) {
            formato += recorrido.get(i);
        }
        return formato;
    }

    public void DFS(Nodo node, ArrayList<String> recorrido) {
        if (!node.getEtiqueta().equals("VACIO")) {
            System.out.println(node.toString());
            recorrido.add(node.toString());
        }
        for (int i = 0; i < node.getHijos().size(); i++) {
            DFS(node.getHijos().get(i), recorrido);
        }
    }

    public void DFSAristas(Nodo node, int padre, ArrayList<String> recorrido) {
        if (node.getIdNodo() != padre) {
            if (!node.getEtiqueta().equals("VACIO")) {
                recorrido.add(padre + "->" + node.getIdNodo() + ";");
            }
        }
        for (int i = 0; i < node.getHijos().size(); i++) {
            DFSAristas(node.getHijos().get(i), node.getIdNodo(), recorrido);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_archivo;
    private javax.swing.JButton btn_compilar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_resultado;
    private javax.swing.JTextArea txt_sin;
    // End of variables declaration//GEN-END:variables
    boolean codigoabierto = true;
    File archivo = new File("C:\\Users\\Juda\\Desktop\\Mini-C_ProyectoCompiladores\\Mini-C\\Pruebas\\printf.txt");
    /*
     * comandos para ejectutar
     * jflex LexerCup.flex
     * java -jar java-cup-11a.jar Sintax.cup
     * 
     */
}
