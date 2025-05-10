package Basic.Methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(10,20);

        String name = "rony";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name){
        name = "rohan"; //creating a new object
    }
    
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

    }
}
