/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

import java.awt.CardLayout;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.util.ArrayList;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.EmergencyNurseRole;
import Business.Role.EmergencyPhysicianRole;
import Business.Role.EnterpriseAdminRole;
import Business.Role.InsuranceCaseManagerRole;
import Business.Role.LabAssistantRole;
import Business.Role.LabResearcherRole;
import Business.Role.MedicalNurseRole;
import Business.Role.MedicalPhysicianRole;
import Business.Role.MedicineSupplierRole;
import Business.Role.PharmacyPharmacistRole;
import Business.Role.Role;
import Business.Role.SalesRepRole;
import Business.Role.SupplementSupplierRole;
import Business.Role.SurgicalNurseRole;
import Business.Role.SurgicalPhysicianRole;
import Business.Role.Role.RoleType;
import Business.Role.SurgicalAnesthsiologistRole;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountDirectory;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.userAccountDirectory = ecosystem.getUserAccountDirectory();
        
        populateTree();
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(i);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnUploadConfig = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        btnManageUserAccount = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnUploadConfig.setText("Upload Config");
        btnUploadConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadConfigActionPerformed(evt);
            }
        });

        btnManageAdmin.setText("Manage Enterprise Admin");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });

        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        btnManageUserAccount.setText("Manage UserAccount");
        btnManageUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnUploadConfig)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageNetwork)
                    .addComponent(btnUploadConfig))
                .addGap(18, 18, 18)
                .addComponent(btnManageEnterprise)
                .addGap(18, 18, 18)
                .addComponent(btnManageAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnManageOrganization)
                .addGap(18, 18, 18)
                .addComponent(btnManageUserAccount)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void btnUploadConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadConfigActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        ArrayList<String[]> file = new ArrayList<>();
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // Split the line into columns based on the comma delimiter
                    String[] values = line.split(",");
                    file.add(values);
                    // Print each value
                    // System.out.println("Line: " + String.join(" | ", values)); // Joining values with ' | ' for better readability
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // File read, then update data to system
        ArrayList<Network> networkList = ecosystem.getNetworkList();
        for(String[] str : file){
            String networkName = str[0].replace(" ", "").trim();
            String enterpriseName = str[1].replace(" ", "").trim();
            String organizationName = str[2].replace(" ", "").trim();
            String name = str[3].replace(" ", "").trim();
            String roleName = str[4].replace(" ", "").trim();
            String userName = str[5].replace(" ", "").trim();
            String password = str[6].replace(" ", "").trim();
            if(!ecosystem.hasNetwork(networkName)){
                Network n = new Network();
                n.setName(networkName);
                ecosystem.addNetwork(n);
            }
            Network network = ecosystem.get(networkName);

            Enterprise e;
            // e dose not exist -> create new enterprise
            if(!network.getEnterpriseDirectory().hasEnterprise(enterpriseName)){
                if(enterpriseName.toLowerCase().contains("hospital")){
                  network.getEnterpriseDirectory().createAndAddEnterprise(enterpriseName, Enterprise.EnterpriseType.Hospital);  
                }else 
                if(enterpriseName.toLowerCase().contains("pharmacy")){
                  network.getEnterpriseDirectory().createAndAddEnterprise(enterpriseName, Enterprise.EnterpriseType.Pharmacy);
                }else
                if(enterpriseName.toLowerCase().contains("insurance")){
                  network.getEnterpriseDirectory().createAndAddEnterprise(enterpriseName, Enterprise.EnterpriseType.Insurance);
                }else
                if(enterpriseName.toLowerCase().contains("medical")){
                  network.getEnterpriseDirectory().createAndAddEnterprise(enterpriseName, Enterprise.EnterpriseType.MedicalCompany);
                }
                else{
                    System.out.println("Invalid enterprise type: " + enterpriseName);
                    continue;
                }
            }
            // e exists -> get the enterprise
            e = network.getEnterpriseDirectory().getEnterprise(enterpriseName);
            //System.out.println("Enterprise: " + e.getName());
            Organization o;
            if(!e.getOrganizationDirectory().hasOrganization(organizationName)){
                if(organizationName.toLowerCase().contains("admin")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.AdminOrganization);
                }else
                if(organizationName.toLowerCase().contains("medical")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.MedicalOrganization);
                }else
                if(organizationName.toLowerCase().contains("emergency")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.EmergencyOrganization);
                }else
                if(organizationName.toLowerCase().contains("pharmacy")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.PharmacyOrganization);
                }else
                if(organizationName.toLowerCase().contains("surgical")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.SurgicalOrganization);
                }else
                if(organizationName.toLowerCase().contains("case")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.CaseManagerOrganization);
                }else
                if(organizationName.toLowerCase().contains("sales")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.SalesOrganization);
                }else
                if(organizationName.toLowerCase().contains("lab")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.LabOrganization);
                }else
                if(organizationName.toLowerCase().contains("medicine")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.MedicineOrganization);
                }else
                if(organizationName.toLowerCase().contains("supplement")){
                    e.getOrganizationDirectory().createOrganization(organizationName, Organization.Type.SupplementOrganization);
                }else{
                    System.out.println("Invalid organization type: " + organizationName);
                    continue;
                }
            }
            o = e.getOrganizationDirectory().getOrganization(organizationName);
            Employee ee;
            Role role;
            if(roleName.toLowerCase().contains("admin")&&(!roleName.toLowerCase().contains("organization"))){
                role = new AdminRole();
            }
            else if(roleName.toLowerCase().contains("enterprise")&&roleName.toLowerCase().contains("admin")){
                role = new EnterpriseAdminRole();
            }
            else if(roleName.toLowerCase().contains("emergency")&&roleName.toLowerCase().contains("physician")){
                role = new EmergencyPhysicianRole();
            }
            else if(roleName.toLowerCase().contains("emergency")&&roleName.toLowerCase().contains("nurse")){
                role = new EmergencyNurseRole();
            }
            else if(roleName.toLowerCase().contains("medical")&&roleName.toLowerCase().contains("nurse")){
                role = new MedicalNurseRole();
            }
            else if(roleName.toLowerCase().contains("medical")&&roleName.toLowerCase().contains("physician")){
                role = new MedicalPhysicianRole();
            }
            else if(roleName.toLowerCase().contains("surgical")&&roleName.toLowerCase().contains("nurse")){
                role = new SurgicalNurseRole();
            }
            else if(roleName.toLowerCase().contains("anesthsiologist")){
                role = new SurgicalAnesthsiologistRole();
            }
            else if(roleName.toLowerCase().contains("surgicial")&&roleName.toLowerCase().contains("physician")){
                role = new SurgicalPhysicianRole();
            }
            else if(roleName.toLowerCase().contains("pharmacist")){
                role = new PharmacyPharmacistRole();
            }
            else if(roleName.toLowerCase().contains("research")){
                role = new LabResearcherRole();
            }
            else if(roleName.toLowerCase().contains("sales")){
                role = new SalesRepRole();
            }
            else if(roleName.toLowerCase().contains("case")){
                role = new InsuranceCaseManagerRole();
            }
            else if(roleName.toLowerCase().contains("lab")){
                role = new LabAssistantRole();
            }
            else if(roleName.toLowerCase().contains("medicine")){
                role = new MedicineSupplierRole();
            }
            else if(roleName.toLowerCase().contains("supplement")){
                role = new SupplementSupplierRole();
            }
            else{
                System.out.println("Invalid role type: " + roleName);
                continue;
            }
            
            ee = o.getEmployeeDirectory().createEmployee(name);
            o.getEmployeeDirectory().getEmployeeList().add(ee);
            o.getUserAccountDirectory().createUserAccount(userName, password, ee, role);

        }

    }//GEN-LAST:event_btnUploadConfigActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel=new ManageOrganizationJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageOrganizationJPanel",manageOrganizationJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel manageUserAccountJPanel=new ManageUserAccountJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageUserAccountJPanel",manageUserAccountJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUserAccount;
    private javax.swing.JButton btnUploadConfig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}