package Vector;

import java.util.Vector;

public class v1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Tiger");
        v.add("Lion");
        v.add("Leopard");
        v.add("Mouse");

        System.out.println("Elements in vector are: " + v);

        if(v.contains("Tiger")){
            System.out.println("Tiger is present at index: " + v.indexOf("Tiger"));

        }
        else{
            System.out.println("Tiger is not present");
        }
    }
}
