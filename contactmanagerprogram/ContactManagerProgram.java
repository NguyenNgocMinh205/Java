/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagerprogram;

/**
 *
 * @author ミンー
 */
public class ContactManagerProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContacList cl = new ContacList();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    cl.create();
                    break;
                case 2:
                    cl.display();
                    break;
                case 3:
                    cl.remove();

                    break;
                case 4:
                    cl.update();
                    break;
                case 5:
                    return;
            }
        }

    }
    
}
