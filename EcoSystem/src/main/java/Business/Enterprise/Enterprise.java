 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.EmployeeDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        
        Hospital("Hospital"),
        Pharmacy("Pharmacy"),
        Insurance("Insurance"),
        MedicalCompany("MedicalCompany");

        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        this.name = name;
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        userAccountDirectory = new UserAccountDirectory(); // Initialize user account directory
        employeeDirectory = new EmployeeDirectory();
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
