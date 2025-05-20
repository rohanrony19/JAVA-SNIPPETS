package Algorithm.Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 8,18};
        int[] arr1 = {1 ,2 ,3 ,4 ,5};
        swap(arr, 0, 4);
        reverse(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    static void reverse(int[] arr1){
        int start = 0 ;
        int end = arr1.length-1;

        while (start < end){
            // swap
            swap(arr1,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
