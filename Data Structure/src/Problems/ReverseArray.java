package Problems;
//  Print Array in Reverse Order
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        for (int i = arr.length-1; i >= 0 ; i--) {
            int rev = arr[i];
            System.out.print(rev + " ");
        }
    }
}
