package Module04.AdvancedJavaConcepts;

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Objects created: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.showCount();
    }
}
