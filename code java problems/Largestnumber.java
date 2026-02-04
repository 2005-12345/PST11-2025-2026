package PST;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the number2:");
		int num2=sc.nextInt();
		
		
		System.out.println("Enter the number3:");
		int num3=sc.nextInt();
		
		int largest=0;
		
		
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

         
        System.out.println("The largest number is: " + largest);
    }


				  
		

	}


