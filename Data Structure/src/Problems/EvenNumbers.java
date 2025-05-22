package Problems;

import java.util.Scanner;
// Print Even Numbers from 1 to N
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int N = in.nextInt();
        for (int i = 0; i <= N; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
