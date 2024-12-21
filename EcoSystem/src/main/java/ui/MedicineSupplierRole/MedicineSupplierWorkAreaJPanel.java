/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.MedicineSupplierRole;

import ui.SurgicalPhysicianRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MedicineOrganization;
import Business.Organization.Organization;
import Business.Organization.SurgicalOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class MedicineSupplierWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private MedicineOrganization medicineOrganization;
    private Enterprise enterprise;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public MedicineSupplierWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,  Enterprise enterprise, EcoSystem business) {
            
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.medicineOrganization = (MedicineOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;

    }


 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSend = new javax.swing.JButton();
        btnInbox = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSend.setText("Send Request");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 120, -1));

        btnInbox.setText("Inbox");
        btnInbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInboxActionPerformed(evt);
            }
        });
        add(btnInbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 120, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Medicine Supplier Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 300, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInboxActionPerformed
        // TODO add your handling code here:
        MedicineSupplierReceiveJPanel receivePanel = new MedicineSupplierReceiveJPanel(
        userProcessContainer,
        userAccount,
        medicineOrganization,
        business
        );
        userProcessContainer.add("ReceiveJPanel", receivePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnInboxActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        MedicineSupplierSendJPanel sendPanel = new MedicineSupplierSendJPanel(
        userProcessContainer, 
        userAccount, 
        medicineOrganization,
        enterprise,
        business
        );
        userProcessContainer.add("SendJPanel", sendPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInbox;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}