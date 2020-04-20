/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DisasterOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DisasterManagementWorkArea.DisasterAdminWorkAreaJPanel;
import userinterface.PoliceWorkArea.PoliceAdminWorkAreaJPanel;

/**
 *
 * @author dhankuwarsisodiya
 */
public class DisasterHead extends Role{
//    public DisasterHead(){
//        System.out.println("in disaster head");
//    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new DisasterAdminWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network, business);
    }
    
    @Override
    public String toString(){
        return (RoleType.DisasterHead.getValue());
    }
}
