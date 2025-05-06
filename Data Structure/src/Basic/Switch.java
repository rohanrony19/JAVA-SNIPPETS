package Basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any drinks name: ");
        String drinks = in.next();

        switch (drinks){
            case "beer":
                System.out.println("Calsberg");
                break;
            case "rum":
                System.out.println("OMR");
                break;
            case "whiskey":
                System.out.println("Blue label");
                break;
            case "vodka":
                System.out.println("Magic moment");
                break;
            case "gin":
                System.out.println("Bombay Sapphire");
                break;
            case "wine":
                System.out.println("Cabernet Sauvignon");
                break;
            case "brandy":
                System.out.println("Morpheus Blue");
                break;
            case "tequilla":
                System.out.println("Duke Spirit");
                break;
            case "champagne":
                System.out.println("Krug");
                break;
            case "liquor":
                System.out.println("Jagermeister");
                break;
            default:
                System.out.println("Please enter valid drinks");

        }

    }
}
