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
public abstract class Person {
    public  String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    
    public abstract void dislay();
    
    public abstract double getSalary();
    
}
