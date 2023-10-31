package javaprogrammes;

import java.util.Scanner;

/* Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
* */
public class Programme10_ArmstrongNumber {

    public static void main(String[] args) {

        int n, arm = 0, rem, c;
        System.out.println("Enter any number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        c = n;
        r.close();
        while (n > 0) {
            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }
        if (c == arm){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

}