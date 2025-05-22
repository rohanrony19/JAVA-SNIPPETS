package Problems;

import java.util.Arrays;

// Move All Zeros to End of Array
public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int index = 0;

        for (int num : arr){
            if(num != 0){
                arr[index++] = num;
            }
        }
        while (index < arr.length){
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr)); //[1,3,12,0,0]
    }
}
