/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.GovernmentOfficial;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GovernmentOfficialOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author moins
 */
public class GovernmentOfficialWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account; 
    private GovernmentOfficialOrganization organization; 
    private Enterprise enterprise; 
    private EcoSystem business;
    /**
     * Creates new form GovernmentOfficialWorkAreaJPanel
     */
    public GovernmentOfficialWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, GovernmentOfficialOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
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
        btnCycloneStormQueue = new javax.swing.JButton();
        btnViewFloodQueue = new javax.swing.JButton();
        btnEarthquakeQueue = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(222, 222, 248));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Government Official Work Area");
        add(jLabel1);
        jLabel1.setBounds(270, 60, 510, 29);

        btnCycloneStormQueue.setForeground(new java.awt.Color(0, 0, 255));
        btnCycloneStormQueue.setText("View Cyclone Storm Queue");
        btnCycloneStormQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCycloneStormQueueActionPerformed(evt);
            }
        });
        add(btnCycloneStormQueue);
        btnCycloneStormQueue.setBounds(50, 200, 240, 60);

        btnViewFloodQueue.setForeground(new java.awt.Color(0, 51, 255));
        btnViewFloodQueue.setText("View Flood Queue");
        btnViewFloodQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFloodQueueActionPerformed(evt);
            }
        });
        add(btnViewFloodQueue);
        btnViewFloodQueue.setBounds(380, 200, 240, 60);

        btnEarthquakeQueue.setForeground(new java.awt.Color(0, 0, 255));
        btnEarthquakeQueue.setText("View Earthquake queue");
        btnEarthquakeQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEarthquakeQueueActionPerformed(evt);
            }
        });
        add(btnEarthquakeQueue);
        btnEarthquakeQueue.setBounds(690, 200, 240, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/govworkqueue.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(-30, -80, 1740, 870);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCycloneStormQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCycloneStormQueueActionPerformed
        // TODO add your handling code here:
        GovernmentOfficialCycloneStormQueueJPanel governmentOfficialCycloneStormQueueJPanel = new GovernmentOfficialCycloneStormQueueJPanel(userProcessContainer, account, enterprise, enterprise.getOrganizationDirectory());
        userProcessContainer.add("governmentOfficialCycloneStormQueueJPanel", governmentOfficialCycloneStormQueueJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCycloneStormQueueActionPerformed

    private void btnViewFloodQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFloodQueueActionPerformed
        // TODO add your handling code here:
        GovernmentOfficialFloodQueueJPanel governmentOfficialFloodQueueJPanel = new GovernmentOfficialFloodQueueJPanel(userProcessContainer, account, enterprise, enterprise.getOrganizationDirectory());
        userProcessContainer.add("governmentOfficialFloodQueueJPanel", governmentOfficialFloodQueueJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewFloodQueueActionPerformed

    private void btnEarthquakeQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEarthquakeQueueActionPerformed
        // TODO add your handling code here:
        GovernmentOfficialEarthquakeQueueJPanel governmentOfficialEarthquakeQueueJPanel = new GovernmentOfficialEarthquakeQueueJPanel(userProcessContainer, account, enterprise, enterprise.getOrganizationDirectory());
        userProcessContainer.add("governmentOfficialEarthquakeQueueJPanel", governmentOfficialEarthquakeQueueJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEarthquakeQueueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCycloneStormQueue;
    private javax.swing.JButton btnEarthquakeQueue;
    private javax.swing.JButton btnViewFloodQueue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
