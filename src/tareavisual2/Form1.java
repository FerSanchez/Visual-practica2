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
public class Form1 extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public Form1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        OpSuma = new javax.swing.JRadioButton();
        OpResta = new javax.swing.JRadioButton();
        OpMultiplicacion = new javax.swing.JRadioButton();
        OpDivision = new javax.swing.JRadioButton();
        num1txt = new javax.swing.JTextField();
        num2txt = new javax.swing.JTextField();
        resultadotxt = new javax.swing.JTextField();
        calcularbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ComboBoxOperaciones = new javax.swing.JComboBox<>();
        num3txt = new javax.swing.JTextField();
        num4txt = new javax.swing.JTextField();
        resultado2txt = new javax.swing.JTextField();
        calcularbtn2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        comboboxtabla = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        calcularbtn3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        lblresultado1 = new javax.swing.JLabel();
        lblresultado2 = new javax.swing.JLabel();
        lblresultado3 = new javax.swing.JLabel();
        lblresultado4 = new javax.swing.JLabel();
        lblresultado6 = new javax.swing.JLabel();
        lblresultado5 = new javax.swing.JLabel();
        lblresultado9 = new javax.swing.JLabel();
        lblresultado10 = new javax.swing.JLabel();
        lblresultado7 = new javax.swing.JLabel();
        lblresultado8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ejercicio1"));

        buttonGroup1.add(OpSuma);
        OpSuma.setText("Suma");

        buttonGroup1.add(OpResta);
        OpResta.setText("Resta");

        buttonGroup1.add(OpMultiplicacion);
        OpMultiplicacion.setText("Multiplicacion");

        buttonGroup1.add(OpDivision);
        OpDivision.setText("Division");

        calcularbtn.setText("Calcular");
        calcularbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(OpMultiplicacion)
                        .addComponent(OpDivision, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OpResta)
                            .addComponent(OpSuma))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcularbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(num1txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addComponent(resultadotxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(num2txt, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(num1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(num2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(OpSuma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OpResta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpMultiplicacion)
                    .addComponent(resultadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpDivision)
                    .addComponent(calcularbtn))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ejercicio2"));

        ComboBoxOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division" }));

        calcularbtn2.setText("Calcular");
        calcularbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBoxOperaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcularbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(num4txt)
                    .addComponent(num3txt)
                    .addComponent(resultado2txt, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addGap(336, 336, 336))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(num3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(ComboBoxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(resultado2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(calcularbtn2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ejercicio3"));

        comboboxtabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel1.setText("Tabla del numero:");

        calcularbtn3.setText("Calcular");
        calcularbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularbtn3ActionPerformed(evt);
            }
        });

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane1.setViewportView(TextArea1);

        lblresultado1.setText("jLabel2");

        lblresultado2.setText("jLabel2");

        lblresultado3.setText("jLabel2");

        lblresultado4.setText("jLabel2");

        lblresultado6.setText("jLabel2");

        lblresultado5.setText("jLabel2");

        lblresultado9.setText("jLabel2");

        lblresultado10.setText("jLabel2");

        lblresultado7.setText("jLabel2");

        lblresultado8.setText("jLabel2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblresultado5)
                    .addComponent(lblresultado4)
                    .addComponent(lblresultado3)
                    .addComponent(lblresultado2)
                    .addComponent(lblresultado1)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addComponent(comboboxtabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblresultado9)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblresultado6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblresultado8)
                    .addComponent(lblresultado7)
                    .addComponent(lblresultado10)
                    .addComponent(calcularbtn3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(comboboxtabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calcularbtn3))
                                .addGap(37, 37, 37)
                                .addComponent(lblresultado1))
                            .addComponent(lblresultado6)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblresultado2)
                    .addComponent(lblresultado7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblresultado3)
                    .addComponent(lblresultado8))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblresultado4)
                    .addComponent(lblresultado9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblresultado5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lblresultado10))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularbtnActionPerformed
        // TODO add your handling code here:
        if(OpSuma.isSelected())
        {
            int num1=0;
            int num2=0;
             num1= Integer.parseInt(this.num1txt.getText());
             num2= Integer.parseInt(this.num2txt.getText());

             int resultado= num1+num2;
             resultadotxt.setText(String.valueOf(resultado));
        }
        
          if(OpResta.isSelected())
        {
            int num1=0;
            int num2=0;
             num1= Integer.parseInt(this.num1txt.getText());
             num2= Integer.parseInt(this.num2txt.getText());

             int resultado= num1-num2;
             resultadotxt.setText(String.valueOf(resultado));
        }
          
           if(OpMultiplicacion.isSelected())
        {
            int num1=0;
            int num2=0;
             num1= Integer.parseInt(this.num1txt.getText());
             num2= Integer.parseInt(this.num2txt.getText());

             int resultado= num1*num2;
             resultadotxt.setText(String.valueOf(resultado));
        }
           
            if(OpDivision.isSelected())
        {
            int num1=0;
            int num2=0;
             num1= Integer.parseInt(this.num1txt.getText());
             num2= Integer.parseInt(this.num2txt.getText());

             int resultado= num1/num2;
             resultadotxt.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_calcularbtnActionPerformed

    private void calcularbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularbtn2ActionPerformed
        // TODO add your handling code here:
        
        int variable =ComboBoxOperaciones.getSelectedIndex();
            if(variable==0)
               {
            int num3=0;
            int num4=0;
             num3= Integer.parseInt(this.num3txt.getText());
             num4= Integer.parseInt(this.num4txt.getText());

             int resultado= num3+num4;
             resultado2txt.setText(String.valueOf(resultado));
                } 
            if(variable==1)
               {
            int num3=0;
            int num4=0;
             num3= Integer.parseInt(this.num3txt.getText());
             num4= Integer.parseInt(this.num4txt.getText());

             int resultado= num3-num4;
             resultado2txt.setText(String.valueOf(resultado));
                } 
            if(variable==2)
               {
            int num3=0;
            int num4=0;
             num3= Integer.parseInt(this.num3txt.getText());
             num4= Integer.parseInt(this.num4txt.getText());

             int resultado= num3*num4;
             resultado2txt.setText(String.valueOf(resultado));
                } 
            if(variable==3)
               {
            int num3=0;
            int num4=0;
             num3= Integer.parseInt(this.num3txt.getText());
             num4= Integer.parseInt(this.num4txt.getText());

             int resultado= num3/num4;
             resultado2txt.setText(String.valueOf(resultado));
                } 
        
        //lblCiudad.setText(ComboBoxCiudad.getSelectedItem().toString());
        
        
        
        
        
        
    }//GEN-LAST:event_calcularbtn2ActionPerformed

    private void calcularbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularbtn3ActionPerformed
        // TODO add your handling code here:
        
            
            int a = comboboxtabla.getSelectedIndex();   
            if(a==0)
            {
                
            lblresultado1.setText(""+1*1);
            lblresultado2.setText(""+1*2);
            lblresultado3.setText(""+1*3);
            lblresultado4.setText(""+1*4);
            lblresultado5.setText(""+1*5);
            lblresultado6.setText(""+1*6);
            lblresultado7.setText(""+1*7);
            lblresultado8.setText(""+1*8);
            lblresultado9.setText(""+1*9);
            lblresultado10.setText(""+1*10);                                          
               }
            
            if(a==1)
            {
                
            lblresultado1.setText(""+2*1);
            lblresultado2.setText(""+2*2);
            lblresultado3.setText(""+2*3);
            lblresultado4.setText(""+2*4);
            lblresultado5.setText(""+2*5);
            lblresultado6.setText(""+2*6);
            lblresultado7.setText(""+2*7);
            lblresultado8.setText(""+2*8);
            lblresultado9.setText(""+2*9);
            lblresultado10.setText(""+2*10);                                          
               }
            
             if(a==2)
            {
                
            lblresultado1.setText(""+3*1);
            lblresultado2.setText(""+3*2);
            lblresultado3.setText(""+3*3);
            lblresultado4.setText(""+3*4);
            lblresultado5.setText(""+3*5);
            lblresultado6.setText(""+3*6);
            lblresultado7.setText(""+3*7);
            lblresultado8.setText(""+3*8);
            lblresultado9.setText(""+3*9);
            lblresultado10.setText(""+3*10);                                          
               }
          if(a==3)
            {
                
            lblresultado1.setText(""+4*1);
            lblresultado2.setText(""+4*2);
            lblresultado3.setText(""+4*3);
            lblresultado4.setText(""+4*4);
            lblresultado5.setText(""+4*5);
            lblresultado6.setText(""+4*6);
            lblresultado7.setText(""+4*7);
            lblresultado8.setText(""+4*8);
            lblresultado9.setText(""+4*9);
            lblresultado10.setText(""+4*10);                                          
               }
           if(a==4)
            {
                
            lblresultado1.setText(""+5*1);
            lblresultado2.setText(""+5*2);
            lblresultado3.setText(""+5*3);
            lblresultado4.setText(""+5*4);
            lblresultado5.setText(""+5*5);
            lblresultado6.setText(""+5*6);
            lblresultado7.setText(""+5*7);
            lblresultado8.setText(""+5*8);
            lblresultado9.setText(""+5*9);
            lblresultado10.setText(""+5*10);                                          
               }
           if(a==5)
            {
                
            lblresultado1.setText(""+6*1);
            lblresultado2.setText(""+6*2);
            lblresultado3.setText(""+6*3);
            lblresultado4.setText(""+6*4);
            lblresultado5.setText(""+6*5);
            lblresultado6.setText(""+6*6);
            lblresultado7.setText(""+6*7);
            lblresultado8.setText(""+6*8);
            lblresultado9.setText(""+6*9);
            lblresultado10.setText(""+6*10);                                          
               }
           if(a==6)
            {
                
            lblresultado1.setText(""+7*1);
            lblresultado2.setText(""+7*2);
            lblresultado3.setText(""+7*3);
            lblresultado4.setText(""+7*4);
            lblresultado5.setText(""+7*5);
            lblresultado6.setText(""+7*6);
            lblresultado7.setText(""+7*7);
            lblresultado8.setText(""+7*8);
            lblresultado9.setText(""+7*9);
            lblresultado10.setText(""+7*10);                                          
               }
            if(a==7)
            {
                
            lblresultado1.setText(""+8*1);
            lblresultado2.setText(""+8*2);
            lblresultado3.setText(""+8*3);
            lblresultado4.setText(""+8*4);
            lblresultado5.setText(""+8*5);
            lblresultado6.setText(""+8*6);
            lblresultado7.setText(""+8*7);
            lblresultado8.setText(""+8*8);
            lblresultado9.setText(""+8*9);
            lblresultado10.setText(""+8*10);                                          
               }
           if(a==8)
            {
                
            lblresultado1.setText(""+9*1);
            lblresultado2.setText(""+9*2);
            lblresultado3.setText(""+9*3);
            lblresultado4.setText(""+9*4);
            lblresultado5.setText(""+9*5);
            lblresultado6.setText(""+9*6);
            lblresultado7.setText(""+9*7);
            lblresultado8.setText(""+9*8);
            lblresultado9.setText(""+9*9);
            lblresultado10.setText(""+9*10);                                          
               }
                   
            if(a==9)
            {
                
            lblresultado1.setText(""+10*1);
            lblresultado2.setText(""+10*2);
            lblresultado3.setText(""+10*3);
            lblresultado4.setText(""+10*4);
            lblresultado5.setText(""+10*5);
            lblresultado6.setText(""+10*6);
            lblresultado7.setText(""+10*7);
            lblresultado8.setText(""+10*8);
            lblresultado9.setText(""+10*9);
            lblresultado9.setText(""+10*10);                                          
               } 
                    
            
        
        
    }//GEN-LAST:event_calcularbtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxOperaciones;
    private javax.swing.JRadioButton OpDivision;
    private javax.swing.JRadioButton OpMultiplicacion;
    private javax.swing.JRadioButton OpResta;
    private javax.swing.JRadioButton OpSuma;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcularbtn;
    private javax.swing.JButton calcularbtn2;
    private javax.swing.JButton calcularbtn3;
    private javax.swing.JComboBox<String> comboboxtabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblresultado1;
    private javax.swing.JLabel lblresultado10;
    private javax.swing.JLabel lblresultado2;
    private javax.swing.JLabel lblresultado3;
    private javax.swing.JLabel lblresultado4;
    private javax.swing.JLabel lblresultado5;
    private javax.swing.JLabel lblresultado6;
    private javax.swing.JLabel lblresultado7;
    private javax.swing.JLabel lblresultado8;
    private javax.swing.JLabel lblresultado9;
    private javax.swing.JTextField num1txt;
    private javax.swing.JTextField num2txt;
    private javax.swing.JTextField num3txt;
    private javax.swing.JTextField num4txt;
    private javax.swing.JTextField resultado2txt;
    private javax.swing.JTextField resultadotxt;
    // End of variables declaration//GEN-END:variables
}
