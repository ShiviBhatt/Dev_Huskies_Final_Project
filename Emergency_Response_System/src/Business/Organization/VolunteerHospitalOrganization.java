/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalAdmin;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author shivibhatt
 */
public class VolunteerHospitalOrganization extends Organization{
    
    String name;
    public VolunteerHospitalOrganization(String name) {
        super(name);
        this.name=name;
        hospital = name;
    }

      private String hospital;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalAdmin());
        return roles;
    }
     
       @Override
    public String toString() {
        return hospital;
    }
       @Override
    public Type getType() {
        return Organization.Type.Hospital;
    } 
    
    
}
