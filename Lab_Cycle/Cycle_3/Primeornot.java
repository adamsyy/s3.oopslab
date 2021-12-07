package Lab_Cycle.Cycle_3;

import java.util.Scanner;

public class Primeornot {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int j=0;
    
System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        if(n==1||n==0){
            return false;
        }
        for(int i=2;i<=n/2;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
}
}
