package PST;
import java.util.Scanner;
public class Ascii2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ASCII value: ");
        int ascii = sc.nextInt();

        AsciiToChar obj = new AsciiToChar(); 
        obj.findChar(ascii);
    }
	
	}

class AsciiToChar {
    void findChar(int ascii) {
        char ch = (char) ascii; 
        System.out.println("Character for ASCII value " + ascii + " is: " + ch);
    }
}