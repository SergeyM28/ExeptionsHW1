package org.mikhailov;

import java.util.Random;

public class ArrayGenerator {
    public int[] generateArray(int size, int maxValue){
        if (size < 0){
            throw new RuntimeException("длинна массива не может быть меньше 0");
        }
        int[] arr = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++){
            arr[i] = rnd.nextInt(maxValue);
        }
        return arr;
    }
}
