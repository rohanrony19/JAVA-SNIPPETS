package com.rony.Arrays.Intermediate;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[i] = arr[i+1];
            }
            arr[n - 1] = first;
        }
        System.out.println("Rotational array: ");
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
