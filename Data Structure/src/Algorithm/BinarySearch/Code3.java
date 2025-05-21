package Algorithm.BinarySearch;

public class Code3 {
    public static void main(String[] args) {
        //int[] arr = {-18,-4,0,2,3,4,5,15,33,58,72,89,92};
        int[] arr ={99,80,74,65,54,34,21,16,10,2,0,-4,-34,-69};
        int target = -69;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            // Find whether the array is sorted in ascending or descending
            // boolean isAsc = arr[start] < arr[end];
            boolean isAsc;
            if (arr[start] < arr[end]) {
                isAsc = true;
            }else {
                isAsc = false;
            }
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + ( end - start) / 2;
            // arr[mid] = element
            // mid = index
            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if ( target <  arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else{
                if ( target >  arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

