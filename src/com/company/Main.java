package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//    	System.out.println("FindAllElementsLessThanX: ");
//		int[] intArray = {2, -2, -4, -56, 90, 345, 45, 0};
//		int x = 90;
//		FindAllElementsLessThanX.findElementsLessThanX(intArray, x);
//
//
//		System.out.println("\n\nBuild Sum element: ");
//		System.out.println(BuildSumElement.buildSum(intArray));
//		//Why is the output so weird???
//
//
//		System.out.println("\n\nSquare matrix calculations: ");
//		int[][] matrix = {{1,2,3,4}, {2,3,0,5}, {3,-4,5,6}, {4,5,6,0}};
//		SquareMatrixCalculations.matrixCalculations(matrix);


		System.out.println("\n\nSwap two elements: ");
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(0);
		listOfIntegers.add(1);
		listOfIntegers.add(3);
		listOfIntegers.add(6);
		listOfIntegers.add(77);
		SwapTwoElements.swapElements(listOfIntegers);
    }




}
