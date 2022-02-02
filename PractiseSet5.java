public class PractiseSet5 {
    static void multiplication(int x){
        for(int i=1;i<=10;i++){
          System.out.format("%d X %d = %d\n",x,i,x*i);
        } 
    }

    //Pattern
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pattern in recursive way
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line

    //Natural Sum
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    //fibonacci
    static int fib(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    //Celcius to fahrenheit
    // static double far(double n){
    //     double  fahrenheit = 0.0;
    //     fahrenheit = (n* 1.8) + 32;
    //     return fahrenheit;
    // }

      //VarArgs Agerarge
      static int avg(int ...arr){
       int result = 0;
       for(int i=0;i<arr.length;i++){
           result=result+arr[i];
       }
       return (result/arr.length);
    }
    public static void main(String[] args) {
       //Q1.Table 
       //multiplication(5); 

        //Q2.Pattern
        //  pattern(5);
       
        //Q3.Natural sum
        // int c = sumRec(4);
        // System.out.println(c);

        //Q4.Write a function to print the nth term of the Fibonacci series using recursion.
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // int result = fib(7);
        // System.out.println(result);

        //Q5.Write a function to find the average of a set of numbers passed as arguments.
          System.out.println("The avgerage is : "+avg(2,4,5,9));
        //Q6.Repeat problem 2 using Recursion.
        // pattern1_rec(5);

         //Q7.Write a function to convert Celsius temperature into Fahrenheit.
        //  double cel = 10.0;
        //  System.out.println("value of temperature in fahrenheit : " + far(cel));

    }
}
