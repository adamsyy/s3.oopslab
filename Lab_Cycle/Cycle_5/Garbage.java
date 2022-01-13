package Lab_Cycle.Cycle_5;

 
class testGarbage{
    public void finalize(){
        System.out.println("Garbage collected...");
    }
}
public class Garbage {
    public static void main(String args[]){
        testGarbage s1=new testGarbage();
        testGarbage s2=new testGarbage();
        s1=null;
        s2=null;
        System.gc();
       
    }
   
}
 

