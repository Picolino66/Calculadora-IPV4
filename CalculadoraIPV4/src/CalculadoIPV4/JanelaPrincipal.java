
package CalculadoIPV4;

public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
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

        Painel = new javax.swing.JPanel();
        TextClasse = new javax.swing.JTextField();
        IP = new javax.swing.JLabel();
        Classe = new javax.swing.JLabel();
        TextIp1 = new javax.swing.JTextField();
        TextIp2 = new javax.swing.JTextField();
        TextIp3 = new javax.swing.JTextField();
        TextIp4 = new javax.swing.JTextField();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArq = new javax.swing.JMenu();
        MenuAj = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        TextClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextClasseActionPerformed(evt);
            }
        });

        IP.setText("Digite o IP");

        Classe.setText("Digite a classe (A, B ou C)");

        TextIp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIp1ActionPerformed(evt);
            }
        });

        TextIp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIp2ActionPerformed(evt);
            }
        });

        TextIp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIp3ActionPerformed(evt);
            }
        });

        TextIp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIp4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(Classe))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(TextIp1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextIp2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextIp3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextIp4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(IP)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Classe)
                .addGap(18, 18, 18)
                .addComponent(TextClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(IP)
                .addGap(18, 18, 18)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextIp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextIp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextIp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextIp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        MenuArq.setText("Arquivo");
        BarraMenu.add(MenuArq);

        MenuAj.setText("Ajuda");
        BarraMenu.add(MenuAj);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextIp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIp2ActionPerformed

    private void TextIp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIp1ActionPerformed

    private void TextIp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIp4ActionPerformed

    private void TextIp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIp3ActionPerformed

    private void TextClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextClasseActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JLabel Classe;
    private javax.swing.JLabel IP;
    private javax.swing.JMenu MenuAj;
    private javax.swing.JMenu MenuArq;
    private javax.swing.JPanel Painel;
    private javax.swing.JTextField TextClasse;
    private javax.swing.JTextField TextIp1;
    private javax.swing.JTextField TextIp2;
    private javax.swing.JTextField TextIp3;
    private javax.swing.JTextField TextIp4;
    // End of variables declaration//GEN-END:variables
}
