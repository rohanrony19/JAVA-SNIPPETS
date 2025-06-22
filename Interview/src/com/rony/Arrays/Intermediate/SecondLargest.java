package com.rony.Arrays.Intermediate;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,7,8};
        int max = Integer.MIN_VALUE;
        int Secondmax = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                Secondmax = max;
                max = arr[i];
            } else if (arr[i] > Secondmax && arr[i] != max) {
                Secondmax = arr[i];
            }
        }
            if (Secondmax == Integer.MIN_VALUE) {
                System.out.println("No second largest element found.");
            } else {
                System.out.println("Second largest: " + Secondmax);
            }
        }
    }

