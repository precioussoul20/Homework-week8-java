package javaprogrammes;

import java.util.Scanner;

/* Write a program in Java to display the pattern like a triangle with a number. For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910

* */
public class Programme6_NumberTriangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers of rows: ");
        int numRows = s.nextInt();
        s.close();

        for (int i = 1; i <=numRows ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
