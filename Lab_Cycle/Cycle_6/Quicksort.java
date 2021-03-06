package Lab_Cycle.Cycle_6;


import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        String[] arr = {"Boby","Zebraboi","Janko","Adam"};
      sort(arr, 0, arr.length - 1);
      System.out.println(Arrays.toString(arr));
     
    }

    static void sort(String[] name, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        String pivot = name[m];

        while (s <= e) {

           
            while (name[s].compareTo(pivot)<0) {
                s++;
            }
            while (name[e].compareTo(pivot)>0) {
                e--;
            }

            if (s <= e) {
                String temp = name[s];
                name[s] = name[e];
                name[e] = temp;
                s++;
                e--;
            }
        }

        
        sort(name, low, e);
        sort(name, s, hi);
    }
}