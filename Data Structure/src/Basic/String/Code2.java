package Basic.String;

public class Code2 {
    public static void main(String[] args) {
        //StringBuilder
        StringBuilder builder = new StringBuilder();
        for ( int i = 0; i < 26; i++){
            char ch = (char)('a'+i);
            builder.append(ch);

        }
        System.out.println(builder.toString());
        builder.delete(4,10);
        System.out.println(builder);
    }
}
