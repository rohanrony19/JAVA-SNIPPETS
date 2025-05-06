package Advance;

public class CountNums {
    public static void main(String[] args) {
        int n =168477207; //repeatation

        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == 7){ //how many times 7 repeats
                count++;
            }
            n = n / 10; // n /=10
        }
        System.out.println(count);
    }
}
