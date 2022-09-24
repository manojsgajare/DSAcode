package Recursion;

public class WorkingOfRecursion {
    static void printfun(int test){

        if(test < 1){
            System.out.println("Invalid Input: ");
        }
        else{
            printfun(test-1);
            System.out.printf("%d", test);
        }
        return;
    }

    public static void main(String[] args) {
       int test = 3;
       printfun(test);
    }
}
