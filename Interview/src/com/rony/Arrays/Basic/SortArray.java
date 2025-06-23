package com.rony.Arrays.Basic;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
    int[] OriginalArrAsc = {1,5,3,7,2,6,4};
    Arrays.sort(OriginalArrAsc);
    System.out.println(Arrays.toString(OriginalArrAsc));

    int[] OriginalArrDesc = {1,5,3,7,2,6,4};
    Desc(OriginalArrDesc);
    System.out.println(Arrays.toString(OriginalArrDesc));
    }

    public  static void Desc(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i ; j++) {
                if (arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }

        }


    }
}
