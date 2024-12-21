package Business.Role;
import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.SupplementSupplierRole.SupplementSupplierWorkAreaJPanel;

// Dont forget to change the workJPanel for each role!!!

public class SupplementSupplierRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SupplementSupplierWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
