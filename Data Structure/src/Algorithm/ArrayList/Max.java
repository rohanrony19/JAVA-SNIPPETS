package Algorithm.ArrayList;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 54,18};
        System.out.println(maxRange(arr,1,3));
    }
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //imagine that arr is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
