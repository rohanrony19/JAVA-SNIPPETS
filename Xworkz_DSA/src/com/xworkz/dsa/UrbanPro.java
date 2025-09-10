package com.xworkz.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class UrbanPro {
    public static void main(String[] args) {
//        int[] arr= {1, 3, 4, 2, 3, 6, 4, 5};
//        System.out.println("Duplicate elements in the array:");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                    break;
//                }
//            }
//        }
//        Integer[] arr= {1, 3, 4, 2, 3, 6, 4, 5};
//        List<Integer> list = Arrays.asList(arr);
//        Set<Integer> duplicates =
//                list.stream().filter(i-> Collections.frequency(list,i)>1).collect(Collectors.toSet());
//        System.out.println("Duplicate elements: " + duplicates);
        
        int[] arr= {1, 3, 4, 2, 3, 6, 4, 5,4,2};
        Map<Integer,Integer> freq = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
            if(freq.get(num) == 2){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates elements: " + duplicates);
    }
}