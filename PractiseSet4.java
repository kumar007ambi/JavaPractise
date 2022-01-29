public class PractiseSet4 {
    public static void main(String[] args) {
        //Q1.Sum of float array
        // float [] arr = {12.52f,13.42f,25.85f,62.38f,52.12f};
        // float sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println("The sum is "+sum);

        //Q2.Write a program to find weather a integer is present or not in an array
        // int [] arr = {10,12,52,64,40};
        // int num = 64;
        // int present=0;
        // for(int i=0;i<arr.length;i++){
        //     if(num==arr[i]){
        //         present=1;
        //         break;
        //     }
        // }
        // if(present==1){
        //     System.out.println("The value is present in array");
        // }else{
        //     System.out.println("The value is not present in array");
        // }

        //Q3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop
        //    float [] arr = {12.52f,13.42f,25.85f,62.38f,52.12f};
        //    float total=0;
        //    for(float marks:arr){
        //         total=total+marks;
        //    }
        //    System.out.println("The average is "+total/arr.length);
        //Q4.Create a Java program to add two matrices of size 2x3.
        // int [][] mat1 = {{1,2,3},
        //               {4,5,6}};
        // int [][] mat2 = {{7,8,9},
        //               {1,2,3}};
        // int [][] result = {{0, 0, 0},
        //                   {0, 0, 0}};

        // for(int i=0;i<mat1.length;i++){// row number of times
        //     for(int j=0;j<mat1[i].length;j++){// column number of time
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }
        // // Printing the elements of a 2-D Array
        // for(int i=0;i<mat1.length;i++){
        //     for(int j=0;j<mat1[i].length;j++){
        //         System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println(" ");
        // }
        //Q5.Reverse an array
        // int [] arr = {10,12,52,64,40};
        // for(int i=arr.length-1;i>=0;i--){
        //    System.out.println(arr[i]);
        // }

        //Q6.Write a Java program to find the maximum element in an array.
        // int [] arr = {10,12,52,64,40};
        // int max=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max)
        //       max=arr[i];
        // }
        // System.out.println(max);
        
        //Q7.Write a Java program to find the minimum element in an array.
        int [] arr = {10,12,52,64,40};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
              min=arr[i];
        }
        System.out.println(min);

        //Q8.Sort or Nor
        // boolean isSorted = true;
        // int [] arr = {1, 12, 3, 4, 5, 34, 67};
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i] > arr[i+1]){
        //         isSorted = false;
        //         break;
        //     }
        // }
        // if(isSorted){
        //     System.out.println("The Array is sorted");
        // }
        // else{
        //     System.out.println("The Array is not sorted");
        // }

    }
}
