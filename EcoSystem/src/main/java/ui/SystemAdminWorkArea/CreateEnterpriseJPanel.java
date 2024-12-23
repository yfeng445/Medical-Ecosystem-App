/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.*;
import Business.Role.*;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author linyuxiao
 */
public class CreateEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Organization organization;
    private Role role;
    
    
    
    public CreateEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        Reset();
        txtID.setEditable(false);
        txtUsername.setEditable(true);
        txtName.setEditable(true);
        txtPassword.setEditable(true);
        populateEnterpriseJComboBox(system);
    }
        
    private void populateEnterpriseJComboBox(EcoSystem system) {
        enterpriseJComboBox.removeAllItems();
        for(Network n: system.getNetworkList()){
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                enterpriseJComboBox.addItem(e);
            }        
        }
    }
    
    private void populateOrganizationJComboBox(Enterprise e) {
        organizationJComboBox.removeAllItems();
        for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
            organizationJComboBox.addItem(o);
        }
    }
        
    private void populateRoleJComboBox(Organization o) {
        roleJComboBox.removeAllItems();
        if(o.getOrganizationType().getValue().toLowerCase().contains("admin")){
            AdminRole adr = new AdminRole();
            roleJComboBox.addItem(adr);
        }
        // what about enterpriseAdminRole...?
        else if(o.getOrganizationType().getValue().toLowerCase().contains("emergency")){
            EmergencyNurseRole enr = new EmergencyNurseRole();
            roleJComboBox.addItem(enr);
            EmergencyPhysicianRole epr = new EmergencyPhysicianRole();
            roleJComboBox.addItem(epr);
        }
        else if(o.getOrganizationType().getValue().toLowerCase().contains("case")){
            InsuranceCaseManagerRole icmr = new InsuranceCaseManagerRole();
            roleJComboBox.addItem(icmr);
        }
        else if (o.getOrganizationType().getValue().toLowerCase().contains("lab")){
            LabAssistantRole lar = new LabAssistantRole();
            roleJComboBox.addItem(lar);
            LabResearcherRole lrr = new LabResearcherRole();
            roleJComboBox.addItem(lrr);
        }
        else if (o.getOrganizationType().getValue().toLowerCase().contains("medical")){
            MedicalPhysicianRole mpr = new MedicalPhysicianRole();
            roleJComboBox.addItem(mpr);
            MedicalNurseRole mnr = new MedicalNurseRole();
            roleJComboBox.addItem(mnr);
        }
        else if (o.getOrganizationType().getValue().toLowerCase().contains("medicine")){
            MedicineSupplierRole msr = new MedicineSupplierRole();
            roleJComboBox.addItem(msr);
        }
        else if (o.getOrganizationType().getValue().toLowerCase().contains("pharmacy")){
            PharmacyPharmacistRole ppr = new PharmacyPharmacistRole();
            roleJComboBox.addItem(ppr);
        }
        else if (o.getOrganizationType().getValue().toLowerCase().contains("sales")){
            SalesRepRole srr = new SalesRepRole();
            roleJComboBox.addItem(srr);
        }
        else if (o.getOrganizationType().getValue().toLowerCase().contains("supplement")){
            SupplementSupplierRole ssr = new SupplementSupplierRole();
            roleJComboBox.addItem(ssr);
        }
        else if (o.getOrganizationType().getValue().toLowerCase().contains("surgical")){
            SurgicalNurseRole snr = new SurgicalNurseRole();
            roleJComboBox.addItem(snr);
            SurgicalPhysicianRole spr = new SurgicalPhysicianRole();
            roleJComboBox.addItem(spr);
            SurgicalAnesthsiologistRole sar = new SurgicalAnesthsiologistRole();
            roleJComboBox.addItem(sar);
        }
        else{
            JOptionPane.showMessageDialog(null, "No role available for this organization.", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblRoleName1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblUername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnBack.setFont(new java.awt.Font("ROG Fonts", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblRoleName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRoleName1.setText("Name");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblUername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUername.setText("Username");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("ID");

        jLabel3.setText("Enterprise");

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Organization");

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Role");

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roleJComboBox, 0, 299, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterpriseJComboBox, 0, 299, Short.MAX_VALUE)
                            .addComponent(organizationJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblRoleName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnCreate)))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtID, txtName, txtPassword, txtUsername});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRoleName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(btnCreate)
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        if (txtUsername.getText().isBlank() || 
            txtPassword.getText().isBlank() || 
            txtName.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "All txt Fields are required.", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(this.enterprise == null){
            JOptionPane.showMessageDialog(null, "Please select the enterprise", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(this.organization == null){
            JOptionPane.showMessageDialog(null, "Please select the organization", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(this.role == null){
            JOptionPane.showMessageDialog(null, "Please select the role", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String regex = "[^a-zA-Z]";
        if (txtName.getText().replace(" ", "").trim().matches(".*" + regex + ".*")) {
            JOptionPane.showMessageDialog(null, "Name should contains alphabetic character only", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!system.getUserAccountDirectory().checkIfUsernameIsUnique(txtName.getText().trim())){
            JOptionPane.showMessageDialog(null, "UserName already exist, please pick another one.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        System.out.println("The Enterprise you selected: " + this.enterprise.getName());
        System.out.println("The Organizatoin you selected: " + this.organization.getName());
        System.out.println("The role you selcted: " + this.role.getClass());
                
      
        UserAccount ua = new UserAccount();
        Employee ee = this.organization.getEmployeeDirectory().createEmployee(txtName.getText().trim());

        ua.setRole(role);
        ua.setUsername(txtUsername.getText().trim());
        ua.setPassword(txtPassword.getText().trim());
        ua.setEmployee(ee);
        this.organization.getEmployeeDirectory().getEmployeeList().add(ee);       
        this.organization.getUserAccountDirectory().getUserAccountList().add(ua);
        //system.getUserAccountDirectory().getUserAccountList().add(ua);
        
        JOptionPane.showMessageDialog(null, "User Created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        Reset();

    }//GEN-LAST:event_btnCreateActionPerformed

    private void Reset(){
        this.enterpriseJComboBox.removeAllItems();
        this.organizationJComboBox.removeAllItems();
        this.roleJComboBox.removeAllItems();
        this.txtID.setText("");
        this.txtName.setText("");
        this.txtPassword.setText("");
        this.txtUsername.setText("");
        populateEnterpriseJComboBox(this.system);
    }
    
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        //String enterpriseName = ((Enterprise)enterpriseJComboBox.getSelectedItem()).getName();
        this.enterprise = (Enterprise)enterpriseJComboBox.getSelectedItem();
        if (enterprise != null){
            populateOrganizationJComboBox(enterprise);
        }
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        this.organization = (Organization)organizationJComboBox.getSelectedItem();
        if (organization != null){
            
            populateRoleJComboBox(organization);
        }
        
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        this.role = (Role)roleJComboBox.getSelectedItem();
    }//GEN-LAST:event_roleJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRoleName1;
    private javax.swing.JLabel lblUername;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
