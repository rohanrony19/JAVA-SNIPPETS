package Algorithm.BinarySearch;

public class Code2 {
    public static void main(String[] args) {
        int[] arr = { -18,-4,0,2,3,4,5,15,33,58,72,89,92};
        int target = 72;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            // Find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + ( end - start) / 2;
            // arr[mid] = element
            // mid = index
            if ( target <  arr[mid]){
                end = mid - 1;
            }else if (target >  arr[mid]){
                start = mid + 1;
            }else{
                // ans found
                return mid;
            }
        }
         return -1;
    }
}
