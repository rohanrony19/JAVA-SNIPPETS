package Advance;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            // Only check up to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) { //Math.sqrt(num) is same as num/i
                if (num % i == 0) {
                    isPrime = false;
                    break;  // no need to continue once we find a divisor
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
