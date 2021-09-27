package com.company;

public class BuildSumElement {

    public static int[] buildSum(int[] intArray){
        int[] sumArrayExceptX = new int[intArray.length];
        int sum =  0;
        for(int i = 0; i < intArray.length; i++){
            sum += intArray[i];
        }

        for(int j = 0; j < intArray.length; j++){
            sum -= intArray[j];
            sumArrayExceptX[j] = sum;
            sum += intArray[j];
        }

        return sumArrayExceptX;
    }

}
