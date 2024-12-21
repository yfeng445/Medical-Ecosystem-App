package Business.Role;
import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.MedicalPhysicianRole.MedicalPhysicianWorkAreaJPanel;

// Dont forget to change the workJPanel for each role!!!

public class MedicalPhysicianRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MedicalPhysicianWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    
}
