package Algorithm.LinearSearch;

import java.util.Arrays;

public class Code5 {
    public static void main(String[] args) {
        // Search in 2D array
        int[][] arr ={
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 99;
        int[] ans = search(arr,target); // format of return {row, col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr,int target){
        for ( int row = 0; row < arr.length; row++){
            for( int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

