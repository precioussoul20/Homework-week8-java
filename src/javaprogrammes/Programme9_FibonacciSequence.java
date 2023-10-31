package javaprogrammes;

import java.util.Scanner;

// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Programme9_FibonacciSequence {

    public static void main(String[] args) {

        int term, a =1, b = 1, c;
        System.out.println("Enter term ");
        Scanner s = new Scanner(System.in);
        term = s.nextInt();
        s.close();
        for (int i = 1; i <= term; i++) {

            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}