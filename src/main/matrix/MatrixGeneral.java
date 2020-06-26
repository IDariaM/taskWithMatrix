package main.matrix;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatrixGeneral implements MatrixInterface {
    String matrixName;
    int[][] matrix;

    public MatrixGeneral(int i, int j, int[] nums) {
        matrixName = "matrix" + System.currentTimeMillis();
        int[][] temp = new int[i][j];
        int quantity = 0;

        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                temp[a][b] = nums[quantity];
                quantity++;
            }
        }

        matrix = temp;
    }

    @Override
    public int findMinimum() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int a = 0; a < matrix.length; ) {
            for (int b = matrix[a].length - 1; b > -1; ) {
                list.add(matrix[a][b]);
                a++;
                b--;
            }
        }
        Collections.sort(list);
        return list.get(0);
    }

    @Override
    public void printMatrix() {
        System.out.println(Arrays.deepToString(matrix));

    }

    @Override
    public void printMatrixName() {
        System.out.println(matrixName);

    }
}
