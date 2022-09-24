package DSAExamples;
/*
    hash Map code
    28/07/2022
 */

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        hm1.put("Procedural language is c", 1);
        hm1.put("Object oriented language is C++", 2);
        hm1.put("Object oriented language JAVA", 3);
        hm1.put("All are programming languages", 4);

        System.out.println("Hash map is: "+ hm1 + "\t" );
        System.out.println();

        System.out.println("Get key value: " + hm1.get(3));
        System.out.println();

        System.out.println("Entry set: " + hm1.entrySet());
        System.out.println();

        for (String key :  hm1.keySet()) {
            System.out.println(key);
        }

    }
}
