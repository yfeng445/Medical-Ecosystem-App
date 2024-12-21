/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.LabAssistantRole;
import Business.Role.LabResearcherRole;
import Business.Role.Role;

/**
 *
 * @author Yulun Feng
 */
public class LabOrganization extends Organization{

    public LabOrganization(String name) {
        super(name, Type.LabOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        roles.add(new LabResearcherRole());
        return roles;
    }
     
}
