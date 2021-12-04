package Lab_Cycle.Cycle_1;

import java.util.Scanner;

public class Sumofdigits {
   public static void main(String[] args) {
      
         int num, sum = 0, rem;
            System.out.println("Enter a number");
            Scanner sc=new Scanner(System.in);
            num = sc.nextInt();
            while (num > 0) {
                rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            System.out.println("Sum of digits of the number is " + sum);
   }
}
