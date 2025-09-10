package com.xworkz.dsa;

public class ReverseWord {
    public static void main(String[] args) {
        String name = "Rohan Prasad";
        String[] words = name.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse().toString()).append(" ");
        }
        System.out.println("Original: " + name);
        System.out.println("Reversed: " + result.toString().trim());
    }
}
