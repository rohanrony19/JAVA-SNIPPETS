package Problems;
//Find Factorial of a Number
public class Factorial {
    public static void main(String[] args) {
        int num = 5;  //5*4*3*2*1
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }
}
