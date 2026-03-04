package Module05.ExceptionHandelingANDMultithreading;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    static void checkValue(int value) throws MyException {
        if (value < 0) {
            throw new MyException("Negative value not allowed!");
        }
    }

    public static void main(String[] args) {
        try {
            checkValue(-5);
        } catch (MyException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
