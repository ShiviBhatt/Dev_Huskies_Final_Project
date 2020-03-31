/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VoluntaryUnitWorkArea.VoluntaryUnitAdminWorkAreaJPanel;

/**
 *
 * @author Mayank
 */
public class VoluntaryUnitAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //throw new Volun("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new VoluntaryUnitAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }
    
    @Override
    public String toString(){
        return (RoleType.VoluntaryUnitAdmin.getValue());
    }
}
