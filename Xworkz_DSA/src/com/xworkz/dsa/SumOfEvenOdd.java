package com.xworkz.dsa;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int sum = sc.nextInt();
        int even = 0;
        int odd = 0;
        for (int i = 0; i <= sum; i++) {
            if (i % 2 == 0) {
                even += i;
            }else{
                odd += i;
            }
        }
        System.out.println("Sum of Even Numbers from 0 to " + sum + " is: " + even);
        System.out.println("Sum of Odd Numbers from 0 to " + sum + " is: " + odd);
    }
}
