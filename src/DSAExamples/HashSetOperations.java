package DSAExamples;/*
    Operations on set
    Union - .addAll();
    Intersection - .retainAll();
    Difference - .removeAll();
 */
import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {
        Set<Integer> one = new HashSet<Integer>();
        one.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));

        Set<Integer> two = new HashSet<Integer>();
        two.addAll(Arrays.asList(new Integer[] {1,2,0,8,9,3}));

        Set<Integer> Union = new HashSet<>(one);
        Union.addAll(two);
        System.out.println(Union);

        Set<Integer> Intr = new HashSet<>(one);
        Intr.retainAll(two);
        System.out.println(Intr);

        Set<Integer> Diff = new HashSet<>(one);
        Diff.removeAll(two);
        System.out.println(Diff);

        for (Integer i: one) {
            System.out.println(i);

        }
    }
}
