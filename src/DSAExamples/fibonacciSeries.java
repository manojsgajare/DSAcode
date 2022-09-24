package DSAExamples;

/*
Q #9) Write a Java Program for the Fibonacci series.

Answer: Fibonacci series is a series of numbers where after the initial two numbers,
every occurring number is the sum of two preceding numbers.

For Example 0,1,1,2,3,5,8,13,21………
 */


import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {

        int n, a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want the number of times series: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }
    }
}
