/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.EmergencyNurseRole;
import Business.Role.EmergencyPhysicianRole;
import Business.Role.Role;

/**
 *
 * @author Yulun Feng
 */
public class EmergencyOrganization extends Organization{

    public EmergencyOrganization(String name) {
        super(name, Type.EmergencyOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EmergencyNurseRole());
        roles.add(new EmergencyPhysicianRole());
        return roles;
    }
     
}
