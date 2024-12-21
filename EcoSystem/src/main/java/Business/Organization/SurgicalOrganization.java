/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.Role;
import Business.Role.SurgicalAnesthsiologistRole;
import Business.Role.SurgicalNurseRole;
import Business.Role.SurgicalPhysicianRole;

/**
 *
 * @author Yulun Feng
 */
public class SurgicalOrganization extends Organization{

    public SurgicalOrganization(String name) {
        super(name, Type.SurgicalOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SurgicalAnesthsiologistRole());
        roles.add(new SurgicalNurseRole());
        roles.add(new SurgicalPhysicianRole());
        return roles;
    }
     
}
