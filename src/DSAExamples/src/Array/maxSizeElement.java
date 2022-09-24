package DSAExamples.src.Array;

public class maxSizeElement {
    public static void main(String[] args) {
        int[] arr=new int[]{10,50,60,30,46,88,60};

        int temp = arr[0];

        for(int i=0; i< arr.length;i++){
            if(arr[i] > temp){
               temp =arr[i];
            }
        }
        System.out.println(temp);
    }
}
