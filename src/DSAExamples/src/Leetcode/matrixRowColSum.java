package DSAExamples.src.Leetcode;

public class matrixRowColSum {
    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;

        //Initialize matrix a
        int a[][]= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Calculate number and rows present in given matrix

        rows =a.length;
        cols =a[0].length;

        // Calculate the sum of each row of given matrix

        for (int i = 0; i < rows; i++) {
            sumRow=0;
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow +  a[i][j];
            }
            System.out.println("Sum of: " + (i+1) + " row " + sumRow);
        }

        // Calculate the sum of each column of given matrix

        for (int i = 0; i < cols; i++) {
            sumCol =0;
            for (int j = 0; j < rows; j++) {
                sumCol = sumCol + a[i][j];
            }
            System.out.println("Sum of: " + (i+1) + " Column " + sumCol);
        }
    }
}
