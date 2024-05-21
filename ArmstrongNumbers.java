/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 2
   Question 5 (ArmstrongNumbers.java)
 */

import java.util.*;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = s.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit = s.nextInt();

        System.out.print("The Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are: ");
        for (int i=lowerLimit; i<=upperLimit; i++) {
            int exponent = 0;
            int number = i;
            int sum = 0;

            while (number!=0) {
                number/=10;
                exponent++;
            }
            number=i;

            while (number!=0) {
                int digit = number%10;
                sum+= (int) Math.pow(digit, exponent);
                number/=10;
            }
            if (sum==i) {
                System.out.print(i+" ");
            }
        }
    }
}
