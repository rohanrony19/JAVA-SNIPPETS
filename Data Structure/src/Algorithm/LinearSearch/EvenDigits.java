package Algorithm.LinearSearch;
// Given an array nums of integers, return how many of them contain an even number of digits
// Input: nums = [12,345,2,6,7896]
// Output: 2
// 12 contains 2 digits(even number of digits)
// 345 contains 3 digits(odd number of digits)
// 2 contains 1 digits(odd number of digits)
// 6 contains 1 digits(odd number of digits)
// 7896 contains 4 digits(even number of digits)
// Therefore 12 and 7896 contains an even number of digits
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check whether a contains even digits or not
    static boolean even(int num) {
        int numberofDigits = digits(num);
        /*
        if(numberofDigits % 2 ==0){
            return true;
        }
        return false;
         */
        return numberofDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num){
        int count = 0;

        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
