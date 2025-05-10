package Basic.Methods;

public class Overloading {
    public static void main(String[] args) {
        fun(69);
        fun("mansi");
        fun(10,20); 
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int a,int b){
        System.out.println(a + b);
    }
}
