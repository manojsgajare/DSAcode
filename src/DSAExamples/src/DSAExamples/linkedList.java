package DSAExamples.src.DSAExamples;//Construct a square matrix using digits of given
//number N based on given pattern

import java.util.ArrayList;
import java.util.Collections;

public class linkedList {

    public static void constructMatrix (int n) {
        ArrayList<Integer> v = new ArrayList<>();
        {
            while (n > 0) {
                v.add(n % 10);
                n = n / 10;
            }
            Collections.reverse(v);
            int N = v.size();
            for (int i = N - 2; i >= 0; i--) {
                v.add(v.get(i));
            }
            int[][] mat = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    mat[i][j] = v.get(i + j);
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
        public static void main(String[] args)
        {
            int n = 3219;
            constructMatrix(n);
        }
    }

