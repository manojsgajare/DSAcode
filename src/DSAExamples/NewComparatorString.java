package DSAExamples;
/*

    This class is used for DSAExamples.NewComparator class

    String Class

 */

import DSAExamples.src.DSAExamples.NewComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewComparatorString {
    public static void main(String[] args) {

        List<String> newString = new ArrayList<>();

        newString.add("Prime");
        newString.add("Void");
        newString.add("Compare");
        newString.add("Search");
        newString.add("String");

        Collections.sort(newString, new NewComparator());
        System.out.println(newString);
    }

}
