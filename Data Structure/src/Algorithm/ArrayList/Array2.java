package Algorithm.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //Array of strings
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "rony";
        System.out.println(Arrays.toString(str));

        int[] nums = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums));
        changes(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void changes(int[] arr){
        arr[0] = 99;
    }
}
