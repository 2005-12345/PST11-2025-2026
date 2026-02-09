package PST;

import java.util.Scanner;

public class Ascii7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        CaseCheck obj = new CaseCheck();
        obj.check(ch);

        sc.close();
    }
}

class CaseCheck {

    void check(char ch) {

        if (ch >= 65 && ch <= 90) {
            System.out.println("The character is UPPERCASE");
        }
        else if (ch >= 97 && ch <= 122) {
            System.out.println("The character is LOWERCASE");
        }
        else {
            System.out.println("It is NOT an alphabet");
        }
    }
}
