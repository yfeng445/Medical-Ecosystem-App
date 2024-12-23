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
import Business.Organization.Organization.Type;
import Business.Role.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author linyuxiao
 */
public class CreateOrganizationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Organization organization;
    private Role role;
    
    
    
    public CreateOrganizationJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        Reset();
        txtName.setEditable(true);
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
    
        
    private void populateTypeJComboBox(Enterprise e) {
        typeJComboBox.removeAllItems();
        if(e.getEnterpriseType().getValue().toLowerCase().contains("admin")){
            AdminOrganization ad = new AdminOrganization("AdminOrganization");
            typeJComboBox.addItem(ad);
        }
        else if(e.getEnterpriseType().getValue().toLowerCase().contains("hospital")){
            EmergencyOrganization em = new EmergencyOrganization("EmergencyOrganization");
            typeJComboBox.addItem(em);
            PharmacyOrganization ph = new PharmacyOrganization("PharmacyOrganization");
            typeJComboBox.addItem(ph);
            SurgicalOrganization su = new SurgicalOrganization("SurgicalOrganization");
            typeJComboBox.addItem(su);
            MedicalOrganization me = new MedicalOrganization("MedicalOrganization");
            typeJComboBox.addItem(me);
        }
        else if(e.getEnterpriseType().getValue().toLowerCase().contains("case")){
            CaseManagerOrganization cm = new CaseManagerOrganization("CaseManagerOrganization");
            typeJComboBox.addItem(cm);
        }
        else if (e.getEnterpriseType().getValue().toLowerCase().contains("pharmacy")){
            MedicineOrganization meo = new MedicineOrganization("MedicineOrganization");
            typeJComboBox.addItem(meo);
            SupplementOrganization suo = new SupplementOrganization("SupplementOrganization");
            typeJComboBox.addItem(suo);
        }
        else if (e.getEnterpriseType().getValue().toLowerCase().contains("medical")){
            SalesOrganization sao = new SalesOrganization("SalesOrganization");
            typeJComboBox.addItem(sao);
            LabOrganization lao = new LabOrganization("LabOrganization");
            typeJComboBox.addItem(lao);
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
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        typeJComboBox = new javax.swing.JComboBox();

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

        jLabel3.setText("Enterprise");

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Type");

        typeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeJComboBoxActionPerformed(evt);
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
                        .addComponent(typeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRoleName1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnCreate)))
                .addContainerGap(357, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(typeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRoleName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
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

        if (txtName.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "All txt Fields are required.", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        /*
        String regex = "[^a-zA-Z]";
        if (txtName.getText().replace(" ", "").trim().matches(".*" + regex + ".*")) {
            JOptionPane.showMessageDialog(null, "Name should contains alphabetic character only", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
*/
        
        for(Network n : system.getNetworkList()){
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    if(o.getName().equals(txtName.getText())){
                       JOptionPane.showMessageDialog(null, "Organization name already exist, please pick another one.", "Warning", JOptionPane.WARNING_MESSAGE);
                       return;
                   }                   
                }
            }
        }

        Organization o = null;
        if(((Type)typeJComboBox.getSelectedItem()).getValue().equals("AdminOrganization")){
            o = new AdminOrganization("AdminOrganization");
        }
        else if(((Type)typeJComboBox.getSelectedItem()).getValue().equals("MedicalOrganization")){
            o = new MedicalOrganization("MedicalOrganization");
        }
        else if(((Type)typeJComboBox.getSelectedItem()).getValue().equals("PharmacyOrganization")){
            o = new PharmacyOrganization("PharmacyOrganization");
        }
        else if(((Type)typeJComboBox.getSelectedItem()).getValue().equals("SurgicalOrganization")){
            o = new SurgicalOrganization("SurgicalOrganization");
        }
        else if(((Type)typeJComboBox.getSelectedItem()).getValue().equals("CaseManagerOrganization")){
            o = new CaseManagerOrganization("CaseManagerOrganization");
        }
        else if(((Type)typeJComboBox.getSelectedItem()).getValue().equals("SalesOrganization")){
            o = new SalesOrganization("SalesOrganization");
        }
        else if(((Type)typeJComboBox.getSelectedItem()).getValue().equals("LabOrganization")){
            o = new LabOrganization("LabOrganization");
        }
        else if(((Type)typeJComboBox.getSelectedItem()).getValue().equals("MedicineOrganization")){
            o = new MedicineOrganization("MedicineOrganization");
        }
        else if(((Type)typeJComboBox.getSelectedItem()).getValue().equals("SupplementOrganization")){
            o = new SupplementOrganization("SupplementOrganization");
        }
        
        this.enterprise.getOrganizationDirectory().getOrganizationList().add(o);
        o.setName(txtName.getText());
        JOptionPane.showMessageDialog(null, "Organization Created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        Reset();

    }//GEN-LAST:event_btnCreateActionPerformed

    private void Reset(){
        //this.enterpriseJComboBox.removeAllItems();
        //this.typeJComboBox.removeAllItems();
        this.txtName.setText("");
        populateEnterpriseJComboBox(this.system);
    }
    
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        Enterprise e = (Enterprise)enterpriseJComboBox.getSelectedItem();
        System.out.println(e.getName());
        populateTypeJComboBox(e);
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void typeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeJComboBoxActionPerformed
        this.role = (Role)typeJComboBox.getSelectedItem();
    }//GEN-LAST:event_typeJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblRoleName1;
    private javax.swing.JTextField txtName;
    private javax.swing.JComboBox typeJComboBox;
    // End of variables declaration//GEN-END:variables
}
