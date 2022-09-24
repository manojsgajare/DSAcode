package PracticeCode;

// Print duplicate occurrences of string in java
// 19/09/2022

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {

    static void dupStr(String str) {
        HashMap<String, Integer> hm = new HashMap<>();

        String[] s = str.split(" ");

        for (String tempString : s) {
            if (hm.get(tempString) != null) {
                hm.put(tempString, hm.get(tempString) + 1);
            } else {
                hm.put(tempString, 1);
            }
        }
        Iterator<String> tempString = hm.keySet().iterator();
        while (tempString.hasNext()){
            String temp = tempString.next();
            if(hm.get(temp) > 1)
            {
                System.out.println("the word " + temp + " appeared " + hm.get(temp) + " times ");
            }
        }
    }

    static void dupChar(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(hm.get(c) != null){
                hm.put(c, hm.get(c) + 1);
            }
            else{
                hm.put(c ,1);
            }
        }
        System.out.println(hm);
    }


    public static void main(String[] args) {
        // Find duplicate occurances of word
        dupStr("I am am  a a learning java java");

        // Find duplicate ocurrence of characters
        dupChar("Javaj2EE");
    }
}
