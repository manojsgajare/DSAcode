package DSAExamples;/*

    Comparator code class 3

    main Sorting code
 */

import java.util.ArrayList;
import java.util.Collections;

public class ProfoundComparator3 {
    public static void main(String[] args) {
        ArrayList<ProfoundComparator1> al = new ArrayList<ProfoundComparator1>();
        al.add(new ProfoundComparator1(1, "Sursha", 18));
        al.add(new ProfoundComparator1(2, "Manoj", 25));
        al.add(new ProfoundComparator1(3, "Yogesh", 24));
        al.add(new ProfoundComparator1(4, "Jon", 48));
        al.add(new ProfoundComparator1(5, "Herald", 10));

        System.out.println("Sorting by Names: ");

        Collections.sort(al, new ProfoundComparator2());

        for (ProfoundComparator1 o1:al) {
            System.out.println("\t" + o1.rollno + "\t" + o1.name + "\t" + o1.age);
        }


        System.out.println("Sorting by Ages: ");

        Collections.sort(al, new ProfoundComparator4());

        for (ProfoundComparator1 o1:al) {
            System.out.println("\t" + o1.rollno + "\t" + o1.name + "\t" + o1.age);
        }

    }
}
