import java.util.Scanner;

public class PractiseSet1 {
    public static void main(String[] args){
        //Q1.Write a program to sum three numbers in Java.
        // Scanner num = new Scanner(System.in);
        // System.out.println("Enter 1st number");
        // int n1 = num.nextInt();
        // System.out.println("Enter 2nd number");
        // int n2 = num.nextInt();
        // System.out.println("Enter 3rd number");
        // int n3 = num.nextInt();
        // int sum = n1 + n2 + n3;
        // System.out.print("The sum is ");
        // System.out.print(sum);
        

        // Q2.Write a program to calculate CGPA using marks of three subjects (out of 100)
        Scanner num = new Scanner(System.in);
        System.out.println("Enter 1st subject number");
        float s1 = num.nextFloat();
        System.out.println("Enter 2nd subject number");
        float s2 = num.nextFloat();
        System.out.println("Enter 3rd subject number");
        float s3 = num.nextFloat();
        float cgpa = (s1 + s2 + s3)/30;
        System.out.print("The CGPA is "+cgpa);
        

        //Q3. Write a Java program that asks the user to enter his/her name and greets them with Hello <name>, have a good day text.
        //    Scanner name = new Scanner(System.in);
        //    System.out.println("Enter Your Name");
        //    String a = name.next();
        //    System.out.print("Hello "+ a + ", have a good day." );

        //Q4. Write a Java program to convert Kilometers to miles
        //    Scanner kilo = new Scanner(System.in);
        //    System.out.println("Enter Kilometer");
        //    int a = kilo.nextInt();
        //    float miles =(a * 0.621371);
        //    System.out.println("Kilometer to miles is " + miles);

        //Q5. Write a Java program to detect whether a number entered by the user is an integer or not
        //    Scanner number = new Scanner(System.in);
        //    System.out.println("Enter Number");
        //    if(number.hasNextInt()==true)
        //    System.out.println("YES");
        //    else
        //    System.out.println("NO");

    }
}
