package com.rony.Arrays.Intermediate;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != target){
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                result[j++] = arr[i];
            }
        }

        // Print the result
        System.out.print("Array after removing " + target + ": ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
