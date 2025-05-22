package Problems;
//Count Vowels in a String
public class CountVowels {
    public static void main(String[] args) {
        String a = "hello world";
        int count = 0;
        for (char i : a.toCharArray()) {
            if("aeiou".indexOf(i) != -1){
                count++;
            }

        }
        System.out.println("Vomel = "+ count);
    }
}
