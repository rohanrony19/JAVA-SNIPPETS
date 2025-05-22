package Problems;
// Find Largest Number in Array
public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {2,6,12,73,82,14,66};
        int max = arr[0];
        for(int i:arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println("Max = " + max);
    }
}
