package PST;

import java.util.Scanner;

public class Celcius{
    public static void main(String[] args) {

        float celsius, fahrenheit;

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextFloat();

        
        fahrenheit = (celsius * 9 / 5) + 32;

        
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

        sc.close();
    }
}
