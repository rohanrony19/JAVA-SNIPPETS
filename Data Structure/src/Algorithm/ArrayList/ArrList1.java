package Algorithm.ArrayList;

import java.util.ArrayList;

public class ArrList1 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Print all items
        System.out.println(fruits); // [Apple, Banana, Mango]

        // Access by index
        System.out.println(fruits.get(1)); // Banana

        // Change element
        fruits.set(1, "Orange");
        System.out.println(fruits); // [Apple, Orange, Mango]

        // Remove element
        fruits.remove("Mango");

        // Size of list
        System.out.println(fruits.size()); // 2

        // Loop through list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
