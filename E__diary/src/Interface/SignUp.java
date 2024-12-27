/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtf_username = new javax.swing.JTextField();
        txtf_password = new javax.swing.JPasswordField();
        btn_register = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelSHOWNAME1 = new javax.swing.JLabel();
        jLabelSHOWPASSWORD1 = new javax.swing.JLabel();
        txtf_admail = new javax.swing.JTextField();
        jLabelSHOWNAME2 = new javax.swing.JLabel();
        chckbox_password = new javax.swing.JCheckBox();
        btn_login = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SignUp Page");
        setMinimumSize(new java.awt.Dimension(900, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 102, 0));
        jLabel3.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Wel Come to");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 118, 188, -1));

        jLabel4.setBackground(new java.awt.Color(51, 51, 0));
        jLabel4.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Sign UP pAGE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 169, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/High_resolution_wallpaper_background_ID_77701387610.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 121, 280, 337));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 0), 4, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("SIGN UP");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 29, 110, -1));

        txtf_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_usernameActionPerformed(evt);
            }
        });
        jPanel2.add(txtf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 232, -1));

        txtf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_passwordActionPerformed(evt);
            }
        });
        jPanel2.add(txtf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 232, -1));

        btn_register.setBackground(new java.awt.Color(0, 51, 102));
        btn_register.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_register.setText("REGISTER");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 110, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("Search by Category");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 3, true));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 200, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setText("USER NAME");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 3, true));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 200, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 204));
        jLabel8.setText("USER PASSWORD");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 3, true));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 200, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/secrecy-icon.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 43, 46));

        jLabelSHOWNAME1.setBackground(java.awt.Color.white);
        jLabelSHOWNAME1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSHOWNAME1.setForeground(new java.awt.Color(5, 5, 5));
        jLabelSHOWNAME1.setText("E-mail");
        jPanel2.add(jLabelSHOWNAME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabelSHOWPASSWORD1.setBackground(java.awt.Color.white);
        jLabelSHOWPASSWORD1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSHOWPASSWORD1.setForeground(new java.awt.Color(5, 5, 5));
        jLabelSHOWPASSWORD1.setText("Password");
        jPanel2.add(jLabelSHOWPASSWORD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        txtf_admail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_admailActionPerformed(evt);
            }
        });
        jPanel2.add(txtf_admail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 230, -1));

        jLabelSHOWNAME2.setBackground(java.awt.Color.white);
        jLabelSHOWNAME2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSHOWNAME2.setForeground(new java.awt.Color(5, 5, 5));
        jLabelSHOWNAME2.setText("User Name ");
        jPanel2.add(jLabelSHOWNAME2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

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
        jPanel2.add(chckbox_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 130, 20));

        btn_login.setBackground(new java.awt.Color(0, 204, 0));
        btn_login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 270, 100, 31));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 121, 410, 337));

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

    private void txtf_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_usernameActionPerformed
        
    }//GEN-LAST:event_txtf_usernameActionPerformed

    private void txtf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_passwordActionPerformed
        
    }//GEN-LAST:event_txtf_passwordActionPerformed

    private void txtf_admailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_admailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_admailActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db= "jdbc:mysql://localhost:3306/e_diary";
            String username="root";
            String password="";
            Connection con= DriverManager.getConnection(db,username,password);
            String query="insert into signup (NAME,MAIL,PASSWORD) values (?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, txtf_username.getText());
            pst.setString(2,txtf_admail.getText());
            pst.setString(3, txtf_password.getText());
            int val=pst.executeUpdate();
            if(val>0){
                JOptionPane.showMessageDialog(SignUp.this, "Registered Successfully");
            }
            else{
                JOptionPane.showMessageDialog(SignUp.this, "Registration faild");
            }
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_registerActionPerformed

    private void chckbox_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckbox_passwordActionPerformed
       
        if(chckbox_password.isSelected()){
           txtf_password.setEchoChar((char)0);
        }else{
            txtf_password.setEchoChar('*');
        }
    }//GEN-LAST:event_chckbox_passwordActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        this.setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btn_loginActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JCheckBox chckbox_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSHOWNAME1;
    private javax.swing.JLabel jLabelSHOWNAME2;
    private javax.swing.JLabel jLabelSHOWPASSWORD1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtf_admail;
    private javax.swing.JPasswordField txtf_password;
    private javax.swing.JTextField txtf_username;
    // End of variables declaration//GEN-END:variables
}
