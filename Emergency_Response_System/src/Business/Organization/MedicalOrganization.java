/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicalAgencyHead;
import Business.Role.PharmaHead;
import Business.Role.Role;
import Business.Role.VaccineUnitAdmin;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author dhankuwarsisodiya
 */
public class MedicalOrganization extends Organization{
    
    private String name;

    public MedicalOrganization(String name) {
        super(name);
        this.name = name;
        medicenes = name;
    }

    private String medicenes;

    public String getMedicenes() {
        return medicenes;
    }

    public void setMedicenes(String medicenes) {
        this.medicenes = medicenes;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmaHead());
        roles.add(new VaccineUnitAdmin());
        roles.add(new MedicalAgencyHead());
        return roles;

    }
}
