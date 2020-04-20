/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CompanySupervisor;
import Business.Role.HospitalAdmin;
import Business.Role.NGOAdmin;
import Business.Role.PersonalAdmin;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Shivi Bhatt
 */
public class VoluntaryOperatingUnit extends Enterprise{

    public VoluntaryOperatingUnit(String name) {
        super(name, Enterprise.EnterpriseType.VoluntaryOperatingUnit);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new PersonalAdmin());
        roles.add(new HospitalAdmin());
        roles.add(new NGOAdmin());
        roles.add(new CompanySupervisor());
       return roles;
    }
    
}
