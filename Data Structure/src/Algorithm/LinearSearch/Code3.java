package Algorithm.LinearSearch;

public class Code3 {
    public static void main(String[] args) {
        int[] arr = {18,12,-55,23,52,72};//range from start:1 to end:5
        int target = 23;
        System.out.println(linearsearch(arr,target,1,5));
    }
        static int linearsearch(int[] arr,int target, int start, int end){
            if (arr.length == 0) {
                return -1;
            }

            // run a for loop
            for (int index = start; index <= end ; index++) {
                //check for element at every index if it is = target
                int element = arr[index];
                if (element == target) {
                    return index;
                }
            }

            // this line will execute if none of the return statements above have executed
            // hence the target not found
            return -1;
        }
    }

