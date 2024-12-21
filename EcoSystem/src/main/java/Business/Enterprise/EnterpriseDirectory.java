/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public boolean hasEnterprise(String name){
        for(Enterprise e:enterpriseList){
            if(e.getName().equals(name)) return true;
        }
        return false;
    }
    
    public Enterprise getEnterprise(String name){
        
        for(Enterprise e:enterpriseList){
            //System.out.println("SEARCHING KEY:" + name + " | ENTERPRISENAME: " + e.getName());            
            if(e.getName().replace(" ", "").toLowerCase().contains(name.replace(" ", "").toLowerCase())){

                return e;
            }
        }
        System.out.println("enterpriseDirectry.get Warning: Enterprise does not exist: " + name);
        return null;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        switch (type) {
            case Hospital:
                enterprise = new HospitalEnterprise(name);
                break;
            case Pharmacy:
                enterprise = new PharmacyEnterprise(name);
                break;
            case Insurance:
                enterprise = new InsuranceEnterprise(name);
                break;
            case MedicalCompany:
                enterprise = new MedicalCompanyEnterprise(name);
                break;
            default:
                throw new IllegalArgumentException("Invalid enterprise type: " + type);
        }
    
        if (enterprise != null) {
            enterpriseList.add(enterprise);
        }
    
        return enterprise;
    }
    
}
