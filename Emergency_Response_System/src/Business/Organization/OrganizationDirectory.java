/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Location.LocationPoint;
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

    public Organization createOrganization(Type type, String name) {
        return createOrganization(type, name, null);
    }

    public Organization createOrganization(Type type, String name, LocationPoint locationPoint) {
        Organization organization = null;
        if (type.getValue().equals(Type.IncidentReportingAgency.getValue())) {
            organization = new IncidentManagementOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PoliceHead.getValue())) {
            organization = new PoliceOrganization(name);
            PoliceOrganization police = (PoliceOrganization) organization;
            police.setPolice(name);
            //organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Hospital.getValue())) {
            organization = new VolunteerHospitalOrganization(name);
            VolunteerHospitalOrganization hospital = (VolunteerHospitalOrganization) organization;
            hospital.setHospital(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Personal.getValue())) {
            organization = new VolunteerPersonalOrganization(name);
            VolunteerPersonalOrganization personal = (VolunteerPersonalOrganization) organization;
            personal.setVolunteerPersonal(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGO.getValue())) {
            organization = new VolunteerNGOOrganization(name);
            VolunteerNGOOrganization ngo = (VolunteerNGOOrganization) organization;
            ngo.setVolunteerNGO(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Company.getValue())) {
            organization = new VolunteerCompanyOrganization(name);
            VolunteerCompanyOrganization company = (VolunteerCompanyOrganization) organization;
            company.setVolunteerCompany(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        }

        return organization;
    }
}
