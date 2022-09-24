package Leetcode;
import java.util.*;
//import java.util.Iterator;
//import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<String> vt = new Vector<String>();
        vt.add("Tom");
        vt.add("Jerry");
        vt.add("capton");
        vt.add("panthor");
        vt.add("thor");

        Iterator<String> itr = vt.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
