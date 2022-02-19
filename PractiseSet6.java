public class PractiseSet6 {
  public static void main(String[] args){
    System.out.println("Custom Class");
    // //Problem 1
    // Employee pr=new Employee();
    // pr.setName("Ambika");
    // pr.salary=120000;
    // System.out.println(pr.getSalary());
    // System.out.println(pr.getName());

    // //problem 2
    // Phone p=new Phone();
    // p.ring();
    // p.vibrate();

    // //problem 3
    // Square s=new Square();
    // s.side=5;
    // System.out.println(s.area());
    // System.out.println(s.perimeter());


    //problem 4
    Rect r=new Rect();
    r.l=5;
    r.b=4;

    System.out.println(r.area());
    System.out.println(r.perimeter());
  }
}


//Custom Class
class Employee{
    //properties
    String name;
    int salary;
    //methods
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name=n;
    }
}

//2.phone class
class Phone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}

//class Square
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}


//class Rect
class Rect{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }

}
