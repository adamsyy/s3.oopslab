package Playground;

import java.util.*;

public class Demoexception {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("1");
        al.add("3");
        al.add("3");
String x="adsmsiodieodu";
//string handling
        
//string functions
        String s="hello";
        String s2="hello";
        String s3="hello";
        String s4="hello";
       
        s.length();
        s.charAt(0);
        s.indexOf("h");
        s.lastIndexOf("l");

        try {
            if (x.length() > 5) {
                throw new Exception("String length is greater than 5");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        Iterator itr=al.iterator();
       
            System.out.println(itr.hasNext());
            //System.out.println(itr.next());
    }
}
