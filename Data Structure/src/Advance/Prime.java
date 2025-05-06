package Advance;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 1️⃣ Create Scanner to read input
        System.out.print("Enter a number: "); // 2️⃣ Ask user for input
        int num = sc.nextInt();               // 3️⃣ Read the number and store in 'num'

        int count = 0;  // 4️⃣ This will count how many times 'num' is divisible

        // 5️⃣ Loop from 1 to num
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { // 6️⃣ Check if 'num' is divisible by 'i'
                count++;        // 7️⃣ If yes, increase the count
            }
        }

        // 8️⃣ If num is divisible exactly 2 times (1 and itself), it's prime
        if (count == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
