/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.List;

/**
 *
 * @author jmartinez
 * @date 25-oct-2018
 */
public class ISBNFrame extends javax.swing.JFrame {

    CalculatorCode calCode = new CalculatorCode();
    /**
     * Creates new form ISBNFrame
     */
    public ISBNFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        resultados = new javax.swing.JLabel();
        messageOut = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ISBN");
        setBackground(new java.awt.Color(255, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VALIDADOR ISBN");

        jLabel2.setText("Inserte 10 digitos del código de barra ISBN-10 que desea verificar.Ej.: 9856320147");

        jTextField1.setColumns(10);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Si desea calcular el valor de la i-ésima posición, remplácela por K. Ej.: 985632K147");

        volver.setLabel("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel4.setText("Ing. Jhon Mario Martínez | Universidad del Norte | 2018");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultados)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton1))
                            .addComponent(messageOut, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volver)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addComponent(messageOut)
                .addGap(122, 122, 122)
                .addComponent(resultados)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        resultados.getAccessibleContext().setAccessibleName("resultados");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * Evalua que el numero de caracteres ingresados no sea mayor a 10
     * @param evt 
     */    
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        int maxNumeber = 10;
        if (jTextField1.getText().length() == maxNumeber) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped
    /**
     * hace llamdo al método checkISBN
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        checkISBN();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new MainFrame().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    
    /**
     * Permite realizar el calculo del codigo ingresado por el usuario
     */
    private void checkISBN() {
        String cod10 = jTextField1.getText().toUpperCase();        
        String strRta = "<html><strong>";
       
        if (cod10.length() != 10) {
            strRta += "EL CODIGO INGRESADO NO TIENE 10 CARACTERES";       
        } else {
            int tNumber = 0;
            int tX = 0;
            for (int i = 0; i < (cod10.length() - 1); i++) {
                if (Character.isDigit(cod10.charAt(i))) {
                    tNumber++;
                } else if (Character.isLetter(cod10.charAt(i)) && cod10.toUpperCase().charAt(i) == 'K') {
                    tX++;
                }
            }
            
            if (Character.isDigit(cod10.charAt(9)) || (Character.isLetter(cod10.charAt(9)) && cod10.toUpperCase().charAt(9) == 'X') ) {
                tNumber++;
            } else if (Character.isLetter(cod10.charAt(9)) && cod10.toUpperCase().charAt(9) == 'K') {
                tX++;
            }
            
            String rta = "";
            if ((tX > 1) || ((tNumber + tX) != 10)) {
                strRta += "EL CODIGO INGRESADO ESTÁ MAL FORMADO, POR FAVOR CORREGIR";
                
            } else if(tNumber == 10){
                rta = calCode.recalcularISBN(cod10);
                
                if (rta.equals(""+cod10.charAt(9)))
                    strRta += "&nbsp;&nbsp;"+cod10+" &rarr; Es un código VÁLIDO";
                
                else{
                    strRta += "El CÓDIGO INSERTADO ESTÁ ERRADO, LAS POSIBLES COMBINACIONES SON: <br>";
                    
                    List<String> listStr = calCode.checkCode(cod10);
                    
                    for(String obj : listStr){
                        if(!cod10.equals(obj.split(":")[2]))
                            strRta += "&nbsp;&nbsp;&nbsp;&nbsp;C"+obj.split(":")[0]+" = "+obj.split(":")[1]+" &rarr; "+obj.split(":")[2]+" <br> ";
                    }
                }
                    
            } else if(tX == 1){
                
                String[] rtaX =  calCode.precisarISBN(cod10).split(":");
                if(rtaX[1].equals("-1")) 
                    strRta += "&nbsp;&nbsp;&nbsp;&nbsp;<span style='color:red;'>C"+rtaX[0]+" no puede ser definido</span> <br>";
                else
                    strRta += "&nbsp;&nbsp;&nbsp;&nbsp;C"+rtaX[0]+" = "+rtaX[1]+" &rarr; "+cod10.toUpperCase().replace('K',rtaX[1].charAt(0))+"<br>";
            }


        }
        strRta += "</strong></html>";
        messageOut.setText(strRta); 
    }

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
            java.util.logging.Logger.getLogger(ISBNFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISBNFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISBNFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISBNFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISBNFrame().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel messageOut;
    private javax.swing.JLabel resultados;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
