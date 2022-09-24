package DSAExamples.src.PracticeCode;
 /*
       java code to find factorial of number using
       function
     */

import java.util.Scanner;

public class factorialJava {
       public static void printFactorial(int n){

            if (n < 0) {
                System.out.println("Number is negative:");
                return;   //return to the main function
            }

            int factorial =1;
            for (int i = n; i >1 ; i--) {
                factorial = factorial*i;
            }
            System.out.println(factorial);
            return;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            printFactorial(n);
        }
    }


