package DSAExamples;//Operation 2: Sorting a DSAExamples.Collection
//
//        java.util.Collections.sort()
//        is used to sort the elements present in the specified list of DSAExamples.Collection in ascending order.
//        java.util.Collections.reverseOrder()
//        is used to sort in the descending order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingCollection {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Shoes");
        items.add("Toys");

        Collections.addAll(items,"Fruits", "Bat","Ball");
        Collections.sort(items);

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
        System.out.println();

        Collections.sort(items, Collections.reverseOrder());

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
    }
}
