package Algorithm.LinearSearch;

import java.util.Arrays;

public class Code2 {
    public static void main(String[] args) {
        // search in string
        String name = "rony";
        char target = 'o';
        System.out.println(search(name,target));
        System.out.println((char) search1(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String name, char target){
        if (name.length()==0){
            return false;
        }
        for(int index=0;index<name.length();index++){
            if(target==name.charAt(index)){
                return true;
            }
        }
        return false;
    }
    static int search1(String name, char target) {
        if (name.length() == 0) {
            return -1;
        }
        for (int index = 0; index < name.length(); index++) {
            char element = name.charAt(index);
            if (element==target) {
                return target;
            }
        }
        return -1;
    }
    static boolean search2(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for(char ch: name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
