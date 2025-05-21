package Basic.String;

import java.util.Arrays;

public class Code1 {
    public static void main(String[] args) {
        String name = "rony";
        String fullname = "Rohan Prasad";
        float a = 345.646f;
        System.out.println(name);
        //placeholders in java
        System.out.printf("Simple is %.2f %n",a);
        System.out.printf("Pie: %.3f %n",Math.PI);
        System.out.printf("Hello my name is %s and i am %s year old %n","Rohan ",23);
        System.out.println(Arrays.toString(fullname.toCharArray()));
//                %c - Character
//                %d - Decimal number (base 10)
//                %e - Exponential floating-point number
//                %f - Floating-point number
//                %i - Integer (base 10)
//                %o - Octal number (base 8)
//                %s - String
//                %u - Unsigned decimal (integer) number
//                %x - Hexadecimal number (base 16)
//                %t - Date/time
//                %n - Newline

    }
}
