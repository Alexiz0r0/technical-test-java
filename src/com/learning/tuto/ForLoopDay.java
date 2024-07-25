package com.learning.tuto;

import java.util.Arrays;


public class ForLoopDay {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, -1};
        printArr(arr);
        System.out.println("min element: " + getMinElement(arr));

        System.out.println(Arrays.toString(invertArr(arr)));
        System.out.println("Suma acumulativa: " + Arrays.toString(accumulatedSum(arr)));

        int[] ranArr = Arrays.copyOf(createRandomArray(5), 5);
        System.out.println("random Array: " + Arrays.toString(ranArr));
        System.out.println("random Array: " + evenCount(ranArr));

        float[] ranFlArr = Arrays.copyOf(createFloatRandomArray(5), 5);
        System.out.println(Arrays.toString(ranFlArr));
        System.out.println("avg: " + avgCalculatorOfArray(ranFlArr));
    }

    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("index '" + i + "' : " + array[i]);
        }
    }

    public static int getMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] invertArr(int[] array) {
        int[] inArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inArr[array.length - (i + 1)] = array[i];
        }
        return inArr;
    }

    public static int[] accumulatedSum(int[] array) {
        int[] newArr = new int[array.length];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num += array[i];
            newArr[i] = num;
        }
        return newArr;
    }

    public static int[] createRandomArray(int length) {
        int[] newArr = new int[length];
        for (int i = 0; i < length; i++) {
            newArr[i] = randomGenerator(100);
        }
        return newArr;
    }

    public static int evenCount(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static float[] createFloatRandomArray(int length) {
        float[] newArr = new float[length];
        for (int i = 0; i < length; i++) {
            newArr[i] = randomFloatGenerator(20);
        }
        return newArr;
    }

    public static float avgCalculatorOfArray(float[] array) {
        return sumOfFloatElements(array) / array.length;
    }

    public static float sumOfFloatElements(float[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float randomFloatGenerator(int num) {
        return (float) (Math.random() * (num + 1));
    }

    public static int randomGenerator(int num) {
        return (int) (Math.floor(Math.random() * num) + 1);
    }
}
