package DSAExamples;/*
Operation 3: Searching in a DSAExamples.Collection

java.util.Collections.binarySearch()
   method returns the position of an object in a sorted list.
    To use this method, the list should be sorted in ascending order,
     otherwise, the result returned from the method will be wrong.
      If the element exists in the list, the method will return the
      position of the element in the sorted list,
       otherwise, the result returned by the method would be the –
        (insertion point where the element should have been present if exist)-1).

Example
 */

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchingInCollection {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Football");
        items.add("Volleyball");
        items.add("Cricket");
        items.add("Chess");
        items.add("Golf");
        items.add("Kabbadi");

        Collections.sort(items);

        System.out.println("The index of Cricket is: " + Collections.binarySearch(items,"Cricket"));

        System.out.println("The index of Dog is: " + Collections.binarySearch(items, "Dog"));
    }
}
