/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareavisual2;

/**
 *
 * @author fernando
 */
public class Form2 extends javax.swing.JFrame {

    /**
     * Creates new form Form2
     */
    public Form2() {
        initComponents();
        clientepanel.setVisible(false);
        visitantepanel.setVisible(false);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        ComboBoxCV = new javax.swing.JComboBox<>();
        visitantepanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edadtxt = new javax.swing.JTextField();
        domiciliotxt = new javax.swing.JTextField();
        aceptarbtn2 = new javax.swing.JButton();
        clientepanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contrasenatxt = new javax.swing.JTextField();
        clavetxt = new javax.swing.JTextField();
        aceptarbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        ComboBoxCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir opcion", "Cliente", "Visitante" }));
        ComboBoxCV.setToolTipText("");
        ComboBoxCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCVActionPerformed(evt);
            }
        });

        visitantepanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Visitante"));

        jLabel3.setText("Edad:");

        jLabel4.setText("Domicilio:");

        aceptarbtn2.setText("Aceptar");
        aceptarbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout visitantepanelLayout = new javax.swing.GroupLayout(visitantepanel);
        visitantepanel.setLayout(visitantepanelLayout);
        visitantepanelLayout.setHorizontalGroup(
            visitantepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visitantepanelLayout.createSequentialGroup()
                .addGroup(visitantepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(visitantepanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(visitantepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(62, 62, 62)
                        .addGroup(visitantepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(domiciliotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(visitantepanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(aceptarbtn2)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        visitantepanelLayout.setVerticalGroup(
            visitantepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visitantepanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(visitantepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(visitantepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(domiciliotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(aceptarbtn2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        clientepanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel2.setText("Clave:");

        jLabel5.setText("Contrasena:");

        aceptarbtn1.setText("Aceptar");
        aceptarbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientepanelLayout = new javax.swing.GroupLayout(clientepanel);
        clientepanel.setLayout(clientepanelLayout);
        clientepanelLayout.setHorizontalGroup(
            clientepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(clientepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contrasenatxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clavetxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(clientepanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(aceptarbtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clientepanelLayout.setVerticalGroup(
            clientepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientepanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(clientepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(clavetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(clientepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contrasenatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(aceptarbtn1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBoxCV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(clientepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(visitantepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientepanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visitantepanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarbtn1ActionPerformed
        // TODO add your handling code here:

        Datos forma= new Datos();
        forma.nombrelbl.setText(nombretxt.getText());
        forma.dato1lbl.setText(clavetxt.getText());
        forma.dato2lbl.setText(contrasenatxt.getText());
        forma.show();
        
    }//GEN-LAST:event_aceptarbtn1ActionPerformed

    private void aceptarbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarbtn2ActionPerformed
        // TODO add your handling code here:
        Datos forma= new Datos();
        forma.nombrelbl.setText(nombretxt.getText());
        forma.dato1lbl.setText(edadtxt.getText());
        forma.dato2lbl.setText(domiciliotxt.getText());
        forma.show();
    }//GEN-LAST:event_aceptarbtn2ActionPerformed

    private void ComboBoxCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCVActionPerformed
        // TODO add your handling code here:
         int a = ComboBoxCV.getSelectedIndex();   
            if(a==1)
            {
                clientepanel.setVisible(true);
            }
            else if(a==2)
            {
                 visitantepanel.setVisible(true);
            }
    }//GEN-LAST:event_ComboBoxCVActionPerformed

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
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCV;
    private javax.swing.JButton aceptarbtn1;
    private javax.swing.JButton aceptarbtn2;
    private javax.swing.JTextField clavetxt;
    private javax.swing.JPanel clientepanel;
    private javax.swing.JTextField contrasenatxt;
    private javax.swing.JTextField domiciliotxt;
    private javax.swing.JTextField edadtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JPanel visitantepanel;
    // End of variables declaration//GEN-END:variables
}
