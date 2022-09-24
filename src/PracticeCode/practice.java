package PracticeCode;//import javax.swing.*;
//import java.lang.*;
//
//public class practice {
//    public static void main(String[] args) {
//        String s = "AmaN 1 9 3 is 5 g  5ood boy But ha 8  A d Bad Habits";
//        String v = "A,E,I,O,U";
//       int i;
//        String abc;
//        for (i = 0; i < s.length(); i++)
//            if (Character.isDigit(s.charAt(i))) {
//                abc = String.valueOf(s.charAt(i));
//                //System.out.print(abc + "\t");
//                char[] arr = abc.toCharArray();
//
//                char temp;
//                int j=0;
//                while(i< arr.length)
//                {
//                    int k = j+1;
//                    while (j> arr.length){
//                        if(arr[j]<arr[j]){
//                            temp=arr[j];
//                           // arr[j] == arr[k];
//                            arr[k] = temp;
//                        }
//                        k+=1;
//                    }
//                    j+=1;
//                }
//                System.out.print(arr);
//                //System.out.println(arr.length);
//            }
//
//    }
//}
//
//
//

import java.util.*;
public class practice {
    public static void main(String[] args) {
        pattern2(10);
        pattern3(6);
    }

    static void pattern2(int n) {
        for (int row = n; row >= n; row--) {
            for (int col = row; col >= n - 1; col--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
        static void pattern3 ( int n)
        {
            for (int row = n; row >= n; row--) {
                for (int col = row; col >= n - 1; col--) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

