/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VoluntaryUnitWorkArea.VoluntaryOperatingUnitAdminWorkAreaJPanel;

/**
 *
 * @author Mayank
 */
public class VoluntaryUnitAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem ecosystem) {
        //throw new Volun("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new VoluntaryOperatingUnitAdminWorkAreaJPanel(userProcessContainer, account,organization, enterprise, network, ecosystem);
    }
  
    @Override
    public String toString(){
        return (RoleType.VoluntaryUnitAdmin.getValue());
    }
}
