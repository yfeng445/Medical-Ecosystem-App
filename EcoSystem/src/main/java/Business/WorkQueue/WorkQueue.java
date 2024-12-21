/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void addWorkRequest(WorkRequest request) {
        workRequestList.add(request);
    }

    // Method to get requests for a specific user account (role)
    public ArrayList<WorkRequest> getMyWorkRequests(UserAccount account) {
        ArrayList<WorkRequest> myRequests = new ArrayList<>();

        for (WorkRequest request : workRequestList) {
            // Include if user is either sender or receiver
            if (request.getSender().equals(account)
                    || (request.getReceiver() != null && request.getReceiver().equals(account))) {
                myRequests.add(request);
            }
        }
        return myRequests;
    }
}
