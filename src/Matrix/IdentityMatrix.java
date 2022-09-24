package Matrix;

public class IdentityMatrix {
    public static void main(String[] args) {
        int rows, cols;
        boolean flag = true;

        // Initialize matrix a

        int[][] arr = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        // Calculate the number of rows and columns present in the given matrix

        rows = arr.length;
        cols = arr.length;

        // Checks whether given matrix is a aquare matrix or not
        if(rows != cols){
            System.out.println("Matrix should be a square matrix");
        }
        else{
            // Checks if diagonal elements are equal to 1 and rest of elements are zero
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if( i==j && arr[i][j] !=0){
                        flag = false;
                        break;
                    }
                    if( i != j && arr[i][j] !=0){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("Given matrix is an identity matrix: ");
            }
            else{
                System.out.println("Given matrix is not an identity matrix: ");
            }
        }
    }
}
