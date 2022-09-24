package Infy_SP;

import java.util.Scanner;
import java.lang.*;
import java.lang.Math;


public class CoPrimeNumber {
    public static void main(String[] args) {

        int a,b,root,i,hcf =1;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a>b)
            root = (int) Math.sqrt(a);
        else
            root = (int) Math.sqrt(b);
        for (i = 2; i <=root ; i++) {
            if(a%i==0 && b%i==0)
            {
                hcf = i;
                break;
            }
        }
        if(hcf == 1)
            System.out.println("Co prime");
        else
            System.out.println("Not coPrime");
    }
}
