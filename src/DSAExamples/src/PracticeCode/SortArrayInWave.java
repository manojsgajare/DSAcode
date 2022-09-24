package DSAExamples.src.PracticeCode;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SortArrayInWave {
    int i;
    void swap(@NotNull int arr[], int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void sortInWave(int arr[], int n){
        Arrays.sort(arr);

        for ( i=0; i<n-1; i++)
        {
            swap(arr, i, i+1);
        }
    }
    public static void main(String[] args)
    {
        SortArrayInWave st = new SortArrayInWave();
        int arr[] = {1,20,3,400,5,60,70};
        int n = arr.length;
        st.sortInWave(arr, n);
        //st.swap(arr, i, i+1);
        for (int i : arr) {
            System.out.println( i + " ");
        }
    }
}
