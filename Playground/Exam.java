package Playground;


class TwoD{
    int x;
    int y;
    TwoD(int x, int y){
        this.x = x;
        this.y = y;
    }

    void distancebetween(int x, int y){
        int distance = (int)Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2));
        System.out.println("Distance between (" + x + ", " + y + ") and (" + this.x + ", " + this.y + ") is " + distance);
    }

    void distancebetween(TwoD other){
        int distance = (int)Math.sqrt(Math.pow(other.x-this.x, 2) + Math.pow(other.y-this.y, 2));
        System.out.println("Distance between (" + other.x + ", " + other.y + ") and (" + this.x + ", " + this.y + ") is " + distance);
    }


}
class ThreeD extends TwoD{
    int z;
    ThreeD(int z){
        super(0,0);
        this.z = z;
    }
    ThreeD(int x, int y, int z){
       super(x, y);
        this.z = z;
    }
 void distancebetween(int x, int y, int z){
    
        int distance = (int)Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2) + Math.pow(z-this.z, 2));
        System.out.println("Distance between (" + x + ", " + y + ", " + z + ") and (" + this.x + ", " + this.y + ", " + this.z + ") is " + distance);
    }

    void distancebetween(ThreeD other){
        int distance = (int)Math.sqrt(Math.pow(other.x-this.x, 2) + Math.pow(other.y-this.y, 2) + Math.pow(other.z-this.z, 2));
        System.out.println("Distance between (" + other.x + ", " + other.y + ", " + other.z + ") and (" + this.x + ", " + this.y + ", " + this.z + ") is " + distance);
    }
    
    

}


public class Exam {
    public static void main(String args[]) {
TwoD t1 = new TwoD(1,2);
TwoD t2 = new TwoD(3,4);
t1.distancebetween(5,6);
t1.distancebetween(t2);
t2.distancebetween(t1);

ThreeD t3 = new ThreeD(1);
ThreeD t4 = new ThreeD(2,3,4);
t3.distancebetween(5,6,7);
t3.distancebetween(t4);
t4.distancebetween(t3);

    }
}
