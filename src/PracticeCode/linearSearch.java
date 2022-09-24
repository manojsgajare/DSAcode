package PracticeCode;
//Linear Search in Java
public class linearSearch {

    static int calculation(int[]arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,78,60,5,7,4,36,90};
        int key  =20;
        System.out.println(key + " Key is found at index " + calculation(arr, key));
    }
}
