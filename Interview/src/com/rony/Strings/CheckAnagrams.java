package com.rony.Strings;

import java.util.Arrays;

public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "listen",s2 = "silent";
        if(s1.length() != s2.length()){
            System.out.println("Not Anagrams");
            return;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean result = Arrays.equals(a1,a2);
        System.out.println("Anagrams: " + result);
    }
}
