package Pattern;

// Wrong Code

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        int i, j, space, n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (i=0; i<=n; i++){
            for(space =0 ;  space<n-i; ++space){
                System.out.print(" ");
            }
            for(j=i; j<=2; j++){
                System.out.print("*");
            }
            for (j=0; j<i-1; ++j){
                System.out.print(" ");
                System.out.println();
            }
        }
    }
}
