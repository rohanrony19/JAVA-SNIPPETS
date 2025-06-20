package com.rony.Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "apple";
        String word3 = "racecar";

        StringBuilder ss = new StringBuilder(word1);
        String name = ss.reverse().toString();

        if(word1.equals(name)){
            System.out.println( word1 + " " +"isPalindrome");
        }

        System.out.println(word1 + " = " + isPalindrome(word1));
        System.out.println(word2 + " = " + isPalindrome(word2));
        System.out.println(word3 + " = " + isPalindrome(word3));
        System.out.println("A is palindrome = " + isPalindrome("A"));
        System.out.println("\"\" is Palidrome = " + isPalindrome(""));
    }

    private static boolean isPalindrome(String str) {
        if(str == null || str.length() <=1){
            return true;
        }

        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
//        System.out.println(reversedStr);
//        if (str.equals(reversedStr)){
//            System.out.println("is Palindrome");
//        }else{
//            System.out.println("not a palindrome");
//        }
        return str.equals(reversedStr);
    }
}
