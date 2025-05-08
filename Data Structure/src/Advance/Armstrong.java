package Advance;

import java.util.Scanner;

//153 --> 3 digits we have to cube it every digit and add it
//1^3 + 5^3 + 3^3
//if 1546 --> 1^4 + 5^4 + 4^4 + 6^4
public class Armstrong {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                int originalNum = num;
                int result = 0;
                int n = String.valueOf(num).length();

                while (num != 0) {
                    int digit = num % 10;
                    result += Math.pow(digit, n);
                    num /= 10;
                }

                if (result == originalNum) {
                    System.out.println(originalNum + " is an Armstrong number.");
                } else {
                    System.out.println(originalNum + " is not an Armstrong number.");
                }
            }
        }


