import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args){
        System.out.println("Enter Your Five best Marks");
        Scanner ma = new Scanner(System.in);
        System.out.println("Enter Your First Subjet Number");
        int s1 = ma.nextInt();
        System.out.println("Enter Your Second Subjet Number");
        int s2 = ma.nextInt();
        System.out.println("Enter Your Third Subjet Number");
        int s3 = ma.nextInt();
        System.out.println("Enter Your Fourth Subjet Number");
        int s4 = ma.nextInt();
        System.out.println("Enter Your Fifth Subjet Number");
        int s5 = ma.nextInt();
        int result = s1 + s2 + s3 + s4 +s5;
        System.out.print("Your Total marks is ");
        System.out.println(result);
        float percentage = (result/5);
        System.out.print("Your Percentage is ");
        System.out.print(percentage);
        ma.close();
    }
}
