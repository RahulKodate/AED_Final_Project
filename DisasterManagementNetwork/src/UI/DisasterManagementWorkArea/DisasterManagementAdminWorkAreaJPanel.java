/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DisasterManagementWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author moins
 */
public class DisasterManagementAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem business;
    Enterprise enterprise;
    
    /**
     * Creates new form EnvironmentManagementAdminWorkAreaJPanel
     */
    public DisasterManagementAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business) {
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

        lblTitle = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnManageOrganization = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("Disaster Management Admin Work Area");
        add(lblTitle);
        lblTitle.setBounds(110, 100, 530, 29);

        lblEnterprise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnterprise.setText("Enterprise :");
        add(lblEnterprise);
        lblEnterprise.setBounds(150, 160, 120, 30);

        valueLabel.setBackground(new java.awt.Color(255, 255, 255));
        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(0, 0, 51));
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(330, 160, 406, 22);

        btnManageOrganization.setBackground(new java.awt.Color(0, 0, 204));
        btnManageOrganization.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });
        add(btnManageOrganization);
        btnManageOrganization.setBounds(250, 230, 220, 24);

        btnManageEmployee.setBackground(new java.awt.Color(0, 0, 204));
        btnManageEmployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        add(btnManageEmployee);
        btnManageEmployee.setBounds(260, 340, 220, 24);

        btnManageUser.setBackground(new java.awt.Color(0, 0, 204));
        btnManageUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageUser.setForeground(new java.awt.Color(255, 255, 255));
        btnManageUser.setText("Manage User");
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });
        add(btnManageUser);
        btnManageUser.setBounds(260, 460, 220, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin_work_area.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 790, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        DisasterManagementOrganizationJPanel disasterManagementOrganizationJPanel = new DisasterManagementOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("disasterManagementOrganizationJPanel", disasterManagementOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed

        DisasterManagementEmployeeJPanel disasterManagementEmployeeJPanel = new DisasterManagementEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("disasterManagementEmployeeJPanel", disasterManagementEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        // TODO add your handling code here:
        DisasterManagementUserJPanel disasterManagementUserJPanel = new DisasterManagementUserJPanel(userProcessContainer, enterprise,business);
        userProcessContainer.add("disasterManagementUserJPanel", disasterManagementUserJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
