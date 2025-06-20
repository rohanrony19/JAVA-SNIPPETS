package com.rony.Strings;

public class CountVowels {
    public static void main(String[] args) {
        String text = "Programming";
        int vowelCount = 0;
        int consonantCount = 0;
        String lowerText = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = lowerText.charAt(i); //get each character
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        //or

        System.out.println(StringContainsvowels("Hello"));
    }
        public static boolean StringContainsvowels(String input){
            return input.toLowerCase().matches(".*[aeiou]*.");

    }
}
