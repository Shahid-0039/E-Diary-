
package Interface;
public class Home extends javax.swing.JFrame {
       public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("E DIARY");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 24, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(102, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin.png"))); // NOI18N
        jToggleButton1.setText("ADMIN");
        jToggleButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 3, true));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 170, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon diary.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 100));

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("WELCOME TO E DIARY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 390, 90));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.setVisible(false);
        new LogIn().setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

       public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
