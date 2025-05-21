package Algorithm.LinearSearch;

import static jdk.nashorn.internal.objects.NativeMath.min;

public class Code4 {
    public static void main(String[] args) {
        // Find minimum element in the array
        int[] arr = {24,36,72,-43,94,18};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    //assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length;i++ ){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length;i++ ){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
