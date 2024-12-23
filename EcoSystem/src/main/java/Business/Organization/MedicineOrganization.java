/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.MedicineSupplierRole;
import Business.Role.Role;
/**
 *
 * @author Yulun Feng
 */
public class MedicineOrganization extends Organization{

    public MedicineOrganization(String name) {
        super(name, Type.MedicineOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicineSupplierRole());
        return roles;
    }
     
}
