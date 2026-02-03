package PST;

import java.util.Scanner;

public class SIMPLEINTEREST {

    public static void main(String[] args) {

        int P, R, T;
        double SI;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of P");
        P = sc.nextInt();

        System.out.println("Enter the value of R");
        R = sc.nextInt();

        System.out.println("Enter the value of T");
        T = sc.nextInt();

        SI = (P * R * T) / 100.0;

        System.out.println("The value of SI is: " + SI);

        sc.close();
    }
}
