/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.InsuranceCaseManagerRole;
import Business.Role.Role;

/**
 *
 * @author Yulun Feng
 */
public class CaseManagerOrganization extends Organization{

    public CaseManagerOrganization(String name) {
        super(name, Type.CaseManagerOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceCaseManagerRole());
        return roles;
    }
     
}
