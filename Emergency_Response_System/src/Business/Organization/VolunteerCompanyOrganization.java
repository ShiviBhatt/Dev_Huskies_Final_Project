/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CompanySupervisor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivibhatt
 */
public class VolunteerCompanyOrganization extends Organization {
    private String name;
    private String volunteerCompany;

    public VolunteerCompanyOrganization(String name) {
        super(name);
        this.name = name;
        volunteerCompany = name;
    }

    public String getVolunteerCompany() {
        return volunteerCompany;
    }

    public void setVolunteerCompany(String volunteerCompany) {
        this.volunteerCompany = volunteerCompany;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList();
        roles.add(new CompanySupervisor());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.Company;
    } 
}
