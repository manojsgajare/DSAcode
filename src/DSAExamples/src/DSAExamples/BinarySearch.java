package DSAExamples.src.DSAExamples;/*
    Binary Search:
        Serching element throw the array list / list
        - it gives the key index as output
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> newInt = new ArrayList<>();
       newInt.add(1);
       newInt.add(2);
       newInt.add(3);
       newInt.add(4);
       newInt.add(5);
       newInt.add(6);

       int index = Collections.binarySearch(newInt,6);

        System.out.println(index);
    }
}
