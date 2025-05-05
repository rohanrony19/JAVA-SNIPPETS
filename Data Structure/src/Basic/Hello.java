package Basic;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();//Whole line (includes spaces)
        //String name= sc.next(); 	One word (stops at space)
        System.out.println("Hello " + name);
    }
}
