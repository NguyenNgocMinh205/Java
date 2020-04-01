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
public class InterPhoneNumber extends PhoneNumber{
    private String coutntryCode;
    public Scanner in = new Scanner(System.in);

    public InterPhoneNumber() {
    }

    public InterPhoneNumber(String coutntryCode) {
        this.coutntryCode = coutntryCode;
    }

    public InterPhoneNumber(String coutntryCode, int areaCode, String number) {
        super(areaCode, number);
        this.coutntryCode = coutntryCode;
    }

    public String getCoutntryCode() {
        return coutntryCode;
    }

    public void setCoutntryCode(String coutntryCode) {
        this.coutntryCode = coutntryCode;
    }

    @Override
    public String toString() {
        return "InterPhoneNumber{" + "coutntryCode=" + coutntryCode + '}';
    }
    
    public void display(){
        super.display();
    }
    
    public InterPhoneNumber inputInter(){
        InterPhoneNumber input;
        System.out.println("Enter area code: ");
        int a1 = in.nextInt();
        in.nextLine();
        System.out.println("Enter number: ");
        String n1 = in.nextLine();
        System.out.println("Enter country code: ");
        String n2 = in.nextLine();
        input = new InterPhoneNumber(n2, a1, n1);
        
        return input;
    }
}
