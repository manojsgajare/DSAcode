package DSAExamples;

import java.util.Collections;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(); //Declaring list and data type
        items.add  ("Shoes");
        items.add  ("Toys");

        Collections.addAll(items, "Fruits", "Bat", "Ball");

        //Printing each element

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + " ");

        }
    }
}
