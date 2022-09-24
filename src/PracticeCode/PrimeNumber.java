package PracticeCode;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n/2; i++) {
            temp = n % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}



/*
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i&lt;= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + "number is prime");
            else
                System.out.println(num + "number is not a prime");


    }

}
 */