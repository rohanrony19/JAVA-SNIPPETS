package Basic;

public class Conditional_Statements {
    public static void main(String[] args) {
        /*
            Syntax of if statements:
            if (boolean expression T or F) {
                //body
            }else{
                //do this

         */

        int salary = 25400;
        if (salary > 10000){
            salary = salary + 2000;
        }else {
            salary = salary + 1000;
        }
        // multiple if-else

        if (salary > 10000){
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        }else {
            salary += 1000;
        }

        System.out.println(salary);

        // Switch statements

        int day = 3;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        //ternary operator

        int x = 7;
        String result = (x>5) ? "true":"false";
        System.out.println(result);
    }
}
