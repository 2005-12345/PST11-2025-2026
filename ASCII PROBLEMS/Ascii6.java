package PST;
import java.util.Scanner;

public class Ascii6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        Sumascii obj = new Sumascii();
        obj.sumAscii(str);

        sc.close();
    }
}

class Sumascii {

    void sumAscii(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sum = sum + ch;
        }

        System.out.println("Sum of ASCII values = " + sum);
    }
}
