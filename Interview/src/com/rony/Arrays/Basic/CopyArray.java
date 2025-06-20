package com.rony.Arrays.Basic;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length;i++){
            copy[i] = arr[i];
        }
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Copied Array: "+Arrays.toString(copy));
    }
}