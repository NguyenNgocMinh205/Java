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
public class WorkerList {

    Worker[] arrWorker = new Worker[100];
    int count = 0;

    public void create() {
        
        Worker wk = new Worker();
        wk = wk.input();
        arrWorker[count] = wk;
        System.out.println("Add sucessfully!!");
        count++;
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            arrWorker[i].dislay();
        }
        
    }

}
