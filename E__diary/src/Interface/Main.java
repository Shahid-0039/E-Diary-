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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Main extends javax.swing.JFrame {

   Connection con = null;
      PreparedStatement pst = null;
    public Main() {
      
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

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jFrame4 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Note_tbd_pane = new javax.swing.JTabbedPane();
        Note_Panel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        AddNewNoteCategoryJBtn = new javax.swing.JButton();
        UpdateNoteJBtn = new javax.swing.JButton();
        DeleteNoteJBtn = new javax.swing.JButton();
        AddNoteJBtn = new javax.swing.JButton();
        CategoryNoteListjComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Btn1_view = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        Note_tbl = new javax.swing.JTable();
        ClearNoteJBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        Add_note_txtArea = new javax.swing.JTextArea();
        jDateChooser1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 51, 51));
        setResizable(false);

        Note_tbd_pane.setBackground(new java.awt.Color(102, 102, 0));
        Note_tbd_pane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 5, true));
        Note_tbd_pane.setForeground(new java.awt.Color(255, 255, 51));

        Note_Panel.setBackground(new java.awt.Color(102, 51, 0));
        Note_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 5, true));
        jPanel6.setForeground(new java.awt.Color(204, 204, 0));
        jPanel6.setMaximumSize(new java.awt.Dimension(850, 450));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddNewNoteCategoryJBtn.setBackground(new java.awt.Color(255, 0, 153));
        AddNewNoteCategoryJBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddNewNoteCategoryJBtn.setText("Add New Category");
        AddNewNoteCategoryJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewNoteCategoryJBtnActionPerformed(evt);
            }
        });
        jPanel6.add(AddNewNoteCategoryJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 40, 275, 21));

        UpdateNoteJBtn.setBackground(new java.awt.Color(51, 51, 255));
        UpdateNoteJBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateNoteJBtn.setText("Update");
        UpdateNoteJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateNoteJBtnActionPerformed(evt);
            }
        });
        jPanel6.add(UpdateNoteJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        DeleteNoteJBtn.setBackground(new java.awt.Color(255, 0, 0));
        DeleteNoteJBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteNoteJBtn.setText("Delete");
        DeleteNoteJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteNoteJBtnActionPerformed(evt);
            }
        });
        jPanel6.add(DeleteNoteJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        AddNoteJBtn.setBackground(new java.awt.Color(102, 204, 0));
        AddNoteJBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddNoteJBtn.setText("Add");
        AddNoteJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNoteJBtnActionPerformed(evt);
            }
        });
        jPanel6.add(AddNoteJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 81, -1));

        CategoryNoteListjComboBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CategoryNoteListjComboBox1.setMaximumRowCount(255);
        CategoryNoteListjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School" }));
        CategoryNoteListjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryNoteListjComboBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(CategoryNoteListjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 275, -1));

        jTable2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Note Category", "Note", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable2);

        jScrollPane2.setViewportView(jScrollPane6);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2325, 104, 312, 288));

        jTable5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Note Category", "Note", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTable5);

        jScrollPane9.setViewportView(jScrollPane10);

        jPanel6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2325, 107, 312, 288));

        jLabel34.setBackground(new java.awt.Color(0, 153, 153));
        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 204, 204));
        jLabel34.setText("Note Category");
        jLabel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 14, 98, 20));

        jLabel36.setBackground(new java.awt.Color(0, 153, 153));
        jLabel36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 204, 204));
        jLabel36.setText("Note Category");
        jLabel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 14, 98, 20));

        jLabel37.setBackground(new java.awt.Color(0, 153, 153));
        jLabel37.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 204, 204));
        jLabel37.setText("Note Category");
        jLabel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 14, 98, 20));

        jLabel38.setBackground(new java.awt.Color(0, 153, 153));
        jLabel38.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 204, 204));
        jLabel38.setText("Note");
        jLabel38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, 40));

        Btn1_view.setBackground(new java.awt.Color(51, 51, 51));
        Btn1_view.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn1_view.setForeground(new java.awt.Color(255, 255, 255));
        Btn1_view.setText("View");
        Btn1_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1_viewActionPerformed(evt);
            }
        });
        jPanel6.add(Btn1_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 90, -1));
        jPanel6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        Note_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOTE CATEGORY", "NOTE", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Note_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Note_tblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Note_tbl);

        jScrollPane11.setViewportView(jScrollPane3);

        jPanel6.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 390, 340));

        ClearNoteJBtn1.setBackground(new java.awt.Color(255, 153, 0));
        ClearNoteJBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ClearNoteJBtn1.setText("Clear");
        ClearNoteJBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearNoteJBtn1ActionPerformed(evt);
            }
        });
        jPanel6.add(ClearNoteJBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 85, -1));

        Add_note_txtArea.setColumns(20);
        Add_note_txtArea.setRows(5);
        jScrollPane5.setViewportView(Add_note_txtArea);

        jScrollPane1.setViewportView(jScrollPane5);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 70, 320, 280));
        jPanel6.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.jpg"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 900, 430));

        Note_Panel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 890, 430));

        jLabel12.setBackground(new java.awt.Color(51, 51, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("FUNCTIONALITIES");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 5, true));
        Note_Panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 765, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/High_resolution_wallpaper_background_ID_77700002044.jpg"))); // NOI18N
        Note_Panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 540));

        Note_tbd_pane.addTab("NOTES", Note_Panel);

        getContentPane().add(Note_tbd_pane, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Note_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Note_tblMouseClicked

        int row = Note_tbl.rowAtPoint(evt.getPoint());
        int column = Note_tbl.columnAtPoint(evt.getPoint());
        Object cellValue = Note_tbl.getValueAt(row, column);
        Add_note_txtArea.setText(cellValue != null ? cellValue.toString() : "");
    }//GEN-LAST:event_Note_tblMouseClicked

    private void Btn1_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1_viewActionPerformed

        clearTable();
        displayCategoryData();
    }//GEN-LAST:event_Btn1_viewActionPerformed

    private void AddNoteJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNoteJBtnActionPerformed
        try {
           
            String insertNoteQuery = "INSERT INTO notes (NOTE_C, NOTE_N, DATE,TIME ) VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(insertNoteQuery);
            pst.setString(1, CategoryNoteListjComboBox1.getSelectedItem().toString()); 
            pst.setString(2, Add_note_txtArea.getText());
            pst.setString(3, getCurrentDate()); 
            pst.setString(4, getCurrentTime());
            pst.executeUpdate(); 

            JOptionPane.showMessageDialog(this, "Note added successfully");

            
            Add_note_txtArea.setText("");
            Add_note_txtArea.requestFocus();

            
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }

    }//GEN-LAST:event_AddNoteJBtnActionPerformed


    private void DeleteNoteJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteNoteJBtnActionPerformed
        int selectedRowIndex =  Note_tbl.getSelectedRow();

        if (selectedRowIndex != -1) {
            try {
               
                String categoryId =  Note_tbl.getValueAt(selectedRowIndex, 0).toString();

                
                String query = "DELETE FROM notes WHERE ID = ?";
                pst = con.prepareStatement(query);
                pst.setString(1, categoryId);
                pst.executeUpdate();

                
                DefaultTableModel model = (DefaultTableModel)  Note_tbl.getModel();
                model.removeRow(selectedRowIndex);

                JOptionPane.showMessageDialog(this, "Category deleted successfully");
            } catch (SQLException ex) {
                Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_DeleteNoteJBtnActionPerformed

    private void UpdateNoteJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateNoteJBtnActionPerformed
        try {
            
            String newValue =Add_note_txtArea.getText();

           
            int row = Note_tbl.getSelectedRow();
            int column = Note_tbl.getSelectedColumn();

            
            Note_tbl.setValueAt(newValue, row, column);

           
            String updateSql = "UPDATE notes SET NOTE_N = ? WHERE ID = ?";
            pst = con.prepareStatement(updateSql);
            pst.setString(1, newValue);
            pst.setInt(2, Integer.parseInt(Note_tbl.getValueAt(row, 0).toString())); // Assuming the first column is the ID

            
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Successfully Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update");
            }

            
            Add_note_txtArea.setText("");
            Add_note_txtArea.requestFocus();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }//GEN-LAST:event_UpdateNoteJBtnActionPerformed

    private void AddNewNoteCategoryJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewNoteCategoryJBtnActionPerformed

        this.setVisible(true);
        new Category().setVisible(true);
    }//GEN-LAST:event_AddNewNoteCategoryJBtnActionPerformed

    private void ClearNoteJBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearNoteJBtn1ActionPerformed
           Add_note_txtArea.setText("");        
    }//GEN-LAST:event_ClearNoteJBtn1ActionPerformed

    private void CategoryNoteListjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryNoteListjComboBox1ActionPerformed

        String sql = "SELECT * FROM category";
        try {
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(); // Create a model for the combobox

           
            int selectedIndex = -1; 
            String selectedCategory = null;  
                 
            while (rs.next()) {
                String categoryName = rs.getString(2); 
                model.addElement(categoryName); 

                
                if (categoryName.equals(CategoryNoteListjComboBox1.getSelectedItem())) {
                    selectedIndex = model.getSize() - 1; 
                    selectedCategory = categoryName; 
                }
            }

            CategoryNoteListjComboBox1.setModel(model); 

            
            if (selectedIndex != -1) {
                CategoryNoteListjComboBox1.setSelectedIndex(selectedIndex);
            }

           
            if (selectedCategory != null) {
               
            }

        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_CategoryNoteListjComboBox1ActionPerformed

    private String getCurrentDate() {
   
    LocalDate currentDate = LocalDate.now();
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    return currentDate.format(formatter);
}
private String getCurrentTime() {
    
    return java.time.LocalTime.now().toString();
}


     private void clearTable() {
     
        DefaultTableModel model = (DefaultTableModel) Note_tbl.getModel();
        model.setRowCount(0);
    }

    private void displayCategoryData() {
      
        String sql = "SELECT * FROM notes";
        try {
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)Note_tbl .getModel();
            while (rs.next()) {
            model.addRow(new String[]{rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4)});
            }
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewNoteCategoryJBtn;
    private javax.swing.JButton AddNoteJBtn;
    private javax.swing.JTextArea Add_note_txtArea;
    private javax.swing.JButton Btn1_view;
    private javax.swing.JComboBox<String> CategoryNoteListjComboBox1;
    private javax.swing.JButton ClearNoteJBtn1;
    private javax.swing.JButton DeleteNoteJBtn;
    private javax.swing.JPanel Note_Panel;
    private javax.swing.JTabbedPane Note_tbd_pane;
    private javax.swing.JTable Note_tbl;
    private javax.swing.JButton UpdateNoteJBtn;
    private javax.swing.JLabel jDateChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables

    
}



















