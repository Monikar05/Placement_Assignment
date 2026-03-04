package Module04.AdvancedJavaConcepts;

final class FinalClass {
    final int value = 100;

    final void display() {
        System.out.println("Final method cannot be overridden.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Final variable: " + obj.value);
        obj.display();
    }
}
