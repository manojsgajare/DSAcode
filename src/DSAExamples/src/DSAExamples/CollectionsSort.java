package DSAExamples.src.DSAExamples;/*

    Sorting the string by alphabetical order
    using Collections.sort() in java
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {

        List<String> stringLast = new ArrayList<>();
        stringLast.add("Manoj");
        stringLast.add("Yogesh");
        stringLast.add("Rakshit");
        stringLast.add("Darshan");
        stringLast.add("Point");

        System.out.println("Before sort: " + stringLast);
        System.out.println();

        //by using collections.sort method
        //Collections.sort(stringLast);

        Collections.sort(stringLast);

        System.out.println("Using collections.sort method: "+ stringLast);
        System.out.println();




    }
}
