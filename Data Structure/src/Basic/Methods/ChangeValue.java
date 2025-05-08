package Basic.Methods;

import java.lang.reflect.Array;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Array.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99; //if you make a change to the object via this ref variable,
    }
}
