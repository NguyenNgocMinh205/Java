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
public class WorkShop4StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       StudentList sl = new StudentList();
        while (true) {
             int choice = Manager.menu();
            switch (choice) {
                case 1:
                    sl.addStudent();
                    break;
                case 2:
                    sl.display();
                    break;
                case 3:
                    sl.edit();
                    break;
                case 4:
                    sl.remove();
                    break;
                case 5: 
                    sl.checkFee();
                    break;
                case 6:
                    return;
                
        }
    }
    }   
}
