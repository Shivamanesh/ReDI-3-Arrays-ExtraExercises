package com.company;

import java.util.List;
import java.util.Scanner;

public class SwapTwoElements {

    public static void swapElements(List<Integer> listInteger){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The original list: " + listInteger);
        System.out.println("Enter the first position you'd like to swap: ");
        int firstPosition = scanner.nextInt();
        int temp = 0;
        while(firstPosition < 0 || firstPosition >= listInteger.size()){
            System.out.println("Invalid Position! Try again..");
            firstPosition  = scanner.nextInt();
        }

        System.out.println("Enter the second position you'd like to swap: ");
        int secondPosition = scanner.nextInt();
        while(secondPosition < 0 || secondPosition >= listInteger.size()){
            System.out.println("Invalid Position! Try again..");
            secondPosition  = scanner.nextInt();
        }
        while(secondPosition == firstPosition){
            System.out.println("Same as first position! Try again..");
            secondPosition  = scanner.nextInt();
        }

        temp = listInteger.get(firstPosition);
        System.out.println(temp);
        listInteger.set(listInteger.get(firstPosition), listInteger.get(secondPosition));
        listInteger.set(listInteger.get(secondPosition), temp);

        System.out.println("The updated list: " + listInteger);

    }

}
