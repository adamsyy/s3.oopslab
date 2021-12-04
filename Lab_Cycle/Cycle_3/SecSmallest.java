package Lab_Cycle.Cycle_3;

import java.util.Scanner;

public class SecSmallest {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     int response[]=sortt(arr);
     System.out.println("The second smallest element is "+response[response.length-2]);  
    }

    public static int[] sortt(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
           }
       }
        }
       return arr;
       
       }
           }
