package Problems;

//Find Second Largest Number in Array
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 10, 7};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num:arr){
            if(num > max){
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}
