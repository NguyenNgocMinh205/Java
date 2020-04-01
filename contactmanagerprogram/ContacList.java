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
public class ContacList {

    private Contact[] contactArr = new Contact[50];
    private int count = 0;

    public ContacList() {
    }
    

    public void create() {
        System.out.println("Enter number of contact: ");
        count = Validation.in.nextInt();
        Validation.in.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter id contact: ");
            String id = Validation.checkInputString();
            System.out.print("Enter fullname: ");
            String fullName = Validation.checkInputString();
            System.out.print("Enter first name: ");
            String firstName = Validation.checkInputString();
            System.out.print("Enter last name: ");
            String lastName = Validation.checkInputString();
            System.out.print("Enter group: ");
            String group = Validation.checkInputString();
            System.out.print("Enter address: ");
            String address = Validation.checkInputString();
            System.out.print("Enter phone: ");
            String phone = Validation.checkInputString();
            contactArr[i] = new Contact(id, fullName, group, address, phone, lastName, firstName);
            System.out.println("Create sucessfuly");
        }

    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(contactArr[i]);
        }
    }

    public int checkIdExits(String id) {
        // scan the whole list and then compare
        for (int i = 0; i < count; i++) {
            if (contactArr[i].getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;

    }

    public void remove() {
        // Task 1: Enter id to remove
        System.out.println("Enter id to remove");
        String id = Validation.checkInputString();
        int position = checkIdExits(id);
        // Task 2: find this contact in the list
        if (position == -1) {
            System.out.println("Not have contact in the list");
            return;
        } else {
            // Task 3: got the position, and then using shifting algorithm
            // to remove
            for (int i = position; i < count - 1; i++) {
                contactArr[i] = contactArr[i + 1];
            }
            count--;// reduce 1 contact in the list after removing
            System.out.println("Delete successful");
        }

    }

    public void update() {
        // Task 1: Enter id to update
        System.out.println("Enter id to update: ");
        String id = Validation.checkInputString();
        // Task 2: check id exits in list or not
        int position = checkIdExits(id);
        if (position==-1) {
            System.out.println("Cant find this id in the list");
            return;
        } else {
            System.out.println("Enter new Full Name: ");
            String newName = Validation.checkInputString();
            contactArr[position].setFullName(newName);
            
            System.out.println("Enter new Adress: ");
            String newAdd = Validation.checkInputString();
            contactArr[position].setAddress(newAdd);
            System.out.println("Update Successfull");
        }
        
        
    }
}
