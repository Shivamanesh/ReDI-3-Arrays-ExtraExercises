package com.company;

public class SquareMatrixCalculations {

    public static void matrixCalculations(int[][] intArray) {
        int leftDiagonalSum = 0;
        int rightDiagonalSUm = 0;
        int j = 0;
        for(int i = 0; i < intArray.length; i++){
            j = i;
            leftDiagonalSum += intArray[i][j];
            rightDiagonalSUm += intArray[i][intArray.length-(i+1)];
        }

        System.out.println("leftDiagonalSum = " + leftDiagonalSum + "\nrightDiagonalSUm = " + rightDiagonalSUm);

    }
}
