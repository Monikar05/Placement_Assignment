package Module04.AdvancedJavaConcepts;

public class StringReverse {
    public static void main(String[] args) {
        String str = "HELLO World";
        System.out.println("Print the String: " + str);

        StringBuilder sbl = new StringBuilder(str);
        String s = sbl.reverse().toString();

        System.out.println("After reverse without StringBuffer: " + s);
    }
}