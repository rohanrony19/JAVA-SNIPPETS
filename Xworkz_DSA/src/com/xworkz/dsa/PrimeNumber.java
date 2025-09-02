package com.xworkz.dsa;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        System.out.println("Prime Number from 0 to "+num + "are: ");
        for (int number = 2; number <= num; number++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if(number % j  == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number + " ");
            }
        }
    }
}
