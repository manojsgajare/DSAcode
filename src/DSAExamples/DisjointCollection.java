package DSAExamples;/*
operation 5:
    Disjoint DSAExamples.Collection
    java.util.DSAExamples.Collection.disjoint(). is used to check whether two specified
    collections are disjoint or not. More formally, two collections are
    disjoint if they have no elements in common. it returns true if the
    two collections do not have element in common.
 */

import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class DisjointCollection {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Shoes");
        list1.add("Toys");
        list1.add("Horse");
        list1.add("Tiger");

        List<String> list2 = new ArrayList<>();
        list2.add("Bat");
        list2.add("Frog");
        list2.add("Lion");

        System.out.println(Collections.disjoint(list1, list2));
    }
}
