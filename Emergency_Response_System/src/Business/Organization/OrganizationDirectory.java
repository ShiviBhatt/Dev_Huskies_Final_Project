/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Position;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String name){
        Organization organization = null;
        if (type.getValue().equals(Type.IncidentReportingAgency.getValue())){
            organization = new IncidentManagementOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PoliceHead.getValue())) {
            organization = new PoliceOrganization(name);
            PoliceOrganization police = (PoliceOrganization) organization;
            police.setPolice(name);
            //organization.setPosition(position);
            organizationList.add(organization);
        } 
        return organization;
    }
}