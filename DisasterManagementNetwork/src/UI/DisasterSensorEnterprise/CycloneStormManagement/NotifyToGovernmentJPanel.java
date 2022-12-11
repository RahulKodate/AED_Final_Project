/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DisasterSensorEnterprise.CycloneStormManagement;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CycloneStormManagementOrganization;
import Business.Organization.SensorMonitorOrganization;
import Business.Organization.GovernmentOfficialOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Sensor.CycloneStormSensor;
import Business.Sensor.Sensor;
import Business.Sensor.SensorDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CycloneStormWorkRequest;
import Business.WorkQueue.GovernmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UI.DisasterSensorEnterprise.SensorManagement.SensorMonitorWorkArea;

/**
 *
 * @author moins
 */
public class NotifyToGovernmentJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private OrganizationDirectory organizationDirectory;
    

    /**
     * Creates new form NotifyToGovernmentJPanel
     */
    public NotifyToGovernmentJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem business, OrganizationDirectory organizationDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        this.organizationDirectory = organizationDirectory;
        
        populateTable();
    }
    
    public void populateTable(){
         ArrayList<CycloneStormSensor> tempCycloneStormSensorList = new ArrayList<CycloneStormSensor>();

        for(Network ntwk: business.getNetworkList())
        {
            for(Enterprise entprise : ntwk.getEnterpriseDirectory().getEnterpriseList())
            {
                for(Organization org : entprise.getOrganizationDirectory().getOrganizationList())
            {
            if(org instanceof SensorMonitorOrganization)
            {
                SensorDirectory sensedirect;
                sensedirect = ((SensorMonitorOrganization) org).getSensorDirectory();
                
                for(Sensor sense : sensedirect.getSensorList())
                {
                    if(sense instanceof CycloneStormSensor)
                    {
                        CycloneStormSensor air = (CycloneStormSensor)sense;
                        tempCycloneStormSensorList.add(air);
                    }
                }
            }

            }
        }   }
            
            DefaultTableModel model = (DefaultTableModel) tblCycloneStorm.getModel();
        model.setRowCount(0);
        
        for(CycloneStormSensor css : tempCycloneStormSensorList)
                {
                    if(css.getWindSpeed()>30)
                    {
                        Object[] row = new Object[4];
                        row[0] = css;
                        row[1] = css.getZipcode();
                        row[2] = css.getWindSpeed();
                        model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCycloneStorm = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRequestToGovernment = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(222, 222, 248));
        setLayout(null);

        tblCycloneStorm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sensor ID", "Zipcode", "Wind Speed"
            }
        ));
        jScrollPane1.setViewportView(tblCycloneStorm);

        add(jScrollPane1);
        jScrollPane1.setBounds(230, 420, 710, 220);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(91, 130, 170));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cyclone & Storm Sensor Readings");
        add(jLabel1);
        jLabel1.setBounds(0, 140, 770, 50);

        btnBack.setText("<< Back");
        btnBack.setSize(new java.awt.Dimension(120, 40));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(20, 30, 80, 50);

        btnRequestToGovernment.setBackground(new java.awt.Color(91, 130, 170));
        btnRequestToGovernment.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnRequestToGovernment.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestToGovernment.setText("Send Request To Government");
        btnRequestToGovernment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestToGovernmentActionPerformed(evt);
            }
        });
        add(btnRequestToGovernment);
        btnRequestToGovernment.setBounds(430, 680, 310, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/rahulkodate/Downloads/Images for AED Project/Cyclone/cyclone786.jpeg")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 200, 1160, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestToGovernmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestToGovernmentActionPerformed
        // TODO add your handling code here:
        int row = tblCycloneStorm.getSelectedRow();
        if(row <0){
            JOptionPane.showMessageDialog(null, "No row selected");
        }else{
        
        Sensor sensor = (Sensor)tblCycloneStorm.getValueAt(row, 0);
        
        CycloneStormSensor cycloneStormSensor = (CycloneStormSensor) sensor;
        GovernmentWorkRequest reques = new GovernmentWorkRequest();
        reques.setCycloneStormSensor(cycloneStormSensor);
        reques.setCycloneStormMessage("Area-code "+cycloneStormSensor.getZipcode()+" is affected by Cyclones and Storm, please inform citizens to avoid this area until further notice");
        reques.setSender(userAccount);
        reques.setStatus("Successfully Notified to Government");
        
        Organization orgn = null;
        for(Network ntwk: business.getNetworkList())
        {
            for(Enterprise enterprise : ntwk.getEnterpriseDirectory().getEnterpriseList())
            {
                for(Organization orgzn : enterprise.getOrganizationDirectory().getOrganizationList())
                {
            
            if (orgzn instanceof GovernmentOfficialOrganization){
                orgn = orgzn;
                break;
                    }           
                }
            } 
        }
        if (orgn!=null){
            
            ArrayList<Integer> sensorIDsArray = new ArrayList<Integer>();
            boolean workRequestAlreadyPresent = false;
                    
            if(orgn.getWorkQueue().getWorkRequestList().isEmpty())
            {
                try {
                orgn.getWorkQueue().getWorkRequestList().add(reques);
                userAccount.getWorkQ().getWorkRequestList().add(reques);
                JOptionPane.showMessageDialog(null, "Request sent to Government successfully");
                return;
                } catch (Exception e) {
                }
                 JOptionPane.showMessageDialog(null, "Request sent to Government successfully");
            }
            else
            {
            for(WorkRequest request1 : orgn.getWorkQueue().getWorkRequestList())
            {
                if(request1 instanceof GovernmentWorkRequest)
                {
                    GovernmentWorkRequest reque = (GovernmentWorkRequest) request1;
                    
                    if(reque.getCycloneStormSensor() != null)
                    {
                    sensorIDsArray.add(reque.getCycloneStormSensor().getSensorId());
                    for(int i=0; i<sensorIDsArray.size(); i++)
                    {
                        if(reques.getCycloneStormSensor().getSensorId() == sensorIDsArray.get(i))
                        {
                            workRequestAlreadyPresent = true;
                        }
                    }
                  }
                }
              }
                    if(workRequestAlreadyPresent)   
                    {
                        JOptionPane.showMessageDialog(null, "Request has already been sent to Government");
                    }
                    else
                    {
                        try {
                        orgn.getWorkQueue().getWorkRequestList().add(reques);
                        userAccount.getWorkQ().getWorkRequestList().add(reques);
                        JOptionPane.showMessageDialog(null, "Request sent to Government successfully");
                        return;
                        } catch (Exception e) {
                        }
                         JOptionPane.showMessageDialog(null, "Request sent to Government successfully");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRequestToGovernmentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        //JPanel panel = new NotifytoAirPolltuionSolutionDepartment(userProcessContainer,userAccount,business,organizationDirectory);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestToGovernment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCycloneStorm;
    // End of variables declaration//GEN-END:variables
}
