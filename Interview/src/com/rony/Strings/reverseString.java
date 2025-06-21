package com.rony.Strings;

public class reverseString {
    public static void main(String[] args) {
        String name = "Rony";
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println("Original String : " + name);
        System.out.println("Reversed String : " + reversed);

        //or

        String nam = "Raji";
        String rev = "";
        for (int i = nam.length()-1; i >= 0 ; i--) {
            rev += nam.charAt(i);
        }
        System.out.println(rev);
        }
    }

