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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Category extends javax.swing.JFrame {
   Connection con = null;
      PreparedStatement pst = null;
       public Category() {
           
        initComponents();
         try {
       
        con = DriverManager.getConnection("jdbc:mysql://localhost/e_diary", "root", "");
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Failed to connect to the database: " + ex.getMessage());
    }
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        jLabel2 = new javax.swing.JLabel();
        Btn1_view = new javax.swing.JButton();
        UpdateCategoryJBtn1 = new javax.swing.JButton();
        DeleteCategoryJBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_category = new javax.swing.JTable();
        txt_Category = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AddCategoryJBtn2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Categery");
        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 102, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Category");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 254, -1));

        Btn1_view.setBackground(new java.awt.Color(255, 204, 102));
        Btn1_view.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn1_view.setText("View");
        Btn1_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1_viewActionPerformed(evt);
            }
        });
        getContentPane().add(Btn1_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 120, 30));

        UpdateCategoryJBtn1.setBackground(new java.awt.Color(51, 51, 255));
        UpdateCategoryJBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateCategoryJBtn1.setText("Update");
        UpdateCategoryJBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateCategoryJBtn1MouseClicked(evt);
            }
        });
        UpdateCategoryJBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCategoryJBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateCategoryJBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 100, 30));

        DeleteCategoryJBtn1.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCategoryJBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteCategoryJBtn1.setText("Delete");
        DeleteCategoryJBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCategoryJBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteCategoryJBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 110, 30));

        tbl_category.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbl_category.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tbl_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_categoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_category);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 500, 240));

        txt_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CategoryActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 360, 30));

        jLabel3.setBackground(new java.awt.Color(0, 51, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("Category Name");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 3, true));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 30));

        AddCategoryJBtn2.setBackground(new java.awt.Color(102, 204, 0));
        AddCategoryJBtn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddCategoryJBtn2.setText("Add");
        AddCategoryJBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCategoryJBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(AddCategoryJBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 30));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateCategoryJBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCategoryJBtn1ActionPerformed

      try {
           
            String newValue = txt_Category.getText();

            
            int row = tbl_category.getSelectedRow();
            int column = tbl_category.getSelectedColumn();

            tbl_category.setValueAt(newValue, row, column);

           
            String updateSql = "UPDATE category SET Name = ? WHERE ID = ?";
            pst = con.prepareStatement(updateSql);
            pst.setString(1, newValue);
            pst.setInt(2, Integer.parseInt(tbl_category.getValueAt(row, 0).toString())); 
            
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Successfully Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update");
            }

            txt_Category.setText("");
            txt_Category.requestFocus();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
         
    }//GEN-LAST:event_UpdateCategoryJBtn1ActionPerformed

    private void DeleteCategoryJBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCategoryJBtn1ActionPerformed
 int selectedRowIndex = tbl_category.getSelectedRow();

        if (selectedRowIndex != -1) {
            try {
                
                String categoryId = tbl_category.getValueAt(selectedRowIndex, 0).toString();

                
                String query = "DELETE FROM category WHERE ID = ?";
                pst = con.prepareStatement(query);
                pst.setString(1, categoryId);
                pst.executeUpdate();
                
                DefaultTableModel model = (DefaultTableModel) tbl_category.getModel();
                model.removeRow(selectedRowIndex);

                JOptionPane.showMessageDialog(this, "Category deleted successfully");
            } catch (SQLException ex) {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_DeleteCategoryJBtn1ActionPerformed

    private void Btn1_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1_viewActionPerformed
             clearTable();
        displayCategoryData();
        
    }//GEN-LAST:event_Btn1_viewActionPerformed

    private void tbl_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_categoryMouseClicked
    int row = tbl_category.rowAtPoint(evt.getPoint());
    int column = tbl_category.columnAtPoint(evt.getPoint()); 
    Object cellValue = tbl_category.getValueAt(row, column);
    txt_Category.setText(cellValue.toString());
      
    }//GEN-LAST:event_tbl_categoryMouseClicked

    private void UpdateCategoryJBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateCategoryJBtn1MouseClicked
      
    }//GEN-LAST:event_UpdateCategoryJBtn1MouseClicked

    private void AddCategoryJBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCategoryJBtn2ActionPerformed
             try {
            pst = con.prepareStatement("INSERT INTO category (Name) VALUES (?)");
            pst.setString(1, txt_Category.getText());
            pst.executeUpdate(); 
            JOptionPane.showMessageDialog(this, "Category added Successfully");

           
            txt_Category.setText("");
            txt_Category.requestFocus();
            
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_AddCategoryJBtn2ActionPerformed

    private void txt_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CategoryActionPerformed
       
    }//GEN-LAST:event_txt_CategoryActionPerformed
 private void clearTable() {
      
        DefaultTableModel model = (DefaultTableModel) tbl_category.getModel();
        model.setRowCount(0);
    }

    private void displayCategoryData() {
       
        String sql = "SELECT * FROM category";
        try {
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tbl_category.getModel();
            while (rs.next()) {
                model.addRow(new String[]{rs.getString(1), rs.getString(2)});
            }
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCategoryJBtn2;
    private javax.swing.JButton Btn1_view;
    private javax.swing.JButton DeleteCategoryJBtn1;
    private javax.swing.JButton UpdateCategoryJBtn1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTable tbl_category;
    private javax.swing.JTextField txt_Category;
    // End of variables declaration//GEN-END:variables
}
