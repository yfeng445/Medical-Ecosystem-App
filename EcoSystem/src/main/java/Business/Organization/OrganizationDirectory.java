/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Organization.Organization.Type;

/**
 *
 * @author Yulun Feng
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public boolean hasOrganization(String name) {
        for (Organization o : organizationList) {
            if (o.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Organization getOrganization(String name) {
        for (Organization o : organizationList) {
            if (o.getName().equals(name)) {
                return o;
            }
        }
        System.out.println("organizationDirectory.get Warning: Organization does not exist: " + name);
        return null;
    }
    
    public Organization createOrganization(String name, Type type) {
        Organization organization;
        switch (type) {
            case AdminOrganization:
                organization = new AdminOrganization(name);
                break;
            case MedicalOrganization:
                organization = new MedicalOrganization(name);
                break;
            case EmergencyOrganization:
                organization = new EmergencyOrganization(name);
                break;
            case PharmacyOrganization:
                organization = new PharmacyOrganization(name);
                break;
            case SurgicalOrganization:
                organization = new SurgicalOrganization(name);
                break;
            case CaseManagerOrganization:
                organization = new CaseManagerOrganization(name);
                break;
            case SalesOrganization:
                organization = new SalesOrganization(name);
                break;
            case LabOrganization:
                organization = new LabOrganization(name);
                break;
            case MedicineOrganization:
                organization = new MedicineOrganization(name);
                break;
            case SupplementOrganization:
                organization = new SupplementOrganization(name);
                break;
            default:
                throw new IllegalArgumentException("Invalid organization type: " + type);
        }
    
        if (organization != null) {
            organizationList.add(organization);
        }
    
        return organization;
    }
    
}