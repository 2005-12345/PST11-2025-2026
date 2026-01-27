package PST;

import java.util.Scanner;

public class Vowelorconsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        
        if (Character.isLetter(ch)) {
            
            char lowerCaseCh = Character.toLowerCase(ch);

            
            if (lowerCaseCh == 'a' || lowerCaseCh == 'e' || lowerCaseCh == 'i' || lowerCaseCh == 'o' || lowerCaseCh == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not a letter.");
        }
        
        scanner.close();
    }
}
