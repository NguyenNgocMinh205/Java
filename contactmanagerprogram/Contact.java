/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagerprogram;

/**
 *
 * @author ミンー
 */
public class Contact {
    //variables
    private String id;
    private String fullName;
    private String group;
    private String address;
    private String phone;
    private String lastName;
    private String firstName;

    public Contact() {
    }

    public Contact(String id, String fullName, String group, String address, String phone, String lastName, String firstName) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", fullName=" + fullName + ", group=" + group + ", address=" + address + ", phone=" + phone + ", lastName=" + lastName + ", firstName=" + firstName + '}';
    }

    
    
       
}
