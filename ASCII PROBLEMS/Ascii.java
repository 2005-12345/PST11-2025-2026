package PST;
import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		AsciiNumber obj=new AsciiNumber();
		obj.findAscii( ch);
		
		
		
		}

}
class AsciiNumber{
	void findAscii(char ch) {
		int asciii=ch;
		System.out.println("The ascii value of" + ch + "is" + asciii);
		
	}
}
