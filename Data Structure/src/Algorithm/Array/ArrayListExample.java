package Algorithm.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        //Array list in nothing which does not have size to be declare
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(67);
//        list.add(68);
//        list.add(69);
//        list.add(64);
//        list.add(557);
//        list.add(688);
//        list.add(70);
//        list.add(72);

//        System.out.println(list);
//        list.set(0, 99);//0 index is 99
//        list.remove(3);
//        System.out.println(list);

        //input
        for(int i = 0 ; i < 5 ; i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(list.get(i)); // pass index here,list[index] syntax will not work here
        }
        System.out.println();

    }
}
