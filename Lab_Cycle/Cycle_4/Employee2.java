package Lab_Cycle.Cycle_4;

public abstract class Employee2 {
    int age,phno,salary;
    String address,name;
    public abstract void printSalary();
    public static void main(String[] args) {
Officer off=new Officer();
off.name="adam";
off.age=25;
off.phno=123456789;
off.address="pune";
off.salary=20000;
off.printSalary();
Manager man=new Manager();
man.name="harry";
man.age=32;
man.address="kottayam";
man.phno=65325532;
man.salary=32000;
man.printSalary();
    }
}
 class Officer extends Employee2{
     String gspecialization,department;
    public void printSalary(){
        System.out.println("Salary of officer is "+salary);
    }
}

class Manager extends Employee2{
    String gspecialization,department;
    public void printSalary(){
        System.out.println("Salary of officer is "+salary);
    }
}
