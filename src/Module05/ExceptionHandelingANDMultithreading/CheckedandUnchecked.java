package Module05.ExceptionHandelingANDMultithreading;


public class CheckedandUnchecked {
    public static void main(String[] args) {
        // Unchecked Exception (RuntimeException)
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        // Checked Exception (IOException)
        try {
            java.io.FileReader fr = new java.io.FileReader("nonexistent.txt");
        } catch (java.io.IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}