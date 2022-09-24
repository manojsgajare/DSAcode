package DSAExamples;/*

this DSAExamples.NewComparator class is interlinked to Collactions.sort Class
1. create class
2- implements Comparator<Data type *press alt+enter to implement comparator method>
3- the error is gone
4-

 */

import java.util.Comparator;
import java.util.*;




public class NewComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        return o1.compareTo(o2);

        //return o1.compareTo(o2) - return the output in assending sorted manner
        //return o2.compareTo(o1) - return the output in decending sorted manner

    }
}
