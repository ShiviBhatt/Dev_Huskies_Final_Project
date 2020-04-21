/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FireSafetyHead;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class FireSafetyOrganization extends Organization{
    
    private String fireSafety;
    
    public FireSafetyOrganization(String name) {
        super(name);
        fireSafety = name;
        //setType(Organization.Type.FireSafety);
    }

    public String getFireSafety() {
        return fireSafety;
    }

    public void setFireSafety(String fireSafety) {
        this.fireSafety = fireSafety;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FireSafetyHead());
        return roles;
    }

    @Override
    public Type getType() {
        return Organization.Type.FireSafety;
    }  
}
