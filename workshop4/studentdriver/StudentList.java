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
public class StudentList {

    private Student[] stArr = new Student[100];
    private int count = 0;

    public StudentList() {
    }

    public void addStudent() {
        System.out.print("Enter number of student you want to add: ");
        count = Validation.in.nextInt();
        Validation.in.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter rollno student: ");
            int rollno = Validation.checkInputInteger();
            System.out.print("Enter name of student: ");
            String name = Validation.checkInputString();
            System.out.print("Enter email: ");
            String email = Validation.checkInputString();
            System.out.print("Enter course: ");
            String course = Validation.checkInputString();
            System.out.print("Enter the fee: ");
            int fee = Validation.checkInputInteger();
            System.out.print("Enter paid: ");
            int paid = Validation.checkInputInteger();
            System.out.print("Enter due: ");
            int due = Validation.checkInputInteger();
            System.out.print("Enter address: ");
            String address = Validation.checkInputString();
            System.out.print("Enter the city: ");
            String city = Validation.checkInputString();
            System.out.print("Enter state: ");
            String state = Validation.checkInputString();
            System.out.print("Enter country: ");
            String coutry = Validation.checkInputString();
            System.out.print("Enter conctact no: ");
            String contactno = Validation.checkInputString();
            stArr[i] = new Student(rollno, name, email, course, fee, paid, due, address, city, state, coutry, contactno);
            System.out.println("Add successfull!!!");

        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(stArr[i]);
        }
    }

    public int checkIdExits(int rollno) {

        for (int i = 0; i < count; i++) {
            if (stArr[i].getRollno() == rollno) {
                return i;
            }
        }
        return -1;

    }

    public void edit() {
        System.out.println("Enter rollno to update: ");
        int rollno = Validation.checkInputInteger();

        int position = checkIdExits(rollno);
        if (position == -1) {
            System.out.println("Cant find this rollno in the list");
            return;
        } else {

            System.out.print("Enter new roll no: ");
            int newRollno = Validation.checkInputInteger();
            stArr[position].getRollno();

            System.out.print("Enter new name: ");
            String newName = Validation.checkInputString();
            stArr[position].getName();

            System.out.print("Enter new email: ");
            String newEmail = Validation.checkInputString();
            stArr[position].getEmail();

            System.out.print("Enter new course: ");
            String newCourse = Validation.checkInputString();
            stArr[position].getCourse();

            System.out.print("Enter new fee: ");
            int newFee = Validation.checkInputInteger();
            stArr[position].getFee();

            System.out.print("Enter new paid: ");
            int newPaid = Validation.checkInputInteger();
            stArr[position].getPaid();

            System.out.print("Enter new due: ");
            int newDue = Validation.checkInputInteger();
            stArr[position].getName();

            System.out.print("Enter new Adress: ");
            String newAdd = Validation.checkInputString();
            stArr[position].setAddress(newAdd);

            System.out.print("Enter new city: ");
            String newCity = Validation.checkInputString();
            stArr[position].getCity();

            System.out.print("Enter new state: ");
            String newState = Validation.checkInputString();
            stArr[position].getState();

            System.out.print("Enter new country: ");
            String newCountry = Validation.checkInputString();
            stArr[position].getCountry();

            System.out.print("Enter new contactno: ");
            String newContact = Validation.checkInputString();
            stArr[position].getContacno();

            System.out.println("Update Successfull");
        }

    }

    public void remove() {
        System.out.print("Enter rollno to remove: ");
        int rollno = Validation.checkInputInteger();
        int position = checkIdExits(rollno);
        if (position == -1) {
            System.out.println("Not have rollno in the list");
            return;
        } else {
            for (int i = position; i < count - 1; i++) {
                stArr[i] = stArr[i + 1];
            }
            count--;// reduce 1 contact in the list after removing
            System.out.println("Delete successful");
        }
    }

    public void checkFee() {
        System.out.print("Enter rollno to check: ");
        int rollno = Validation.checkInputInteger();
        int position = checkIdExits(rollno);
        if (position == -1) {
            System.out.println("Cant find this rollno in the list");
            return;
        } else {
            System.out.println("Name of student: "+stArr[position].getName());
            System.out.println("Fee of student: "+stArr[position].getFee());
        }
        }
    }
