package Lab_Cycle.Cycle_5;
  
abstract class shape{
    abstract void numberOfsides();
}
class rectangle extends shape{
    void numberOfsides(){
        System.out.println("Reactangle");
        System.out.println("Number of sides: 4");
    }
}
class hexagon extends shape{
    void numberOfsides(){
        System.out.println("Hexagon");
        System.out.println("Number of sides: 6");
    }
}
class triangle extends shape{
    void numberOfsides(){
        System.out.println("Triangle");
        System.out.println("Number of sides: 3");
    }
}

public class Shape{
    public static void main(String args[]){
        triangle t=new triangle();
        rectangle r=new rectangle();
        hexagon h=new hexagon();
        t.numberOfsides();
        r.numberOfsides();
        h.numberOfsides();
    }
}
