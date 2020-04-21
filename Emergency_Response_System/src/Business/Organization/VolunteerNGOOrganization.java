/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NGOAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivibhatt
 */
public class VolunteerNGOOrganization extends Organization {
    private String name;
    private String volunteerNGO;

    public VolunteerNGOOrganization(String name) {
        super(name);
        this.name=name;
        volunteerNGO=name;
    }

    public String getVolunteerNGO() {
        return volunteerNGO;
    }

    public void setVolunteerNGO(String volunteerNGO) {
        this.volunteerNGO = volunteerNGO;
    }

  

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOAdmin());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.NGO;
    } 
}
