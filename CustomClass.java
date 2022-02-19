// import java.util.Scanner;

public class CustomClass {
    public static void main(String[] args) {
       System.out.println("Custom Class");
    //    Scanner sc = new Scanner(System.in);
     //Multile objects
       Employee em = new Employee(); // Instantiating a new Employee Object
       Employee en = new Employee(); // Instantiating a new Employee Object
       //Setting attributes for ambika
       em.id=12;
       em.name="Ambika";
       em.salary=120000;
       //Setting attributes for kumar
       en.id=15;
       en.name="Kumar";
       en.salary=150000;
       //calling the methods
       em.printDetails();
       en.printDetails();
       int emsalary = em.getSalary();
       System.out.println(emsalary);
       int ensalary = en.getSalary();
       System.out.println(ensalary);
       //    System.out.print(em.id);
       //    System.out.print(em.name);
    }
}
//Custom Class
class Employee{
    int id;
    int salary;
    String name;
    //Methods
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}