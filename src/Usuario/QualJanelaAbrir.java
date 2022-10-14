
package Usuario;

public class QualJanelaAbrir extends javax.swing.JFrame {

   
    public QualJanelaAbrir() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonClinicaMedica = new javax.swing.JButton();
        jButtonCPN = new javax.swing.JButton();
        jButonClinicaCirurgica = new javax.swing.JButton();
        jButtonUTIneo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonClinicaMedica.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClinicaMedica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonClinicaMedica.setText("Clinica Médica");
        jButtonClinicaMedica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, new java.awt.Color(255, 255, 255), java.awt.Color.red, java.awt.Color.white));
        jButtonClinicaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClinicaMedicaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClinicaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, 70));

        jButtonCPN.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCPN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jButtonCPN.setText("Cpn");
        jButtonCPN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.white, java.awt.Color.red, java.awt.Color.white));
        jButtonCPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCPNActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 180, 70));

        jButonClinicaCirurgica.setBackground(new java.awt.Color(255, 255, 255));
        jButonClinicaCirurgica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButonClinicaCirurgica.setText("Clinica Cirurgica");
        jButonClinicaCirurgica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.white, java.awt.Color.red, java.awt.Color.white));
        jButonClinicaCirurgica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButonClinicaCirurgicaActionPerformed(evt);
            }
        });
        getContentPane().add(jButonClinicaCirurgica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 180, 70));

        jButtonUTIneo.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUTIneo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonUTIneo.setText("UTI NEO");
        jButtonUTIneo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.white, java.awt.Color.red, java.awt.Color.white));
        jButtonUTIneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUTIneoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUTIneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 180, 70));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CLINICA OBSTÉTRICA");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.white, java.awt.Color.red, java.awt.Color.white));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 180, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("UTI");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.white, java.awt.Color.red, java.awt.Color.white));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 180, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capturar.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 280, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8615bbf26acc721cf6e9cb5c45a42dc6.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClinicaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClinicaMedicaActionPerformed
       
        TelaClinicaMedica tela = new TelaClinicaMedica();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonClinicaMedicaActionPerformed

    private void jButtonCPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCPNActionPerformed
       TelaCPN telacpn = new TelaCPN();
       telacpn.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonCPNActionPerformed

    private void jButonClinicaCirurgicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButonClinicaCirurgicaActionPerformed
       TelaClinicaCirurgica telaclinicacirurgica = new TelaClinicaCirurgica();
       telaclinicacirurgica.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButonClinicaCirurgicaActionPerformed

    private void jButtonUTIneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUTIneoActionPerformed
        TelaUTIneo telautineo = new TelaUTIneo();
        telautineo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonUTIneoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButonClinicaCirurgica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCPN;
    private javax.swing.JButton jButtonClinicaMedica;
    private javax.swing.JButton jButtonUTIneo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
