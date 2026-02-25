package Module2;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("The given number is Palindrome");
        else
            System.out.println("Given number is Not Palindrome");
    }
}
