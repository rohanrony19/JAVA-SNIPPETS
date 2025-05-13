package Basic.Methods;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
//        String message = dominos();
//        System.out.println(message);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        String personalized = myGreat(name);
        System.out.println(personalized);
    }
    static  String myGreat(String name){
        String message = "Hello " + name;
        return message;  
    }
    static String dominos(){
        String pizza = "pizza is delicious ";
        return pizza;
    }

    /*
    return_type name(arguments) {
        //body
        return statement;
    }
     */
}
