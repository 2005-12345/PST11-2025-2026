package PST;

import java.util.Scanner;



public class ascii4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        AsciiPrint obj = new AsciiPrint();  
        obj.printAscii();     

        sc.close();
    }
}
class Value {

    void printAscii() {
    	for(char ch='a';ch<='z';ch++) {
			System.out.println(ch + " : " + (int) ch);
            
        }
    }
}


