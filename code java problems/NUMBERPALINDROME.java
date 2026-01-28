package PST;

import java.util.Scanner;

public class NUMBERPALINDROME{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0, digit;

        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is NOT a Palindrome");
        }
    }
}
