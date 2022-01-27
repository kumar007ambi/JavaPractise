import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
       System.out.println("Taking Input From th User");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int a = sc.nextInt();
       System.out.println("Enter second number");
       int b = sc.nextInt();
       int sum = a + b;
       System.out.print("The sum is ");
       System.out.println(sum);
    }
}
