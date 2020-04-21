/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PersonalAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivibhatt
 */
public class VolunteerPersonalOrganization extends Organization {
    private String name;
    private String volunteerPersonal;
    
    public VolunteerPersonalOrganization(String name) {
        super(name);
        this.name=name;
        volunteerPersonal=name;
    }

    public String getVolunteerPersonal() {
        return volunteerPersonal;
    }

    public void setVolunteerPersonal(String volunteerPersonal) {
        this.volunteerPersonal = volunteerPersonal;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new PersonalAdmin());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.Personal;
    } 
    
}
