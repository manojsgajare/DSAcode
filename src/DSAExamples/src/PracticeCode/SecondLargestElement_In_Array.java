package DSAExamples.src.PracticeCode;

// IMP
// Code has a incorrect output - 31/07/2022

import java.util.Arrays;

public class SecondLargestElement_In_Array {
   static void PrintSecondLargest(int arr[], int n){

           if (n < 2){
               System.out.println("Invalid Input: ");
           }
       Arrays.sort(arr);
       for (int i = n - 2; i <=0 ; i--) {
            if(arr[i] != arr[n -1]);
           {
               System.out.println("The second largest element: "+ arr[i]);
            return;
           }
       }
       System.out.println("There is no second largest element: ");
    }


    public static void main(String[] args) {
        int arr[] = {10,5,9,7,5,6,3};
        int n = arr.length;
        PrintSecondLargest(arr, n);
    }
}
