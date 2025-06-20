package com.rony.Strings;

public class JoinTwoString {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String combined = part1 +" "+ part2;
        String part = part1.concat(" " +part2);
        System.out.println(part );
        System.out.println(combined);
    }
}
