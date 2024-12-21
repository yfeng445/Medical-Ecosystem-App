/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.Role;
import Business.Role.SalesRepRole;

/**
 *
 * @author Yulun Feng
 */
public class SalesOrganization extends Organization{

    public SalesOrganization(String name) {
        super(name, Type.SalesOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesRepRole());
        return roles;
    }
     
}
