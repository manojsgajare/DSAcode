package PracticeCode;
// find duplicate key from the string
import java.util.HashMap;
import java.util.Scanner;

public class duplicateCharacter {

    static void dupchar(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(hm.get(c) !=null){
                hm.put(c, hm.get(c)+1);
            }
            else {
                hm.put(c, 1);
            }
        }
        System.out.println(hm);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        dupchar(str);
    }
}
