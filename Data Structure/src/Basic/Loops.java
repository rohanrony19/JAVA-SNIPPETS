package Basic;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
             Syntax of for loops:

             for(initialization; condition; increment/decrement){
                //body
             }
         */
        //Print numbers from 1 to 5
//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//        }

        //Print Numbers from 1 to n
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
            System.out.println("love uh");
            
        }

        // while loops
        /*

            Syntax:
            while (condition) {
                // body
            }
         */

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num += 1;
        }

        // do-while
        /*

            do{
                //body
            }while (condition);
         */
        int m = 1;
        do {
            System.out.println(m);
            m++;
        }while (m <= 5);
    }
}
