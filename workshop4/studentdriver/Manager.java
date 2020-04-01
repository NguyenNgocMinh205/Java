/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4.studentdriver;

/**
 *
 * @author ミンー
 */
public class Manager {
    static int menu(){
        System.out.println("================MENU=====================");
        System.out.println("|| 1. Add student                       ||");
        System.out.println("|| 2. View all student                  ||");
        System.out.println("|| 3. Edit student                      ||");
        System.out.println("|| 4. Delete a student                  ||");
        System.out.println("|| 5. Check due fee                     ||");
        System.out.println("|| 6. Exit                              ||");
        System.out.println("=========================================");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 6);
        return choice;
    }
    
}
