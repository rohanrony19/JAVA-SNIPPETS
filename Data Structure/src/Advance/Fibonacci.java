package Advance;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //0,1,2,3,4,5,6,7,8,9,10,11
        //0,1,1,2,3,5,8,13,21,34,55,...
        //0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8, 5+8=13, ...
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);

    }
}
