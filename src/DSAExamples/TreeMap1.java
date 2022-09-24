package DSAExamples;/*
    Tree Map DSA
 */

import java.util.TreeMap;

public class TreeMap1{
    public static void main(String[] args) {
        TreeMap<String,Integer> tm1 = new TreeMap<>();

        tm1.put("First" , 1);
        tm1.put("Second", 2);
        tm1.put("Third", 3);
        tm1.put("Fourth", 4);
        tm1.put("Fifth", 5);

        System.out.println("Treemap: "+ tm1);
        System.out.println();

        System.out.println("Values are: " + tm1.values());
        System.out.println();

       System.out.println("Entry set are: " + tm1.entrySet());
        System.out.println();

        System.out.println("Removed element is: "+ tm1.remove("Fourth",5));
        System.out.println();

        System.out.println(tm1);

        for (String key: tm1.keySet()) {
           System.out.println(key);
       }
    }
}
