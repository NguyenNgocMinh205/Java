/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4.studentdriver;

import java.util.Scanner;

/**
 *
 * @author ミンー
 *
 */
public class Validation {

    public static Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            int result = Integer.parseInt(in.nextLine().trim());
            if (result >= min || result <= max) {
                return result;
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("String can't be empty.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static double checkInputFloat() {
        while (true) {
            float result = in.nextFloat();
            if (result < 0) {
                System.out.println("Can't be negative.");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }

    }

    public static int checkInputInteger() {
        return Integer.parseInt(in.nextLine());
    }
                
}
