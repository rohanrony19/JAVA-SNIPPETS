package Basic.Methods;

public class StringExample {

    public static void main(String[] args) {
//        String message = dominos();
//        System.out.println(message);

        String personalized = myGreat("Rony");
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
