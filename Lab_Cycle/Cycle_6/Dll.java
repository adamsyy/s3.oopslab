package Lab_Cycle.Cycle_6;

import java.util.*;

class Node {
    int val;
    Node prev = null;
    Node next = null;
}

class Storehead {
    Node head = null;
}

public class Dll {
    public static void main(String args[]) {
        Storehead list = new Storehead();
        System.out.print("what would you like to do\n");
        int n;
      
        Scanner sc = new Scanner(System.in);
        n=1;
        do{
        System.out.println("1.insert at the end\n2.delete element,\n3.display\n4.exit");
            n=sc.nextInt(); 
        switch(n){
            case 1:{
                System.out.println("enter the element to be inserted");
                Node node=new Node();
                node.val=sc.nextInt();
                if(list.head==null){
                    list.head=node;
 
                }
                else{
                    Node temp=list.head;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next=node;
                    node.prev=temp;
                
                }
             break;
            }
            case 2:
               System.out.println("enter the value to delete");
               int dltval=sc.nextInt();
               Node temp=list.head;
                while(temp.val!=dltval){
                     temp=temp.next;
                }   
                if(temp.prev==null){
                    list.head=temp.next;
                }
                else{
                    temp.prev.next=temp.next;
                }

              break;

              case 3:
              System.out.println("values");
                Node tempo=list.head;
                while(tempo.next!=null){
                    System.out.print(tempo.val+"->");
                    tempo=tempo.next;
                }System.out.print(tempo.val);
                System.out.println();
             break;  
        }
    }while(n!=4);


    }
}
