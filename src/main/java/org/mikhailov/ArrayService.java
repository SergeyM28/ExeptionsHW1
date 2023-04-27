package org.mikhailov;

public class ArrayService {
    public int[] subtractArray (int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Массивы имеют разную длину");
        }
        int[] resultArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            resultArray[i] = arr1[i] - arr2[i];
        }
        return resultArray;
    }
    public void printArray(int[]arr){
        for (int elem : arr){
            System.out.print(elem + " ");

        }
        System.out.println("");
    }
}
