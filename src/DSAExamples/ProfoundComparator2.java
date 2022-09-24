package DSAExamples;/*

    comparator 2 code
    .name Implemented for sort
 */


import java.util.Comparator;

public class ProfoundComparator2 implements Comparator <ProfoundComparator1>
{
    @Override
    public int compare(ProfoundComparator1 o1, ProfoundComparator1 o2) {
        return o1.name.compareTo(o2.name);
    }
}
