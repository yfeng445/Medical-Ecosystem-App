/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Yulun Feng
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private Type type;
    
    public enum Type{
        AdminOrganization("AdminOrganization"), 
        // Hospital
        MedicalOrganization("MedicalOrganization"), 
        EmergencyOrganization("EmergencyOrganization"),
        PharmacyOrganization("PharmacyOrganization"),
        SurgicalOrganization("SurgicalOrganization"),
        // Insurance
        CaseManagerOrganization("CaseManagerOrganization"),
        // MedicalCompany
        SalesOrganization("SalesOrganization"),
        LabOrganization("LabOrganization"),
        // Pharmacy
        MedicineOrganization("MedicineOrganization"),
        SupplementOrganization("SupplementOrganization");
        

        private Type() {
        }

        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name, Type type) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
        this.type = type;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public Type getOrganizationType(){
        return this.type;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
