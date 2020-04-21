/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PoliceHead;
import Business.Role.Role;
import static Business.Role.Role.RoleType.PoliceHead;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Mayank
 */
public class PoliceOrganization extends Organization{
    
    private String police;
    
    public PoliceOrganization(String name) {
        super(name);
        police = name;
        //setType(Organization.Type.PoliceHead);
    }

    public String getPolice() {
        return police;
    }

    public void setPolice(String police) {
        this.police = police;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PoliceHead());
        return roles;
    }

    @Override
    public Type getType() {
        return Organization.Type.PoliceHead;
    } 
    
}
