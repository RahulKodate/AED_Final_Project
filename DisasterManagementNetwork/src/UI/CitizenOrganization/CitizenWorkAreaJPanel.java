/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CitizenOrganization;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CitizenOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author moins
 */
public class CitizenWorkAreaJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final UserAccount account;
    private final CitizenOrganization organization;
    private final Enterprise enterprise;
    private final EcoSystem business;

    /**
     * Creates new form ResidentWorkAreaJPanel
     */
    
    public CitizenWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CitizenOrganization organization, Enterprise enterprise, EcoSystem business) {
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

        lblTitle = new javax.swing.JLabel();
        btnViewNotification = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 102));
        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Resident Work Area");
        add(lblTitle);
        lblTitle.setBounds(0, 23, 970, 44);

        btnViewNotification.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewNotification.setText("View Notification");
        btnViewNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewNotificationActionPerformed(evt);
            }
        });
        add(btnViewNotification);
        btnViewNotification.setBounds(350, 180, 210, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/resident.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(-90, -160, 1150, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewNotificationActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        NotifyCitizenJPanel citizenNotificationJPanel = new NotifyCitizenJPanel(userProcessContainer, account, enterprise.getOrganizationDirectory());
        userProcessContainer.add("citizenNotificationJPanel", citizenNotificationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewNotificationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewNotification;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
