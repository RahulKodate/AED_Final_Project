/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.GovernmentOfficial;

import java.util.Properties;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.Organization.SensorMonitorOrganization;
import Business.Organization.GovernmentOfficialOrganization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.CitizenOrganization;
import Business.Sensor.CycloneStormSensor;
import Business.Sensor.Sensor;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.CitizenWorkRequest;
import Business.WorkQueue.GovWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moins
 */
public class GovernmentOfficialEarthquakeQueueJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem business;
    private GovernmentOfficialOrganization organization; 
    /**
     * Creates new form GovernmentOfficialWorkQueueJPanel
     */
    public GovernmentOfficialEarthquakeQueueJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.directory = directory;
        this.enterprise = enterprise;
        
        this.business = business;
        
        populateTable();
    }

    public void populateTable(){
        GovWorkRequest gov_wrs = null;
        DefaultTableModel model = (DefaultTableModel) tbl_Gov_wrd_queue.getModel();
        model.setRowCount(0);
        
        for(Organization organization : directory.getOrganizationList())
        {
        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof GovWorkRequest)
            {                
                gov_wrs = (GovWorkRequest)wr;
            
                if(gov_wrs.getCycloneStormSensor() != null)
                {
                Object[] row = new Object[3];
                row[0] = gov_wrs;
                row[1] = gov_wrs.getSender();
                row[2] = gov_wrs.getCycloneStormMessage();
                model.addRow(row);
                }
            }
        }
        }
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
        MessagejLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Gov_wrd_queue = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnNotifyResidents = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 102));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Government Official Work Queue");
        add(jLabel1);
        jLabel1.setBounds(340, 30, 450, 29);

        MessagejLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        MessagejLabel.setForeground(new java.awt.Color(255, 0, 51));
        add(MessagejLabel);
        MessagejLabel.setBounds(663, 446, 0, 0);

        tbl_Gov_wrd_queue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Work_request_Id", "Sender", "Mesage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_Gov_wrd_queue);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 144, 1000, 90);

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(10, 20, 100, 23);

        btnNotifyResidents.setBackground(new java.awt.Color(0, 255, 0));
        btnNotifyResidents.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNotifyResidents.setForeground(new java.awt.Color(255, 255, 255));
        btnNotifyResidents.setText("Send Resolved Notification");
        btnNotifyResidents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotifyResidentsActionPerformed(evt);
            }
        });
        add(btnNotifyResidents);
        btnNotifyResidents.setBounds(30, 530, 280, 24);

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Send Alert Notification to Residents");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(720, 520, 260, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Boston-120419-Governor-office-renovations-PHOTO-scaled.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1120, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
         JPanel panel = new GovernmentOfficialWorkAreaJPanel(userProcessContainer,userAccount,organization, enterprise,business);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNotifyResidentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotifyResidentsActionPerformed
        // TODO add your handling code here:
        int row = tbl_Gov_wrd_queue.getSelectedRow();
        if(row <0){
            JOptionPane.showMessageDialog(null, "No row selected");
        }else{
        
        GovWorkRequest request = (GovWorkRequest)tbl_Gov_wrd_queue.getValueAt(row, 0);
        
        CitizenWorkRequest citizenWorkRequest = new CitizenWorkRequest();
        
        citizenWorkRequest.setCycloneStormSensor(request.getCycloneStormSensor());
        citizenWorkRequest.setCycloneStormMessage("The Area bearing pincode "+request.getCycloneStormSensor().getZipcode()+"'s air quality has now improved.");
        citizenWorkRequest.setSender(userAccount);
        citizenWorkRequest.setStatus("Message Sent to Citizens");
        
        Organization orgn = null;
        Organization orgn1 = null;
                for(Organization org : directory.getOrganizationList())
                {
            //System.out.println(org.getName());
            if (org instanceof GovernmentOfficialOrganization){
                orgn = org;
                break;
            }
           
            } 
                for(Organization org1 : directory.getOrganizationList())
                {
                if(org1 instanceof CitizenOrganization){
                orgn1 = org1;
                break;
            
            } }
        if (orgn!=null){
            orgn.getWorkQueue().getWorkRequestList().add(citizenWorkRequest);
            userAccount.getWorkQ().getWorkRequestList().add(citizenWorkRequest);
        }
        
        if (orgn1!=null){            
            orgn1.getWorkQueue().getWorkRequestList().add(citizenWorkRequest);
            userAccount.getWorkQ().getWorkRequestList().add(citizenWorkRequest);
        }
         JOptionPane.showMessageDialog(null, "Request Sent to Citizen");
        }
    }//GEN-LAST:event_btnNotifyResidentsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int row = tbl_Gov_wrd_queue.getSelectedRow();
        if(row <0){
            JOptionPane.showMessageDialog(null, "No row selected");
        }else{
        
        GovWorkRequest request = (GovWorkRequest)tbl_Gov_wrd_queue.getValueAt(row, 0);
        
        CitizenWorkRequest citizenWorkRequest = new CitizenWorkRequest();
        
        citizenWorkRequest.setCycloneStormSensor(request.getCycloneStormSensor());
        citizenWorkRequest.setCycloneStormMessage("The Area bearing pincode "+request.getCycloneStormSensor().getZipcode()+" has bad air quality please avoid this area until further notice");
        citizenWorkRequest.setSender(userAccount);
        citizenWorkRequest.setStatus("Message Sent to Citizens");
        
        Organization orgn = null;
        Organization orgn1 = null;
                for(Organization org : directory.getOrganizationList())
                {
            //System.out.println(org.getName());
            if (org instanceof GovernmentOfficialOrganization){
                orgn = org;
                break;
            }
           
            } 
                for(Organization org1 : directory.getOrganizationList())
                {
                if(org1 instanceof CitizenOrganization){
                orgn1 = org1;
                break;
            
            } }
        if (orgn!=null){
            orgn.getWorkQueue().getWorkRequestList().add(citizenWorkRequest);
            userAccount.getWorkQ().getWorkRequestList().add(citizenWorkRequest);
        }
        
        if (orgn1!=null){            
            orgn1.getWorkQueue().getWorkRequestList().add(citizenWorkRequest);
            userAccount.getWorkQ().getWorkRequestList().add(citizenWorkRequest);
        }
         JOptionPane.showMessageDialog(null, "Request Sent to Citizen");
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MessagejLabel;
    private javax.swing.JButton btnNotifyResidents;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_Gov_wrd_queue;
    // End of variables declaration//GEN-END:variables
}
