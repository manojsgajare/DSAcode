package DSAExamples.src.DSAExamples;/*
Copying Elements:
    The copy() method of java.util.Collections class is used to copy
    all the elements from one list into another. After the operation,
    the index of each copied element in the destination list will be
    identical to its index in the source list. The destination list
    must be at list as long as the source list. If it is longer the
    remaining elements in the destination list are unaffected.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CopyingElements {
    public static void main(String[] args) {

        List<String> Destination_code = new ArrayList<>();
        Destination_code.add("Ball");
        Destination_code.add("Bat");
        Destination_code.add("Hockey");
        Destination_code.add("Rummy");

        System.out.println("This is destination code: ");

        for (String value : Destination_code) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        List<String> Source_code = new ArrayList<>();
        Source_code.add("Filder");
        Source_code.add("Pub-g");
        Source_code.add("baller");

        System.out.println("This is source code: ");
        for (String s : Source_code) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        Collections.copy(Destination_code, Source_code);

        System.out.println("The destination code after copy() operation: ");

        for (String s : Destination_code) {
            System.out.print(s + " ");
        }
    }
}
