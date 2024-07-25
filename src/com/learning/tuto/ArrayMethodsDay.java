package com.learning.tuto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayMethodsDay {

    public static void main(String[] args) {
        searchAnElement(generateSortedArray(10));
        System.out.println("Integer Arrays on comparison: " + compareTwoArrays(generateSortedArray(5), generateSortedArray(5)));
    }

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void searchAnElement(int[] arr) {
        System.out.println("digite un numero: ");
        int num = scanner.nextInt();
        System.out.println(num + " found at index = " + Arrays.binarySearch(arr, num));
}

    public static boolean compareTwoArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static int[] generateSortedArray(int elements) {
        int[] arr = new int[elements];
        generateElements(arr, 100);
        System.out.println("not sort: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted: " + Arrays.toString(arr));
        return arr;
    }

    public static void generateElements(int[] arr, int limite) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomNums(limite);
        }
    }

    public static int generateRandomNums(int limite) {
        return random.nextInt(limite) + 1;
    }
}