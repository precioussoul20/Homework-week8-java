package javaprogrammes;
/* -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
* */

import java.util.Scanner;

public class Programme2_MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true){
            System.out.println("Enter number (or ant non-integar to exit): ");

            if (s1.hasNextInt()){
                int number = s1.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break; //Exit the loop if an invalid input is provided
            }
        }
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            System.out.println("No valid numbers entered");
        } else {
            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
        }
        s1.close();
    }
}
