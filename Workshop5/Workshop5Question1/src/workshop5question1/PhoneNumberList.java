/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5question1;

import java.util.Scanner;

/**
 *
 * @author ミンー
 */
public class PhoneNumberList {

    public PhoneNumberList() {
    }

    PhoneNumber[] arrPhone = new PhoneNumber[100];
    int count = 0;
    public Scanner in = new Scanner(System.in);

    public void create() {
        System.out.println("Create function");
        while (true) {
            int c = Manager.menuEnter();
            switch (c) {
                case 1:
                    System.out.println("Create phone number");
                    PhoneNumber ph = new PhoneNumber();
                    ph = ph.inputNumber();
                    arrPhone[count] = ph;
                    System.out.println("Add sucessfully");
                    count++;
                    break;

                case 2:
                    System.out.println("Creater inter phone number");
                    InterPhoneNumber inter = new InterPhoneNumber();
                    inter = inter.inputInter();
                    arrPhone[count] = inter;
                    System.out.println("Add sucessfully");
                    count++;

                    break;
                case 3:
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            arrPhone[i].display();
        }

    }

}
