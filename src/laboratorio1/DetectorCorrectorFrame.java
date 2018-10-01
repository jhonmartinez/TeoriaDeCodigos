/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author jmartinez
 * @date 25-oct-2018
 */
public class DetectorCorrectorFrame extends javax.swing.JFrame {

     CodingDecoding cdc = new CodingDecoding();
     
    /**
     * Creates new form DetectorCorrector
     */
    public DetectorCorrectorFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setJField(String texto){
        txtCodRecived.setText(texto); 
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        codSend = new javax.swing.JTextField();
        btnSendCod = new javax.swing.JButton();
        txtCodificado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRuido = new javax.swing.JTextField();
        btnRuido = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCodRecived = new javax.swing.JTextField();
        infoRta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CODING & UNCODIG");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TEORIA DE CODIGO");

        volver.setLabel("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese un código de 5 elementos que desee enviar. Ejemplo: 85741");

        codSend.setColumns(5);
        codSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codSendActionPerformed(evt);
            }
        });
        codSend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codSendKeyTyped(evt);
            }
        });

        btnSendCod.setText("Enviar");
        btnSendCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendCodActionPerformed(evt);
            }
        });

        txtCodificado.setEditable(false);
        txtCodificado.setColumns(15);

        jLabel3.setText("Texto codificado, antes de ser enviado");

        txtRuido.setColumns(12);
        txtRuido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRuidoKeyTyped(evt);
            }
        });

        btnRuido.setText("Aplicar Ruido");
        btnRuido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Si desea aplicar ruido, modifique uno de los valores del codigo y presione el botón al lado");

        txtCodRecived.setEditable(false);
        txtCodRecived.setColumns(5);

        jLabel5.setText("Código recibido");

        jLabel6.setText("Ing. Jhon Mario Martínez | Universidad del Norte | 2018");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(180, 180, 180))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(infoRta))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRuido, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(codSend))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(btnSendCod, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(btnRuido, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtCodificado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodRecived, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addComponent(volver))
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRuido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoRta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodRecived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new MainFrame().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void btnRuidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRuidoActionPerformed
       checkRuido();
    }//GEN-LAST:event_btnRuidoActionPerformed

    private void checkRuido(){
        String codCodf = txtCodificado.getText().toUpperCase();
        String codAlt = txtRuido.getText().toUpperCase();
        String strRta = "<html>";
        
        if (codAlt.length() < codCodf.length()){
            strRta += "El ruido aplicado <strong>solo debe modificar un caracter</strong><br>";
            
        }else if(codCodf.equals(codAlt)){
            strRta += "<font color='red'>El código no ha sufrido alteraciones</font><br>";
            
        }else{
           
           String[] tmpRta =  cdc.masterControl(codAlt).split("#");
           strRta += tmpRta[0];
           if(tmpRta.length > 1){
               txtCodRecived.setText(tmpRta[1]); 
           }else
               txtCodRecived.setText("BASURA"); 
             
        }
        
        strRta += "</html>";
        
            
        infoRta.setText(strRta);
    }
   
    private void btnSendCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendCodActionPerformed
         checkDetector();
    }//GEN-LAST:event_btnSendCodActionPerformed

    private void codSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codSendActionPerformed
        
    }//GEN-LAST:event_codSendActionPerformed

    /**
     * Garantiza que el numero de caracteres ingresados no sean superior a 5
     * @param evt 
     */
    private void codSendKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codSendKeyTyped
        int maxNumeber = 5;
        if (codSend.getText().length() == maxNumeber) {
            evt.consume();
        }
    }//GEN-LAST:event_codSendKeyTyped

    /**
     * Verifica que la longitud del ruido sea de 12
     * @param evt 
     */
    private void txtRuidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuidoKeyTyped
        int maxNumeber = 12;
        if (txtRuido.getText().length() == maxNumeber) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRuidoKeyTyped

    /**
     * Logica inicial que verifica el codigo ingresado inicialmente, lo codifica y decodifica
     */
    private void checkDetector(){
        
        String cod10 = codSend.getText().toUpperCase();
        String strRta = "<html>";
        
        if (cod10.length() != 5) {
            strRta += "<strong>EL CODIGO INGRESADO DEBE TENER 5 CARACTERES</strong><br>";       
        }else{ 
            int tNumber = 0;
            int tX = 0;
            for (int i = 0; i < (cod10.length()); i++) {
                if (Character.isDigit(cod10.charAt(i))) {
                    tNumber++;
                } else if (Character.isLetter(cod10.charAt(i))) {
                    tX++;
                }
            }
            
            if (tX > 0){
                strRta += "<strong>DEBE INGRESAR SOLO NÚMEROS</strong><br>";
            }else if (tNumber == 5){
                
                String codCodificado = cdc.generarCodigo(cod10);
                txtCodificado.setText(codCodificado); 
                txtRuido.setText(codCodificado);
                String codDecodificado = cdc.decodificar(codCodificado);
                txtCodRecived.setText(codDecodificado); 
                strRta += "EL MENSAJE RECIBIDO NO SUFRIO RUIDO EN LA COMUNICACIÓN";
                
            }
            
        }
        
        strRta += "</html>";
        
        infoRta.setText(strRta); 
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
            java.util.logging.Logger.getLogger(DetectorCorrectorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetectorCorrectorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetectorCorrectorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetectorCorrectorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetectorCorrectorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRuido;
    private javax.swing.JButton btnSendCod;
    private javax.swing.JTextField codSend;
    private javax.swing.JLabel infoRta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCodRecived;
    private javax.swing.JTextField txtCodificado;
    private javax.swing.JTextField txtRuido;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
