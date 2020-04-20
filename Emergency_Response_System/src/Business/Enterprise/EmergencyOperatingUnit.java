/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.FireSafetyHead;
import Business.Role.PoliceHead;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Mayank
 */
public class EmergencyOperatingUnit extends Enterprise{

    public EmergencyOperatingUnit(String name) {
        super(name, Enterprise.EnterpriseType.EmergencyOperatingUnit);
    }

    @Override
    
         public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new FireSafetyHead());
        roles.add(new PoliceHead());
        return roles;
    }
    
}
