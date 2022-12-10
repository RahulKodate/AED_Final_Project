/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DisasterManagementRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CycloneStormManagementOrganization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moins
 */
public class CycloneStormManagementWorkJPanel extends javax.swing.JPanel {
   private JPanel userProcessContainer;
    private UserAccount account; 
    private CycloneStormManagementOrganization organization; 
    private Enterprise enterprise; 
    private EcoSystem business;
    /**
     * Creates new form AirPollutionManagementWorkJPanel
     */
    public CycloneStormManagementWorkJPanel(JPanel userProcessContainer, UserAccount account, CycloneStormManagementOrganization organization, Enterprise enterprise, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
       this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
       initComponents();
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
        btnViewWorkRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 102));
        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cyclone & Storm Management Work Area");
        add(lblTitle);
        lblTitle.setBounds(10, 27, 520, 29);

        btnViewWorkRequest.setForeground(new java.awt.Color(0, 0, 153));
        btnViewWorkRequest.setText("View Work request");
        btnViewWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewWorkRequestActionPerformed(evt);
            }
        });
        add(btnViewWorkRequest);
        btnViewWorkRequest.setBounds(140, 140, 170, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/air-pollution.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 980, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewWorkRequestActionPerformed
        // TODO add your handling code here:
          CycloneStormManagementWorkQueueJPanel cycloneStormManagementWorkQueue = new CycloneStormManagementWorkQueueJPanel(userProcessContainer, account, enterprise.getOrganizationDirectory());
        userProcessContainer.add("cycloneStormManagementWorkQueue", cycloneStormManagementWorkQueue);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewWorkRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewWorkRequest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

}