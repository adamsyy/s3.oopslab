package Additional_Qns;

import java.util.Arrays;

public class Mergesort {
  public static void main(String[] args){
int[] arr={8,3,4,1,5,6};
int[] newahne=mergesort(arr);
System.out.println(Arrays.toString(newahne));
  }  
  static int[] mergesort(int[] arr){
    if(arr.length==1)return arr; 
    int mid=arr.length/2;
    int[] left=mergesort(Arrays.copyOfRange(arr, 0, mid));
    int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left,right);
}

static private int[] merge(int[] first,int[] second){
int[] mix=new int[first.length+second.length];
int i=0,j=0,k=0;
while(i<first.length&&j<second.length){
    if(first[i]<second[j]){
        mix[k]=first[i];
        i++;
      
    }
    else{
        mix[k]=second[j];    
        j++;
    }
    k++;
}
while(i<first.length){
    mix[k]=first[i];
    k++;
    i++;
}
while(j<second.length){
    mix[k]=second[j];
    k++;
    j++;
}
return mix;

}
}


