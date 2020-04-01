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
public class Manager {
    //display menu
    public  static int menu() {
        //loop until user want to exit
        System.out.println("1. Add a contact");
        System.out.println("2. Display all contact");
        System.out.println("3. Delete a contact");
        System.out.println("4. Update contact");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}
