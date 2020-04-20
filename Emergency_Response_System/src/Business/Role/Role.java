/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        IncidentUnitManager("IncidentManager"),
        EmergencyUnitAdmin("ERUAdmin"),
        VoluntaryUnitAdmin("VoluntaryTeamAdmin"),
        SceneManager("SceneManager"),
        PoliceHead("Police Head"),
        PoliceLieutenant("Police Lieutenant"),
        PoliceOfficer("Police Officer"),
        PoliceSeargent("Police Seargent"),
        FireSafetyHead("FireSafetyHead"),
        MedicalAgencyHead("MedicalAgencySupervisor"),
        NGOAdmin("NGOAdmin"),
        PersonalAdmin("PersonalAdmin"),
        ReportingAdmin("ReportingAdmin"),
        HospitalAdmin("HospitalAdmin"),
        CompanySupervisor("CompanySupervisor"),
        FireFighter("Fire Fighter"),
        DisasterHead("DisasterHead"),
        PharmaHead("Pharma Head"),
        VaccineUnitAdmin("VaccineUnitAdmin");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}