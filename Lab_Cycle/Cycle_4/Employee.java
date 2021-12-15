package Lab_Cycle.Cycle_4;

import java.io.*;
import java.util.*;

class employee {

    String name, address;
    int age;
    long ph;
    float salary, pf, gr;

    void print_salary() {
        System.out.println("Salary: " + salary);
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter Phone number: ");
        ph = sc.nextLong();
        System.out.println("Enter Address: ");
        address = sc.nextLine();
        address = sc.nextLine();
        System.out.println("Enter Gross Salary: ");
        gr = sc.nextFloat();
        System.out.println("Enter Pf: ");
        pf = sc.nextFloat();
        System.out.println("\n\n\n");
    }

    void display() {
        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

        System.out.println("Phone number: " + ph);

        System.out.println("Address: " + address);

    }
}

class engineer extends employee {
    void display_salary() {
        System.out.println("Salary: " + salary);
    }

    void calc_salary() {
        salary = gr - pf;
    }
}

class Inheritance1 {

    public static void main(String args[]) {

        engineer en = new engineer();
        en.read();
        en.display();
        en.calc_salary();
        en.display_salary();
    }

}
