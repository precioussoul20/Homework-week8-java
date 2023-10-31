package javaprogrammes;
/* Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@


* */

import java.util.Scanner;

public class Programme8_RightAngleTriangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = s.nextInt();
        s.close();

        for (int i = 1; i <=numRows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("@");
            }
            System.out.println();

        }

    }
}
