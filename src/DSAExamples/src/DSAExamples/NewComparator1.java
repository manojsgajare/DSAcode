package DSAExamples.src.DSAExamples;

import java.util.Comparator;

/*
Comparator class for refrencing the DSAExamples.NewComparator1.java Class

Its an templet class for Another class

 */
public class NewComparator1 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}