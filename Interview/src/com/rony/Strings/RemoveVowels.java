package com.rony.Strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String input = "Beautiful World";
        String lower = input.toLowerCase();
        String result = "";
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
