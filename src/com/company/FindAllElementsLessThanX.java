package com.company;

public class FindAllElementsLessThanX {

    public static void findElementsLessThanX(int[] intArray, int x){
        System.out.print("{ ");
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] < x){
                System.out.print(intArray[i]);
                if(i >= 0){
                    System.out.print(", ");
                }
            }
        }
        System.out.print(" }");
    }


}
