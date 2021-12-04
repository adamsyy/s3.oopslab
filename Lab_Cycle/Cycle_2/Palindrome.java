package Lab_Cycle.Cycle_2;

import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
       System.out.println("Enter a string:");
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int start=0,end=str.length()-1;
       int flag=0;
       while(start<end){
           if(str.charAt(start)!=str.charAt(end)){
               System.out.println("Not a Palindrome");
               flag=0;
               break;
           }
           start++;
           end--;
         flag=1;
       }
       if(flag==1)
           System.out.println("Palindrome");
   }
}
