package com.xworkz.dsa;

public class StrongNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 145;
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is not a Strong Number.");
        }
    }
}

