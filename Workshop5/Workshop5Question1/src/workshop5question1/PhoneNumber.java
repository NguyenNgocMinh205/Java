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
public class PhoneNumber {
    private int areaCode;
    private String number;
    public Scanner in = new  Scanner(System.in);

    public PhoneNumber() {
    }

    public PhoneNumber(int areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "areaCode=" + areaCode + ", number=" + number + '}';
    }
    
    public void display(){
        System.out.println("Area code: "+areaCode);
        System.out.println("Number: "+number);
        
    }
    
    public PhoneNumber inputNumber(){
        PhoneNumber phoneNumberTmp;
        System.out.println("Enter area code: ");
        int a = in.nextInt();
        in.nextLine();
        System.out.println("Enter number: ");
        String n = in.nextLine();
        phoneNumberTmp = new PhoneNumber(a, n);
        
        return phoneNumberTmp;
    }
    
}
