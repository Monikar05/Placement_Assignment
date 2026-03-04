package Module05.ExceptionHandelingANDMultithreading;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class AgeCheck {
    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above!");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
