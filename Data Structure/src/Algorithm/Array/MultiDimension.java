package Algorithm.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        int[][] arr = new int[3][3];//row,column or int[3][]

        int[][] arr1 = {
                {1,2,3},    //{1,2,3} index=0
                {4,5,6},    //{4,5}  index=1
                {7,8,9}     //{6,7,8,9} index=2
        };
//        System.out.println(arr1[1][1]);

        //input
        Scanner in = new Scanner(System.in);
        int[][] arr2 = new int[3][3];
        System.out.println(arr2.length); //no of rows=3
        for(int row = 0; row < arr2.length; row++){
            // for each col in every row
            for (int col = 0; col < arr2[row].length ;col++) {
                arr2[row][col] = in.nextInt();
            }
        } 
        //output
//        for(int row = 0; row < arr2.length; row++){
//            // for each col in every row
//            for (int col = 0; col < arr2[row].length ;col++){
//
//                System.out.print(arr2[row][col] + " ");
//            }
//            System.out.println();
//        }
        for(int row = 0; row < arr2.length; row++){
            System.out.println(Arrays.toString(arr2[row]));
        }
        //enhanced for loop
        for(int[] a:arr2){
            System.out.println(Arrays.toString(a));
        }

    }
}
