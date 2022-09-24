package DSAExamples.src.String;

import java.util.Scanner;
public class reversWordByWord {
    public static void main(String[] args) {

        reversWordByWord rs = new reversWordByWord();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str =sc.nextLine();
        System.out.println("Reversed string is: "+ rs.reverString(str));
    }
    static String reverString(String s){
        String r = " ";
        for(int i=s.length();i>0;--i){
            r += s.charAt(i-1);
        }
        return r;
    }
}
