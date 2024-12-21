package Business.Role;
import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.LabResearcherRole.LabResearcherWorkAreaJPanel;

// Dont forget to change the workJPanel for each role!!!

public class LabAssistantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabResearcherWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
