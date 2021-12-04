package lab1;

import java.util.Scanner;

public class LargestOfN {

    public static void main(String[] args) {
  
      
      System.out.println("Please enter value of N: ");
  
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int largest = Integer.MIN_VALUE;
  
      System.out.printf("Please enter %d numbers %n", n);
      for (int i = 0; i < n; i++) {
  
        int current = sc.nextInt();
        if (current > largest) {
          largest = current;
        } 
       
      }
  
      System.out.println("largest of N number is : " + largest);
     
    }
  
  }
