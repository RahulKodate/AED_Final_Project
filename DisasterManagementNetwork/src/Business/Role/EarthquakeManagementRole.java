/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EarthquakeManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.DisasterManagementWorkQueue.EarthquakeManagementWorkJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Arnab
 */
public class EarthquakeManagementRole extends Roles{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EarthquakeManagementWorkJPanel(userProcessContainer, account, (EarthquakeManagementOrganization)organization, enterprise, business);
    }
}
