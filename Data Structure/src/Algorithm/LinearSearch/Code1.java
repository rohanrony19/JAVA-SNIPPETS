package Algorithm.LinearSearch;

public class Code1 {
    public static void main(String[] args) {
        int[] nums = {23,44,65,72,-22,18,-55,30};
        int targets = 72;
        int ans = linearsearch2(nums,targets);
        int ans1 = linearsearch(nums,targets);
        System.out.println(ans);
        System.out.println(ans1);
    }
    // search target and return the element
    static int linearsearch2(int[] arr,int target){
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearsearch(int[] arr,int target){
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int  index= 0; index < arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
