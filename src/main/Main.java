package main;

import main.matrix.MatrixGeneral;



public class Main {
    public static void main(String[] args) {
        //for testing
        int[] nums = new int[]{1, 2, 3, 4, 5, 5, 7, 9, 2, 1, 10, 9, 6, 8, 7, 6, 3, 6, 6, 6, 99, 100, -2, 3, 1};
        MatrixGeneral matrixGeneral = new MatrixGeneral(5, 5, nums);
        System.out.println(matrixGeneral.findMinimum());
        matrixGeneral.printMatrix();
        matrixGeneral.printMatrixName();
    }
}