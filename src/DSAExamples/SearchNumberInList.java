package DSAExamples;/*
    Make a Linked List & add the following elements to it :
     (1, 5, 7, 3 , 8, 2, 3).
      Search for the number 7 & display its index.

 */
import java.util.ArrayList;

public class SearchNumberInList {
    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(5);
        one.add(7);
        one.add(3);
        one.add(8);
        one.add(2);

        System.out.println(one);

        int element =7;
       int ans;
        for (int i = 0; i < one.size() ; i++) {

            //int oneElement = one.getClass(i);

            if(one.get(i) == element);
            {
                 ans = i;
                System.out.println(ans);
                break;
            }
        }
    }
}
