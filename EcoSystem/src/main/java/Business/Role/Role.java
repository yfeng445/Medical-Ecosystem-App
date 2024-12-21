/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        
        Admin("Admin"),
        EnterpriseAdmin("EnterpriseAdmin"),

        // Hospital - Emergency
        EmergencyPhysician("Emergency Physician"),
        EmergencyNurse("Emergency Nurse"),
        // Hospital - Medical
        MedicalPhysician("Medical Physician"),
        MedicalNurse("Medical Nurse"),
        // Hospital - Surgical
        SurgicalPhysician("Surgicial Physician"),
        SurgicalNurse("Surgical Nurse"),
        Anesthsiologist("Anesthsiologist"),
        // Hospital - Pharmacy
        Pharmacist("Pharmacist"),

        // Medial - Research
        Researcher("Researcher"),
        LabAssistant("Lab Assistant"),
        // Medical - Sales
        SalesRep("Sales Rep"),

        // Pharmacy - Medicines
        MedicineSupplier("Medicine Supplier"),
        // Pharmacy - Supplements
        SupplementSupplier("Supplement Supplier"),

        // Insurance - CaseManager
        CaseManager("Case Manager");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}