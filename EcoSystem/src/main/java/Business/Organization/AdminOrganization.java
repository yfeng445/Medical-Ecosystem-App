/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.AdminRole;
import Business.Role.Role;

/**
 *
 * @author Yulun Feng
 */
public class AdminOrganization extends Organization{

    public AdminOrganization(String name) {
        super(name, Type.AdminOrganization);
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
     
}
