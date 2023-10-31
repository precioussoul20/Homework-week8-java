package javaprogrammes;
/* Write a Java program that takes the user to provide a single character from the alphabet.
Print Vowel of Consonant, depending on the user input.
If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1,
 print an error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
*/

import java.util.Scanner;

public class Programme3_VowelOrConsonant {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Input an alphabet: ");
        String input = s1.next();  // Read a full line of input

        if (input.length() == 1) {
            char ch = input.charAt(0);

            //Check if the input is a singlr character
            if ((ch>= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                //Convert the character to lowercase for easy camparision
                char lowercaseCh = Character.toLowerCase(ch);

                //Check if the lowercase ia a Vowel
                if (lowercaseCh=='a' || lowercaseCh=='e' || lowercaseCh=='i' || lowercaseCh=='o' || lowercaseCh=='u'){
                    System.out.println("Input letter is Vowel. ");
                } else {
                    System.out.println("Input letter is Consonant. ");
                }
            } else {
                System.out.println("Invalid input: Not a alphabet letter. ");
            }
        } else {
            System.out.println("Invalid input length should be 1");
        }
        s1.close();
    }

}



