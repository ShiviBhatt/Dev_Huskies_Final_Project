/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class VoluntaryOperatingUnit extends Enterprise{

    public VoluntaryOperatingUnit(String name) {
        super(name, Enterprise.EnterpriseType.VoluntaryOperatingUnit);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet");
    }
    
}
