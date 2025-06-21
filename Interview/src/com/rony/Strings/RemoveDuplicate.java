package com.rony.Strings;

public class RemoveDuplicate {
    public static void main(String[] args) {
    String str = "programming";
    String result = "";
    boolean[] seen = new boolean[256]; // for all ASCII characters

        for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (!seen[ch]) {
            result += ch;        // add if not seen
            seen[ch] = true;     // mark as seen
        }
    }

        System.out.println("After removing duplicates: " + result);
}
}
