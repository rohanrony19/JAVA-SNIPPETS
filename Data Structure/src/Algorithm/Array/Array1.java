package Algorithm.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //Array of primitive
        //store a roll number
        int a = 19;

        //store a person's name
        String name = "rony";

        //store 5 roll numbers
        int rollno1 = 23;
        int rollno2 = 24;
        int rollno3 = 25;

        //syntax
        //datatype[] variable_name = new datatype[size];

        //store 5 roll numbers:

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 24;
        arr[2] = 25;
        arr[3] = 26;
        arr[4] = 27;
        System.out.println(arr[3]);

        //input using for loops
        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < arr.length ;i++){
//            arr[i] = in.nextInt();
//            System.out.println(arr[i]);
//        }
  
        for (int i = 0; i < arr.length ;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //enhanced for loop
        int[] arr1 = new int[10];
        for ( int num:arr1){
            num = in.nextInt();
            System.out.println(num + "");
        }
        //or directly
        int[] rolllno = {23,24,25,26,27};
    }
}
