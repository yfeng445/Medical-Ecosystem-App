/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.MedicalNurseRole;
import Business.Role.MedicalPhysicianRole;
import Business.Role.Role;

/**
 *
 * @author Yulun Feng
 */
public class MedicalOrganization extends Organization{

    public MedicalOrganization(String name) {
        super(name, Type.MedicalOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalNurseRole());
        roles.add(new MedicalPhysicianRole());

        return roles;
    }
     
}
