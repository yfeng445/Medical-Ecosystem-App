package Business.Role;
import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.MedicalNurseRole.MedicalNurseWorkAreaJPanel;

// Dont forget to change the workJPanel for each role!!!

public class MedicalNurseRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MedicalNurseWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
