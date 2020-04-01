/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5question2;

import java.util.Scanner;

/**
 *
 * @author ミンー
 */

public class Worker extends Person {
    Scanner in = new Scanner(System.in);
    
    public double bSalary;
    public double rate;
    
    public Worker() {
        
    }

    public Worker(double bSalary, double rate, String name) {
        super(name);
        this.bSalary = bSalary;
        this.rate = rate;
    }
    
    @Override
    public double getSalary() {
        return bSalary+bSalary*rate;
    }

    @Override
    public void dislay() {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+getSalary());
        
    }
    
    public Worker input(){
        Worker input;
        System.out.println("Enter name: ");
        String a = in.nextLine();
        System.out.println("Enter salary basic: ");
        double b = in.nextDouble();
        in.nextLine();
        System.out.println("Enter rate: ");
        double c = in.nextDouble();
        input = new Worker(b, c, a);
        return input;
        
    }
    
                   
}
