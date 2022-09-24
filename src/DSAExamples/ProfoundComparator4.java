package DSAExamples;

import java.util.Comparator;

/*

    Profound comparator code 4
     age sorting implemented code
 */
public class ProfoundComparator4 implements Comparator<ProfoundComparator1> {

    @Override
    public int compare(ProfoundComparator1 o1, ProfoundComparator1 o2) {

        if(o1.age == o2.age){
            return  0;
        }
        else if(o1.age >o2.age){
            return  1;
        }
        else
            return -1;
    }
}
