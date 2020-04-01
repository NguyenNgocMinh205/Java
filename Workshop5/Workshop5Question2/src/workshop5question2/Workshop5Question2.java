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
public class Workshop5Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WorkerList wl = new WorkerList();
        while (true) {
            int choice = Manager.menu();
            
            switch (choice) {
                case 1:
                    wl.create();
                    break;
                case 2: 
                    wl.display();
                    break;
                case 3:
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }
    
}
