package PST;
import java.util.Scanner;


public class ascii3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        AsciiPrint obj = new AsciiPrint();  
        obj.printAscii();                    

        sc.close();
    }
}
class AsciiPrint {

    void printAscii() {
        char ch = 'A';

        while (ch <= 'Z') {
            System.out.println(ch + " : " + (int) ch);
            ch++;
        }
    }
}

