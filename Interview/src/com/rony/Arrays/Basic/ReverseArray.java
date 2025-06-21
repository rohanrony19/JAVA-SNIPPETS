package com.rony.Arrays.Basic;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        int n = arr.length;
//        for (int i = 0;i<n/2 ;i++) {
//            int temp =  arr[i];
//            arr[i] = arr[n-i-1];
//            arr[n-i-1] = temp;
//        }
        //or
        System.out.print("Reversed Array: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+ ",");
        }

    }
}
