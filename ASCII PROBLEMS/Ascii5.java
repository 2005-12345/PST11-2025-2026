package PST;
import java.util.Scanner;

public class Ascii5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		
		Printascii obj=new Printascii();
		obj.ascii(str);
	}

}
class Printascii{
	void ascii(String str) {
	for(int i=0;i<str.length();i++) {
		char a=str.charAt(i);
        System.out.println(a + " : " + (int) a);

	}
	
		
		
		
		}
}
