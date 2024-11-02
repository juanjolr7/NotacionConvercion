package interfaz;


import com.formdev.flatlaf.FlatDarculaLaf;
//import compilerTools.CodeBlock;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//import compilerTools.Directory;
//import compilerTools.ErrorLSSL;
//import compilerTools.Functions;
//import compilerTools.Grammar;
//import compilerTools.Production;
//import compilerTools.TextColor;
//import compilerTools.Token;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import javax.swing.Timer;

/**
 *
 * @author yisus
 */
public class Compilador extends javax.swing.JFrame {

    private String title;
//    private Directory directorio;
//    private ArrayList<Token> tokens;
//    private ArrayList<ErrorLSSL> errors;
//    private ArrayList<TextColor> textsColor;
    private Timer timerKeyReleased;
//    private ArrayList<Production> identProd;
    private HashMap<String, String> identificadores;
    private boolean codeHasBeenCompiled = false;

    /**
     * Creates new form Compilador
     */
    public Compilador() {
        initComponents();
        init();
    }

    private void init() {
        title = "Compilador de Java";
        setLocationRelativeTo(null);
        setTitle(title);
//        directorio = new Directory(this, jtpCode, title, ".java");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                directorio.Exit();
                System.exit(0);
            }
        });
//        Functions.setLineNumberOnJTextComponent(jtpCode);
//        timerKeyReleased = new Timer((int) (1000 * 0.3), (ActionEvent e) -> {
//            timerKeyReleased.stop();
//            //colorAnalysis();
//        });
//        Functions.insertAsteriskInName(this, jtpCode, () -> {
//            timerKeyReleased.restart();
//        });
//        Functions.insertAsteriskInName(this, jtpCode);
//        tokens = new ArrayList<>();
//        errors = new ArrayList<>();
//        textsColor = new ArrayList<>();
//        identProd = new ArrayList<>();
//        identificadores = new HashMap<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        panelButtonCompilerExecute = new javax.swing.JPanel();
        btnCompilar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOutputConsole = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaOutputConsole1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jtpCode.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtpCode);

        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonCompilerExecuteLayout = new javax.swing.GroupLayout(panelButtonCompilerExecute);
        panelButtonCompilerExecute.setLayout(panelButtonCompilerExecuteLayout);
        panelButtonCompilerExecuteLayout.setHorizontalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnCompilar)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelButtonCompilerExecuteLayout.setVerticalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(btnCompilar))
        );

        jtaOutputConsole.setEditable(false);
        jtaOutputConsole.setBackground(new java.awt.Color(70, 73, 75));
        jtaOutputConsole.setColumns(20);
        jtaOutputConsole.setForeground(new java.awt.Color(255, 255, 255));
        jtaOutputConsole.setRows(5);
        jScrollPane2.setViewportView(jtaOutputConsole);

        jtaOutputConsole1.setEditable(false);
        jtaOutputConsole1.setBackground(new java.awt.Color(70, 73, 75));
        jtaOutputConsole1.setColumns(20);
        jtaOutputConsole1.setForeground(new java.awt.Color(255, 255, 255));
        jtaOutputConsole1.setRows(5);
        jScrollPane4.setViewportView(jtaOutputConsole1);

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(223, 223, 223))
        );

        getContentPane().add(rootPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        //        if (getTitle().contains("*") || getTitle().equals(title)) {
            //            if (directorio.Save()) {
                //                compile();
                //            }
            //        } else {
            //            compile();
            //        }
    }//GEN-LAST:event_btnCompilarActionPerformed



//    private void compile() {
//        clearFields();
//        lexicalAnalysis();
//        fillTableTokens();
//        syntacticAnalysis();
//       // semanticAnalysis();
//        printConsole();
//        codeHasBeenCompiled = true;
//    }

//    private void lexicalAnalysis() {
//        Lexer lexer;
//        try {
//            File codigo = new File("code.encrypter");
//            FileOutputStream output = new FileOutputStream(codigo);
//            byte[] bytesText = jtpCode.getText().getBytes();
//            output.write(bytesText);
//            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
//            lexer = new Lexer(entrada);
//            while (true) {
//                Token token = lexer.yylex();
//                if (token == null) {
//                    break;
//                }
//                tokens.add(token);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
//        }
//    }
    
//    private void syntacticAnalysis() {
//        Grammar gramatica = new Grammar(tokens, errors);
//        gramatica.delete(new String[]{"ERROR"}, 1);
//        
//
//        //Declaración de Variables
////        gramatica.group("VARIABLE_ENTERA","PALABRA_RESERVADA:INT IDENTIFICADOR DELIMITADOR:PUNTO_COMA",true);
//          gramatica.group("VARIABLE_ENTERA","PALABRA_RESERVADA:INT IDENTIFICADOR OPERADOR_ASIGNACION:ASIGNACION_SIMPLE NUMERO DELIMITADOR:PUNTO_COMA",true);
////        //Errores
////        gramatica.group("VARIABLE_ENTERA","PALABRA_RESERVADA:INT IDENTIFICADOR",true,2
////        ,"error sintáctico: falta el delimitador ; [#,%]");
//        
//        gramatica.show();
//    }
   

 


//    private void fillTableTokens() {
//        tokens.forEach(token -> {
//            Object[] data = new Object[]{token.getLexicalComp(), token.getLexeme(), "[" + token.getLine() + ", " + token.getColumn() + "]"};
//            
//            if(!token.getLexeme().equals("OPERADOR_ARITMETICO")&&!token.getLexeme().equals("OPERADOR_RELACIONAL")&&
//                   !token.getLexeme().equals("OPERADOR_LOGICO") && !token.getLexeme().equals("OPERADOR_ASIGNACION")&&
//                    !token.getLexeme().equals("DELIMITADOR")){
//            Functions.addRowDataInTable(tblTokens, data);
//            }
//        });
//    }

//    private void printConsole() {
//        int sizeErrors = errors.size();
//        if (sizeErrors > 0) {
//            Functions.sortErrorsByLineAndColumn(errors);
//            String strErrors = "\n";
//            for (ErrorLSSL error : errors) {
//                String strError = String.valueOf(error);
//                strErrors += strError + "\n";
//            }
//            jtaOutputConsole.setText("Compilación terminada...\n" + strErrors + "\nLa compilación terminó con errores...");
//        } else {
//            jtaOutputConsole.setText("Compilación terminada...");
//        }
//        jtaOutputConsole.setCaretPosition(0);
//    }

//    private void clearFields() {
//        Functions.clearDataInTable(tblTokens);
//        jtaOutputConsole.setText("");
//        tokens.clear();
//        errors.clear();
//        identProd.clear();
//        identificadores.clear();
//        codeHasBeenCompiled = false;
//    }

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
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatDarculaLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("LookAndFeel no soportado: " + ex);
            }
            new Compilador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompilar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jtaOutputConsole;
    private javax.swing.JTextArea jtaOutputConsole1;
    private javax.swing.JTextPane jtpCode;
    private javax.swing.JPanel panelButtonCompilerExecute;
    private javax.swing.JPanel rootPanel;
    // End of variables declaration//GEN-END:variables
}
