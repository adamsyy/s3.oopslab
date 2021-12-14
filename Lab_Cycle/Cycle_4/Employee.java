package Lab_Cycle.Cycle_4;

public class Employee {
    public static void display(){
System.out.println("Name of class in Employee");
    }
    public static void calcsalary(){
        System.out.println("salary of employee is 10000");
    }
    public static void main(String[] args) {
      Engineer eng=new Engineer();
      eng.calcsalary();
      Employee.display();      
    }
}
 class Engineer extends Employee{
    public static void display(){
        System.out.println("Name of class in Enggineer");
            }
            public static void calcsalary(){
                System.out.println("Salary of employee is 20000");
            }
}

