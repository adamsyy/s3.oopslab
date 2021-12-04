package Lab_Cycle.Cycle_2;

import java.util.Scanner;

public class Freq {
   public static void main(String[] args) {
       System.out.println("Enter a string:");
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       System.out.println("Enter the character:");
       char c = sc.next().charAt(0);
       int count=0;  
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)==c)
           {
               count++;
           }
       }
       System.out.println("The frequency of the character is:"+count);
   }
}

