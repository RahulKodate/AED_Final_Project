/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.GovernmentAgencyWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rahul
 */
public class GovernmentAgencyAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise; 
    private EcoSystem business;
    /**
     * Creates new form GovernmentAdminWorkAreaJPanel
     */
    public GovernmentAgencyAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business = business;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btn_Manage_Ogr = new javax.swing.JButton();
        btn_Employee = new javax.swing.JButton();
        btn_Manage_User = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(222, 222, 248));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Government Admin Work Area");
        add(jLabel1);
        jLabel1.setBounds(250, 40, 482, 55);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(260, 120, 120, 30);

        valueLabel.setBackground(new java.awt.Color(255, 255, 255));
        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(440, 120, 556, 22);

        btn_Manage_Ogr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Manage_Ogr.setText("Manage Organization");
        btn_Manage_Ogr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Manage_OgrActionPerformed(evt);
            }
        });
        add(btn_Manage_Ogr);
        btn_Manage_Ogr.setBounds(520, 180, 320, 40);

        btn_Employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Employee.setText("Manage Employee");
        btn_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EmployeeActionPerformed(evt);
            }
        });
        add(btn_Employee);
        btn_Employee.setBounds(520, 280, 330, 40);

        btn_Manage_User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Manage_User.setText("Manage User");
        btn_Manage_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Manage_UserActionPerformed(evt);
            }
        });
        add(btn_Manage_User);
        btn_Manage_User.setBounds(520, 390, 330, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/governemntadminwork.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 10, 930, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Manage_OgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_OgrActionPerformed
        // TODO add your handling code here:
        GovernmentOrganizationJPanel governmentEnterpriseJPanel = new GovernmentOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("governmentEnterpriseJPanel", governmentEnterpriseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_Manage_OgrActionPerformed

    private void btn_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EmployeeActionPerformed
        // TODO add your handling code here:
        
        GovernmentEmployeeJPanel governmentEmployeeJPanel = new GovernmentEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("governmentEmployeeJPanel", governmentEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_EmployeeActionPerformed

    private void btn_Manage_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Manage_UserActionPerformed
        // TODO add your handling code here:
         GovernmentUserJPanel governmentUserJPanel = new GovernmentUserJPanel(userProcessContainer, enterprise,business);
        userProcessContainer.add("governmentUserJPanel", governmentUserJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_Manage_UserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Employee;
    private javax.swing.JButton btn_Manage_Ogr;
    private javax.swing.JButton btn_Manage_User;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
