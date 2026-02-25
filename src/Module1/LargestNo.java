package Module1;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = ob.nextInt();
        System.out.println("Enter the value of b:");
        int b = ob.nextInt();
        System.out.println("Enter the value of c:");
        int c = ob.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);
        ob.close();
    }
}
