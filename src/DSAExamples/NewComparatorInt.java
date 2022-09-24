package DSAExamples;/*
    This class is referred from the DSAExamples.NewComparator1 Java class
 */

import DSAExamples.NewComparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewComparatorInt {
    public static void main(String[] args) {
        List<Integer> NewList = new ArrayList<>();
        NewList.add(10);
        NewList.add(56);
        NewList.add(19);
        NewList.add(89);
        NewList.add(78);

        Collections.sort(NewList, new NewComparator1());
    }
}
