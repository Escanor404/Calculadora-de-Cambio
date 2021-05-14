package calculadora;

public class Calculadora extends javax.swing.JFrame {

    //Os valore foram peogs no dia 14/05/2021
    //Referente a conversão de um REAL
    //Pesquisei no google o valor de 1 BRL para as moedas
    double USD = 5.26;
    double Nigeria_Naira = 78.54;
    double Canada_USD = 4.34;
    double Xelim_queniano = 20.37;
    double Rupia_indonesia = 2717.50; 
    double Rupia_indiana = 13.93;
    double Peso_filipino = 9.10;
    double euro = 6.39;
    double bitcoin = 270494.39;

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        selecionarMoeda = new javax.swing.JComboBox<>();
        labelConversao = new javax.swing.JLabel();
        txtConversao = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnConverter = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 59)); // NOI18N
        jLabel1.setText("Muito Dinheiro");

        selecionarMoeda.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        selecionarMoeda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma moeda", "USD", "Nigeria Naira", "Euro", "Canada USD", "Xelim queniano", "Rupia indonésia", "Rupia indiana", "Peso filipino", "Bitcoin", " ", " ", " " }));
        selecionarMoeda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selecionarMoeda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelConversao.setBackground(new java.awt.Color(51, 255, 255));
        labelConversao.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelConversao.setForeground(new java.awt.Color(0, 255, 255));
        labelConversao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtConversao.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtConversao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        txtConversao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConversaoActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnConverter.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnConverter.setText("Converter");
        btnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText(" Luís Artur Correia ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("Digite o valor em REAIS no campo de texto abaixo");
        jLabel3.setToolTipText("");

        jLabel4.setText("Resultado irá aparecer no campo abaixo");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(btnConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selecionarMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtConversao)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelConversao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)))))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecionarMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(labelConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConversaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConversaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConversaoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtConversao.setText(null);
        labelConversao.setText(null);
        selecionarMoeda.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterActionPerformed
        //Início da conversão 
        double valor_real = Double.parseDouble(txtConversao.getText());
        
        //Converte de REAL para Dolar
        if(selecionarMoeda.getSelectedItem().equals("USD")) 
        {
           String conversao = String.format("$ %2f", valor_real * USD);
           labelConversao.setText(conversao);
        }
        
        //Converte de REAL para Nigeira Naira
        if(selecionarMoeda.getSelectedItem().equals("Nigeria Naira")) 
        {
           String conversao = String.format("₦ %2f", valor_real * Nigeria_Naira);
           labelConversao.setText(conversao);
        }
        
        //Converte de REAL para Euro
        if(selecionarMoeda.getSelectedItem().equals("Euro")) 
        {
           String conversao = String.format("€ %2f", valor_real * euro);
           labelConversao.setText(conversao);
        }
        
        //Converte de REAL para Dolar Canadense
        if(selecionarMoeda.getSelectedItem().equals("Canada USD")) 
        {
           String conversao = String.format("C$ %2f", valor_real * Canada_USD);
           labelConversao.setText(conversao);
        }
        
         //Converte de REAL para Xelim Queniano
        if(selecionarMoeda.getSelectedItem().equals("Xelim queniano")) 
        {
           String conversao = String.format("Xelim %2f", valor_real * Xelim_queniano );
           labelConversao.setText(conversao);
        }
        
        //Converte de REAL para Rupia Indonésia
        if(selecionarMoeda.getSelectedItem().equals("Rupia indonésia")) 
        {
           String conversao = String.format("Rupia I %2f", valor_real * Rupia_indonesia);
           labelConversao.setText(conversao);
        }
        
         //Converte de REAL para Rupia Indiana
        if(selecionarMoeda.getSelectedItem().equals("Rupia indiana")) 
        {
           String conversao = String.format("Rupia I %2f", valor_real * Rupia_indiana);
           labelConversao.setText(conversao);
        }
        
         //Converte de REAL para Peso filipino
        if(selecionarMoeda.getSelectedItem().equals("Peso filipino")) 
        {
           String conversao = String.format("Peso F %2f", valor_real * Peso_filipino);
           labelConversao.setText(conversao);
        }
        
         //Converte de REAL para Bitcoin
        if(selecionarMoeda.getSelectedItem().equals("Bitcoin")) 
        {
           String conversao = String.format("BTC %2f", valor_real * bitcoin);
           labelConversao.setText(conversao);
        }
        
        
    }//GEN-LAST:event_btnConverterActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverter;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelConversao;
    private javax.swing.JComboBox<String> selecionarMoeda;
    private javax.swing.JTextField txtConversao;
    // End of variables declaration//GEN-END:variables
}
