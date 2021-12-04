package Lab_Cycle.Cycle_3;

import java.util.Scanner;

public class Transporse {

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int r,c;
        r = sc.nextInt();
        c = sc.nextInt();

        int original[][]=new int[r][c];
            

        int transpose[][]=new int[c][r]; 
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++){    
            for(int j=0;j<c;j++){    
           original[i][j]=sc.nextInt();     
            }    
            }  
        for(int i=0;i<c;i++){    
        for(int j=0;j<r;j++){    
        transpose[i][j]=original[j][i];  
        }    
        }    
          
        System.out.println("Printing Matrix without transpose:");  
        for(int i=0;i<r;i++){    
        for(int j=0;j<c;j++){    
        System.out.print(original[i][j]+" ");    
        }    
        System.out.println();//new line    
        }    
        System.out.println("Printing Matrix After Transpose:");  
        for(int i=0;i<c;i++){    
        for(int j=0;j<r;j++){    
        System.out.print(transpose[i][j]+" ");    
        }    
        System.out.println();//new line    
        }     
}
}
