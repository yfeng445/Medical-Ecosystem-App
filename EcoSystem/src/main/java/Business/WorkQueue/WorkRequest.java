/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import java.util.Date;

import Business.UserAccount.UserAccount;
import java.util.Objects;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Organization senderOrganization;  // Added
    private Organization receiverOrganization; // Added
    private Enterprise senderEnterprise;      // Added
    private Enterprise receiverEnterprise;    // Added
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    public void setSenderOrganization(Organization org) {
        this.senderOrganization = org;
    }

    public Organization getReceiverOrganization() {
        return receiverOrganization;
    }

    public void setReceiverOrganization(Organization org) {
        this.receiverOrganization = org;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise ent) {
        this.senderEnterprise = ent;
    }

    public Enterprise getReceiverEnterprise() {
        return receiverEnterprise;
    }

    public void setReceiverEnterprise(Enterprise ent) {
        this.receiverEnterprise = ent;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequest)) {
            return false;
        }
        WorkRequest that = (WorkRequest) o;
        return Objects.equals(getMessage(), that.getMessage())
                && Objects.equals(getSender(), that.getSender())
                && Objects.equals(getRequestDate(), that.getRequestDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getSender(), getRequestDate());
    }
}
