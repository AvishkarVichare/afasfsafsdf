package arrays3;

import java.util.Arrays;

public class TransposeOfMatrix {



    public static void main(String[] args) {
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
        tramatrix(a);

            }
    static void tramatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

}
