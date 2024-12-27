/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class LogIn extends javax.swing.JFrame {
   
   Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public LogIn() {
        initComponents();
         try {
              con = DriverManager.getConnection("jdbc:mysql://localhost/e_diary", "root", "");
            if (con == null) {
                JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Failed to connect to the database: " + ex.getMessage());
        }
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelSHOWNAME1 = new javax.swing.JLabel();
        UserNameT_F = new javax.swing.JTextField();
        jLabelSHOWPASSWORD1 = new javax.swing.JLabel();
        UserPasswordField = new javax.swing.JPasswordField();
        btn_signup = new javax.swing.JButton();
        jLabelSHOWNAME2 = new javax.swing.JLabel();
        lbSHOWLGIN1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        chckbox_password = new javax.swing.JCheckBox();
        btn_forget = new javax.swing.JToggleButton();
        jLabelSHOWNAME3 = new javax.swing.JLabel();
        BLOGIN2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN");
        setBackground(new java.awt.Color(153, 102, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Wel Come to");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 94, 188, -1));

        jLabel2.setBackground(new java.awt.Color(51, 51, 0));
        jLabel2.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("e_dIARY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 145, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/High_resolution_wallpaper_background_ID_77701387610.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 320, 410));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 4, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSHOWNAME1.setBackground(java.awt.Color.white);
        jLabelSHOWNAME1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSHOWNAME1.setForeground(new java.awt.Color(5, 5, 5));
        jLabelSHOWNAME1.setText("User Name ");
        jPanel2.add(jLabelSHOWNAME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        UserNameT_F.setForeground(new java.awt.Color(5, 5, 5));
        jPanel2.add(UserNameT_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 290, -1));

        jLabelSHOWPASSWORD1.setBackground(java.awt.Color.white);
        jLabelSHOWPASSWORD1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSHOWPASSWORD1.setForeground(new java.awt.Color(5, 5, 5));
        jLabelSHOWPASSWORD1.setText("Password");
        jPanel2.add(jLabelSHOWPASSWORD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        UserPasswordField.setForeground(new java.awt.Color(5, 5, 5));
        UserPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserPasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(UserPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 290, -1));

        btn_signup.setBackground(new java.awt.Color(0, 0, 204));
        btn_signup.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(5, 5, 5));
        btn_signup.setText("SIGNUP");
        btn_signup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        jPanel2.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 279, 90, 20));

        jLabelSHOWNAME2.setBackground(java.awt.Color.white);
        jLabelSHOWNAME2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSHOWNAME2.setForeground(new java.awt.Color(5, 5, 5));
        jLabelSHOWNAME2.setText("I don't  have  an account.");
        jPanel2.add(jLabelSHOWNAME2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 150, 20));

        lbSHOWLGIN1.setBackground(new java.awt.Color(102, 102, 0));
        lbSHOWLGIN1.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        lbSHOWLGIN1.setForeground(new java.awt.Color(255, 0, 0));
        lbSHOWLGIN1.setText("LOGIN APPLICATION ");
        lbSHOWLGIN1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbSHOWLGIN1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbSHOWLGIN1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(lbSHOWLGIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/secrecy-icon.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 43, 46));

        chckbox_password.setBackground(new java.awt.Color(204, 204, 255));
        chckbox_password.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        chckbox_password.setForeground(new java.awt.Color(51, 51, 51));
        chckbox_password.setText("Show Password");
        chckbox_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.yellow, java.awt.Color.darkGray, java.awt.Color.blue, java.awt.Color.magenta));
        chckbox_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckbox_passwordActionPerformed(evt);
            }
        });
        jPanel2.add(chckbox_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 130, 20));

        btn_forget.setBackground(new java.awt.Color(204, 204, 0));
        btn_forget.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        btn_forget.setForeground(new java.awt.Color(51, 51, 51));
        btn_forget.setText("Forget Password");
        btn_forget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_forget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forgetActionPerformed(evt);
            }
        });
        jPanel2.add(btn_forget, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 140, 30));

        jLabelSHOWNAME3.setBackground(java.awt.Color.white);
        jLabelSHOWNAME3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSHOWNAME3.setForeground(new java.awt.Color(5, 5, 5));
        jLabelSHOWNAME3.setText("login if you have  an account.");
        jPanel2.add(jLabelSHOWNAME3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 175, 20));

        BLOGIN2.setBackground(new java.awt.Color(0, 102, 0));
        BLOGIN2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BLOGIN2.setForeground(new java.awt.Color(5, 5, 5));
        BLOGIN2.setText("LOGIN");
        BLOGIN2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BLOGIN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLOGIN2ActionPerformed(evt);
            }
        });
        jPanel2.add(BLOGIN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 239, 90, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 400, 410));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("E DIARY");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 24, 220, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon diary.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 80));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPasswordFieldActionPerformed

    private void lbSHOWLGIN1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbSHOWLGIN1AncestorAdded
    
    }//GEN-LAST:event_lbSHOWLGIN1AncestorAdded

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        this.setVisible(false);
        new SignUp().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_signupActionPerformed

    private void chckbox_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckbox_passwordActionPerformed
                if(chckbox_password.isSelected()){
            UserPasswordField.setEchoChar((char)0);
        }else{
            UserPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_chckbox_passwordActionPerformed

    private void btn_forgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forgetActionPerformed
        this.setVisible(false);
        new ForgetPassword().setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_forgetActionPerformed

    private void BLOGIN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLOGIN2ActionPerformed
         String email = UserNameT_F.getText();
        String password = UserPasswordField.getText();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your email address.");
            return;
        }
        try {
           String sql = "SELECT * FROM signup WHERE MAIL = ? AND PASSWORD = ?";

            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                this.setVisible(false);
                new Main().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email address or password.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_BLOGIN2ActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLOGIN2;
    private javax.swing.JTextField UserNameT_F;
    private javax.swing.JPasswordField UserPasswordField;
    private javax.swing.JToggleButton btn_forget;
    private javax.swing.JButton btn_signup;
    private javax.swing.JCheckBox chckbox_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSHOWNAME1;
    private javax.swing.JLabel jLabelSHOWNAME2;
    private javax.swing.JLabel jLabelSHOWNAME3;
    private javax.swing.JLabel jLabelSHOWPASSWORD1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbSHOWLGIN1;
    // End of variables declaration//GEN-END:variables

    private void setGetcontentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
