package Lab_Cycle.Cycle_3;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String");
        String str=sc.nextLine();
        String reverse = "";
int len=str.length();
        for (int i = len-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
}
