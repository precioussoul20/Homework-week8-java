package javaprogrammes;
/*
* Display left angle triangle of * using nested for loops
 */

public class Programme15_LeftAngleTriangle {

    public static void main(String[] args) {
        int rows =5;
        for ( int i = 0; i< rows; i++) { //for i loop
            for (int k = 2*(rows-i); k>= 0; k--) { // for space loop
                System.out.print(" ");
            }// end space loop
            for (int j = 0; j<= i; j++) { //for j loop
                System.out.print("* ");
            }// end j loop
            System.out.println();
            // end i loop
        }
    }
}


