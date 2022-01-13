package Lab_Cycle.Cycle_6;
import java.util.*;
public class Binarysearch {
    public static void main(String[] args) {
        int flag=0;
        System.out.println("enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]=new int[n];
       int first=0,last=n-1;
       System.out.println("enter the elements");
       for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
       }
       System.out.println("enter the number to be searched");
       int target=sc.nextInt();
       while(first<=last){
int mid=first+(last-first)/2;
if(target>arr[mid]){
    first=mid+1;
}
else if(target<arr[mid]){
    last=mid-1;
}
else {
    System.out.println("element found at index "+mid);
    flag=1;
    break;
}

       }
   
   if(flag==0){System.out.println("element not found");


}
   
    }
}
