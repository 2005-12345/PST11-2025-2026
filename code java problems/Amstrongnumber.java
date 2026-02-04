package PST;
import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		        
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int original = num;
		        int count = 0;
		        int sum = 0;

		        
		        if (num == 0) {
		            count = 1;
		        } else {
		            while (num != 0) {
		                count++;
		                num = num / 10;
		            }
		        }

		        
		        num = original;
		        while (num != 0) {
		            int digit = num % 10;
		            int power = 1;

		            for (int i = 1; i <= count; i++) {
		                power = power * digit;
		            }

		            sum = sum + power;
		            num = num / 10;
		        }

		       
		        if (sum == original) {
		            System.out.println(original + " is an Armstrong number");
		        } else {
		            System.out.println(original + " is NOT an Armstrong number");
		        }
		    }
		

        
        


		

	}


