package com.rony.Arrays.Basic;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,2,7,9};
        int target = 6;      
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Target in index = " + i);
                break;
            }
        }
            if(!found)
                System.out.println("target Not found");
            }
        }

