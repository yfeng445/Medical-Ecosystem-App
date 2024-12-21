/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;
import Business.Role.Role;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private Role roletype;
    private static int count = 1;

    public Employee() {
        //this.roletype = new Role(type);
        id = count;
        count++;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return this.name;
    }

    public Role getRole() {
        return this.roletype;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
