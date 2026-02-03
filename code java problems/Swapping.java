package PST;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value a:");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		
		System.out.println("Before swap: a = " + a + ", b = " + b);
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After swap: a = " + a + ", b = " + b);

		
	

	}

}
