/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.Role;
import Business.Role.SupplementSupplierRole;

/**
 *
 * @author Yulun Feng
 */
public class SupplementOrganization extends Organization{

    public SupplementOrganization(String name) {
        super(name, Type.SupplementOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplementSupplierRole());
        return roles;
    }
     
}
