package Array;
// Take user input array size
// take input values
// take random element want to search
// find throw array

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and cols size: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter the values: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element want to search: ");
        int flag = 0;
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == n) {
                    flag = 1;
                    System.out.println(n + "-Found at positon " + i + " x " + j);
                    break;
                }
            }

            }
        if(flag == 0 ){
            System.out.println("No such element: ");
          }

    }
}
