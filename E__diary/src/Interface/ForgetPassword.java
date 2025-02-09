/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class ForgetPassword extends javax.swing.JFrame {

    public ForgetPassword() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtf_username = new javax.swing.JTextField();
        txtf_password = new javax.swing.JPasswordField();
        btn_change = new javax.swing.JToggleButton();
        btn_login = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("New Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 20));

        txtf_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 192, 260, 30));

        txtf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 260, 30));

        btn_change.setBackground(new java.awt.Color(255, 255, 51));
        btn_change.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_change.setText("Change");
        btn_change.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 90, 31));

        btn_login.setBackground(new java.awt.Color(0, 204, 0));
        btn_login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 78, 31));

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("FORGOTTEN PASSWORD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("E-mail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 125, 337, 360));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 4, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(102, 102, 0));
        jLabel6.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Wel Come to");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 118, 188, -1));

        jLabel7.setBackground(new java.awt.Color(51, 51, 0));
        jLabel7.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Forgotten page");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 160, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/High_resolution_wallpaper_background_ID_77701387610.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 360));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 127, 280, 360));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("E DIARY");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 24, 220, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon diary.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 80));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_passwordActionPerformed

    private void btn_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeActionPerformed
    String username = txtf_username.getText();
    String newPassword = txtf_password.getText();
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_diary", "root", "");
        String query = "SELECT `MAIL` FROM `signup` WHERE `MAIL` = ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            pst.close(); // Close the previous statement before executing another one
            String updateQuery = "UPDATE `signup` SET `PASSWORD` = ? WHERE `MAIL` = ?";
            try (PreparedStatement updatePst = con.prepareStatement(updateQuery)) {
                updatePst.setString(1, newPassword);
                updatePst.setString(2, username);
                updatePst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Password updated successfully");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter correct username and answer");
        }
        con.close();
        rs.close();
    } catch (HeadlessException | ClassNotFoundException | SQLException e) {
       
         JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_btn_changeActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txtf_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_usernameActionPerformed

      public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_change;
    private javax.swing.JToggleButton btn_login;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtf_password;
    private javax.swing.JTextField txtf_username;
    // End of variables declaration//GEN-END:variables
}
