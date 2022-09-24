package DSAExamples;
/*
Apna collage
Quick Sort code
time complexity O(n^2)
Step 1 - input Array {6,3,9,5,2,8}
 Step 2 - take pivote as last element
 Step 3 - 8 is pivote in our case
        - run the loop
        - read the elements and the smaller elements before the pivote number
        and larger element after the pivote number
  Step 4 - new array {6,3,5,2}  9 - outside
                (works on recursive function)



   */

import java.util.Scanner;

public class QuickSort1 {
    public static int partition(int arr[], int low, int high) {
        int pivote = arr[high];  //Pivote always start with array of index @[high] position
        int i = low - 1;         //Start i with lowest index value

        //run the loop through array and read the element
        //Start loop with low index to high index
        for (int j = low; j < high; j++) {
            if (arr[j] < pivote) {
                i++;

                //swap

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Swap with pivote
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
        public static void quicksort ( int arr[], int low, int high)
        {
            if (low < high) {
                int pivoteindex = partition(arr, low, high);
                quicksort(arr, low, pivoteindex - 1);
                quicksort(arr, pivoteindex + 1, high);
            }
        }
            //array declaration and variable passing

            public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
                //int n = arr.length;
                int n = sc.nextInt();
            int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
//            int arr[] = {6, 3, 9, 5, 2, 8};

            quicksort(arr, 0, n - 1);

            //print sorted array

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }
}


