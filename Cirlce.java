package PST;

import java.util.Scanner;

public class Cirlce {
    public static void main(String[] args) {
        
        float radius;
        double area;

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextFloat();

        
        area = 3.14159 * radius * radius;

        
        System.out.println("Area of the circle = " + area);

        sc.close();
    }
}
