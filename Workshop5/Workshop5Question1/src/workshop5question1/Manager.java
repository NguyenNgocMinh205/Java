/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5question1;

/**
 *
 * @author ミンー
 */
public class Manager {
    static int menu(){
        System.out.println("================MENU=====================");
        System.out.println("|| Press 1. Enter a phone              ||");
        System.out.println("|| Press 2. Display a list of phone    ||");
        System.out.println("|| Press 3. Exit                       ||");
        System.out.println("=========================================");
        System.out.println("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }
    
    static int menuEnter(){
        System.out.println("================PHONE MENU==============");
        System.out.println("|| Press 1: Enter a local             ||");
        System.out.println("|| Press 2: Ener a Inter              ||");
        System.out.println("|| Press 3: Exit                      ||");
        System.out.println("=========================================");
        System.out.println("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1,3);
        return choice;
        
    }
}
