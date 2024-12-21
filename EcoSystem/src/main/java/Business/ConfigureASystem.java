package Business;

import Business.Employee.Employee;
import Business.Role.*;
import Business.Network.*;
import Business.Enterprise.*;
import Business.Organization.*;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        Network network = new Network();
        //create an enterprise
        
        
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
       // System Administration
        UserAccount systemAdminAccount = system.getUserAccountDirectory().createUserAccount(
            "sysadmin", 
            "sysadmin", 
            employee, 
            new AdminRole()
        );
        
        UserAccount systemAdminAccount1 = system.getUserAccountDirectory().createUserAccount(
            "", 
            "", 
            employee, 
            new AdminRole()
        );
        
        // Enterprise Admin
        UserAccount hospitalAdminAccount = system.getUserAccountDirectory().createUserAccount(
            "h", 
            "s", 
            employee, 
            new EnterpriseAdminRole()
        );
        
        // Hospital - Emergency
        UserAccount emergencyPhysicianAccount = system.getUserAccountDirectory().createUserAccount(
            "emergencyPhysician", 
            "pw", 
            employee, 
            new EmergencyPhysicianRole()
        );
        UserAccount emergencyNurseAccount = system.getUserAccountDirectory().createUserAccount(
            "emergencyNurse", 
            "pw", 
            employee, 
            new EmergencyNurseRole()
        );

        // Hospital - Medical
        UserAccount medicalPhysicianAccount = system.getUserAccountDirectory().createUserAccount(
            "medicalPhysician", 
            "pw", 
            employee, 
            new MedicalPhysicianRole()
        );
        UserAccount medicalNurseAccount = system.getUserAccountDirectory().createUserAccount(
            "medicalNurse", 
            "pw", 
            employee, 
            new MedicalNurseRole()
        );

        // Hospital - Surgical
        UserAccount surgeonAccount = system.getUserAccountDirectory().createUserAccount(
            "surgeon", 
            "pw", 
            employee, 
            new SurgicalPhysicianRole()
        );
        UserAccount surgicalNurseAccount = system.getUserAccountDirectory().createUserAccount(
            "surgicalNurse", 
            "pw", 
            employee, 
            new SurgicalNurseRole()
        );
        UserAccount surgicalAnesthsiologistAccount = system.getUserAccountDirectory().createUserAccount(
            "anesthesiologist", 
            "pw", 
            employee, 
            new SurgicalAnesthsiologistRole()
        );

        // Hospital - Pharmacy
        UserAccount pharmacistAccount = system.getUserAccountDirectory().createUserAccount(
            "pharmacist", 
            "pw", 
            employee, 
            new PharmacyPharmacistRole()
        );

        // Medical - Research
        UserAccount labResearcherAccount = system.getUserAccountDirectory().createUserAccount(
            "researcher", 
            "pw", 
            employee, 
            new LabResearcherRole()
        );
        UserAccount labAssistantAccount = system.getUserAccountDirectory().createUserAccount(
            "labAssistant", 
            "pw", 
            employee, 
            new LabAssistantRole()
        );

        // Medical - Sales
        UserAccount salesRepAccount = system.getUserAccountDirectory().createUserAccount(
            "salesRep", 
            "pw", 
            employee, 
            new SalesRepRole()
        );

        // Pharmacy - Medicines
        UserAccount medicineSupplierAccount = system.getUserAccountDirectory().createUserAccount(
            "medicineSupplier", 
            "pw", 
            employee, 
            new MedicineSupplierRole()
        );

        // Pharmacy - Supplements
        UserAccount supplementSupplierAccount = system.getUserAccountDirectory().createUserAccount(
            "supplementSupplier", 
            "pw", 
            employee, 
            new SupplementSupplierRole()
        );

        // Insurance - Case Manager
        UserAccount insuranceCaseManagerAccount = system.getUserAccountDirectory().createUserAccount(
            "caseManager", 
            "pw", 
            employee, 
            new InsuranceCaseManagerRole()
        );

        
        return system;
    }
    
}
