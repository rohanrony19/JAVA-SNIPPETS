package Problems;

import java.util.Arrays;

// Check if Two Strings Are Anagrams
public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b) ? "Anagram" : "Not Anagram");
    }   
}
