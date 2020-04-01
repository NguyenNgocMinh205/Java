/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5question2;

/**
 *
 * @author ミンー
 */
public class Manager {
    static int menu(){
        System.out.println("=================MENU===================");
        System.out.println("|| 1. Create worker                    ||");
        System.out.println("|| 2. Display a list of worker         || ");
        System.out.println("|| 3. Exit                             ||");
        System.out.println("=========================================");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }
}
