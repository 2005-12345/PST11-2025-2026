package PST;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        int m1, m2, m3;
        int total;
        float avg;

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter mark 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        m3 = sc.nextInt();

        
        total = m1 + m2 + m3;
        avg = total / 3.0f;

        
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        sc.close();
    }
}
