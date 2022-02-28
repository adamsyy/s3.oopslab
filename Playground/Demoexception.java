package Playground;

public class Demoexception {
    public static void main(String args[]) {

        int a[] = new int[4];
        try {
for(int c=0;c<=4;c++){
 a[c]=c+1;

} 

        } catch (ArithmeticException e) {
            System.out.println("out of bound ahne");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("out of bound ahne 2");
        }
        finally {
            System.out.println("finally");
        }

    }
}
