/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Extra_Frames.forgotpass_noCode;
import bcirs.forgotpass_code;
import bcirs.login_form;
import config.PasswordHasher;
import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SCC-COLLEGE
 */
public class forgotpass extends javax.swing.JFrame {

    /**
     * Creates new form resgiter_form
     */
    public forgotpass() {
        initComponents();
          email.setBorder(new EmptyBorder(0,10,0,0));
    }
    
    Color Red = new Color(255,0,0);
    Color Hover = new Color(0,102,255);
    Color Release = new Color(27,57,77);


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cBt = new javax.swing.JButton();
        signIn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(92, 61, 113));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Forgot password-amico (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(363, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 780));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 55, 77));
        jLabel1.setText(" Forgot Password");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, 47));

        jLabel9.setBackground(new java.awt.Color(234, 234, 234));
        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(27, 55, 77));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("and enter the security code to verify your request to change.");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 30));

        cBt.setBackground(new java.awt.Color(27, 55, 77));
        cBt.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        cBt.setForeground(new java.awt.Color(255, 255, 255));
        cBt.setText("Continue");
        cBt.setBorder(null);
        cBt.setBorderPainted(false);
        cBt.setOpaque(false);
        cBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cBtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cBtMouseExited(evt);
            }
        });
        cBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBtActionPerformed(evt);
            }
        });
        jPanel2.add(cBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 190, 33));

        signIn.setBackground(new java.awt.Color(245, 246, 248));
        signIn.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        signIn.setForeground(new java.awt.Color(27, 55, 77));
        signIn.setText("Login");
        signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInMouseExited(evt);
            }
        });
        jPanel2.add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 30, -1));

        jLabel10.setBackground(new java.awt.Color(234, 234, 234));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Remember Password?");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jLabel11.setBackground(new java.awt.Color(234, 234, 234));
        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(27, 55, 77));
        jLabel11.setText("Enter the email associated with your accocunt to find your account");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 530, 30));

        email.setBackground(new java.awt.Color(242, 242, 242));
        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(57, 55, 77));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 480, 60));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(27, 55, 77));
        jLabel16.setText("Email");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 40, 40));

        a1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 0, 0));
        a1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 180, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 910, 782));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtActionPerformed
     
     dbConnector dbc = new dbConnector();
     
     if(email.getText().isEmpty()){
          a1.setText("Field required");
     }else{

        try {
            String u_email = email.getText();
            String query = "SELECT * FROM tbl_user WHERE u_email = ?;";

            try (PreparedStatement pstmt = dbc.connect.prepareStatement(query)) {
                pstmt.setString(1, u_email);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {

                    if(rs.getString("u_code").isEmpty()){
                       
                       forgotpass_noCode fc = new forgotpass_noCode();
                       fc.setVisible(true);
                       this.dispose();
                       
                    }else{
                        
                       forgotpass_code fc = new forgotpass_code();
                       fc.email.setText(u_email+".");
                       fc.id.setText(rs.getString("u_id"));
                       fc.setVisible(true);
                       this.dispose();
                    }
                   
                } else {
                   a1.setText("Email does not exist!");
                }
       
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
     }
      
    }//GEN-LAST:event_cBtActionPerformed

    private void signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseClicked
        login_form log = new login_form();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signInMouseClicked

    private void signInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseEntered
        signIn.setForeground(Hover);
    }//GEN-LAST:event_signInMouseEntered

    private void signInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseExited
        signIn.setForeground(Release);
    }//GEN-LAST:event_signInMouseExited

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
    
   
    }//GEN-LAST:event_emailActionPerformed

    private void cBtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBtMouseEntered
        cBt.setBackground(Hover);
    }//GEN-LAST:event_cBtMouseEntered

    private void cBtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBtMouseExited
       cBt.setBackground(Release);
    }//GEN-LAST:event_cBtMouseExited

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
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JButton cBt;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel signIn;
    // End of variables declaration//GEN-END:variables
}
