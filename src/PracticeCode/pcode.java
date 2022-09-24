package PracticeCode;

import java.io.IOException;
import java.util.Scanner;

public class pcode {
    public static void main(String[] args) throws IndexOutOfBoundsException, IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println("Input String");
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println("CharAt index "+i+ " = " + str.charAt(i) );
//        }
//        System.out.println("Reversed String");
//        for (int i = str.length()-1; i >= 0; i--) {
//            System.out.println("CharAt index "+i+ " = " + str.charAt(i) );
//        }
        System.out.println("Counting vowels from string -a,e,i,o,u");
        char[] vowels = {'a','e','i','o','u'};
        //char[] temp=null;
        String temp = str.toLowerCase();
        System.out.println(temp);
        int count =0;
        //int count1=0;
        for (int i = 0; i < temp.length(); i++) {

            for (int j = 0; j < vowels.length; j++) {
                if(temp.charAt(i) == vowels[j]){
                    System.out.println(i +" = "+temp.charAt(i));
                    count++;
                }
            }
        }
        System.out.println("Total Vowels " + count);
        //System.out.println("Total Consonents " + count1);
    }
}
