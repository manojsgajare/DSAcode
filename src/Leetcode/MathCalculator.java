package Leetcode;

import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int x = sc.nextInt();
        System.out.println("Enter number two: ");
        int y = sc.nextInt();
        System.out.println("Enter the character for your operation: ");
        char operator = sc.next().charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            int result = calculate(x,y,operator);
            System.out.println("The result of operation is: " + result);
        }
        else{
            System.out.println("You entered wrong operator...");
        }
    }
        static int calculate(int number1, int number2, char operator) {
            int result = 0;
            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number1;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
            }
            return result;
        }
}
