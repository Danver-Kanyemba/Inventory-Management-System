/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict.inventory.ordinaryuser;

import ict.inventory.connectionpackage.ConnectToDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author danverkanyemba
 */
public class UpdateEmployeeNameFrm extends javax.swing.JFrame {
    /**
     * Creates new form updateDepartmentsNameFrm
     */
    String DepartmentId,employeeNm;
    
    public UpdateEmployeeNameFrm(String employeeNm) {
        initComponents();
        employeeNameTxt.setText(employeeNm);
        retrieveDepartment();
        this.employeeNm = employeeNm;
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        employeeNameTxt = new javax.swing.JTextField();
        UpdateEmployeeBtn = new javax.swing.JButton();
        departmentComboBox = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(java.awt.Color.white);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(64, 64, 64));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Update Employee");
        jLabel18.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, java.awt.Color.blue), javax.swing.BorderFactory.createEmptyBorder(1, 9, 1, 1)));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(64, 64, 64));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("Name:");

        employeeNameTxt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        employeeNameTxt.setPreferredSize(new java.awt.Dimension(6, 29));

        UpdateEmployeeBtn.setBackground(new java.awt.Color(13, 101, 205));
        UpdateEmployeeBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UpdateEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateEmployeeBtn.setText("Add Employee");
        UpdateEmployeeBtn.setBorder(null);
        UpdateEmployeeBtn.setBorderPainted(false);
        UpdateEmployeeBtn.setFocusPainted(false);
        UpdateEmployeeBtn.setPreferredSize(new java.awt.Dimension(75, 29));
        UpdateEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeBtnActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(64, 64, 64));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Department Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departmentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(employeeNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(UpdateEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(departmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(UpdateEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void retrieveDepartment(){
        try {
            ConnectToDB classForConnecting = new ConnectToDB();
            String query = "SELECT name FROM department";
            Statement st = classForConnecting.conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            Departments departments;
            while(rs.next()){
                String DepartmentName = rs.getString("name");
                departmentComboBox.addItem(DepartmentName);
            }
        classForConnecting.conn.close();
        }
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UpdateEmployeeNameFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }         
    
    private void UpdateEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeBtnActionPerformed
        String employeeName = employeeNameTxt.getText();
        if(employeeName.isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Employee Name ");
        }
        else{
            try {
                ConnectToDB classForConnecting = new ConnectToDB();
                String departmentName = departmentComboBox.getSelectedItem().toString();
                String querySelectIdForDepartment = "SELECT id FROM department where name='"+departmentName+"'";
                Statement st = classForConnecting.conn.createStatement();
                ResultSet rs = st.executeQuery(querySelectIdForDepartment);
                while(rs.next()){
                   DepartmentId = rs.getString("id");
                }
                
                String queryAddEmployee = "UPDATE employee SET name= ?, department_id = ? WHERE name = '"+employeeNm+"' ";
                PreparedStatement queryAddDepartment = classForConnecting.conn.prepareStatement(queryAddEmployee);
                queryAddDepartment.setString(1, employeeName);
                queryAddDepartment.setString(2, DepartmentId);
                queryAddDepartment.executeUpdate();
                classForConnecting.conn.close();
                this.dispose();
                JOptionPane.showMessageDialog(null,"Employee added");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(UpdateEmployeeNameFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_UpdateEmployeeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UpdateDepartmentsNameFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UpdateDepartmentsNameFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UpdateDepartmentsNameFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UpdateDepartmentsNameFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UpdateDepartmentsNameFrm(String departmentName).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton UpdateEmployeeBtn;
    private javax.swing.JComboBox<String> departmentComboBox;
    private static javax.swing.JTextField employeeNameTxt;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
