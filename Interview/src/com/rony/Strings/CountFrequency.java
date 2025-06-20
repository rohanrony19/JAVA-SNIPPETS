package com.rony.Strings;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        String name = "programming";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length();i++){
            char ch = name.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }

}