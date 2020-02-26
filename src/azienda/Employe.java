/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azienda;

/**
 *
 * @author informatica
 */
public class Employe {
    String employeeId;
    String firstName;
    String lastName;
    String email;
    String phone;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{\"employeeId\": "+ employeeId +",\"firstName\": \""+ firstName +"\",\"lastName\": \""+ lastName +"\",\"email\": \""+ email +"\",\"phone\": \""+ phone +"\"}";
    }
    
}
