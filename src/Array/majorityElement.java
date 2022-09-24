package Array;
// Finding majority of element using hashmap
//22/09/2022
/*
Step 1: Count the frequency of occurrence of the array elements.

Step 2: Store the array element and its occurrence count as the key-value pair in a hash map.

Step 3: Iterate over the hashmap and check if the value of the frequency count of the element is greater than half of the size of the input array or not.

Step 4: Display the output.
 */

import java.util.HashMap;

public class majorityElement {

    public int findMajorEle(int arr[]){
        int size = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=1; i<size; i++){
            if (hm.containsKey(i)){
                int count = hm.get(arr[i] + 1);
                if (count > arr.length/2){
                    return arr[i];
                }
                else {
                    hm.put(arr[i] , count);
                }
            }
            else {
                hm.put(arr[i], 1);
            }
        }
        // Return -1 if majority element not found
        return -1;
    }


    public static void main(String[] args) {

        majorityElement fd = new majorityElement();

        // Example 1: input array first
        int arr[] = {5,1,1,1,1,1,4,9,1,0,1,2};
        int s = arr.length;
        System.out.println("For the input array: ");
        for(int i=0; i<s; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int ans = fd.findMajorEle(arr);
        if(ans!=-1){
            System.out.println("The majority elements is: " + ans);
        }
        else {
            System.out.println("The majority element is not found: ");
        }

        // Example 2: input array 2
        int arr2[] = {47, 8, 1, 6, 3, 6, 90, 52, 78, 47, 47, 47};
        int s2 = arr2.length;
        System.out.println("Second array element is: ");
        for(int i=0; i<s2; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        int ans2 = fd.findMajorEle(arr2);
        if(ans2 !=-1){
            System.out.println("Majority element found at index: " + ans2);
        }
        else{
            System.out.println("Majority element not found: ");
        }
    }
}
