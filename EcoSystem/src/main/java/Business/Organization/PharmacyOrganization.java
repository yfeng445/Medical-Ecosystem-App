/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.PharmacyPharmacistRole;
import Business.Role.Role;

/**
 *
 * @author Yulun Feng
 */
public class PharmacyOrganization extends Organization{

    public PharmacyOrganization(String name) {
        super(name, Type.PharmacyOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyPharmacistRole());
        return roles;
    }
     
}
