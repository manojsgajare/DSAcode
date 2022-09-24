package PracticeCode;

import java.util.Scanner;

public class areaOfSquare {

    static int square( int l,int  b)
    {
        return l + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(square(l,b));
    }
}
