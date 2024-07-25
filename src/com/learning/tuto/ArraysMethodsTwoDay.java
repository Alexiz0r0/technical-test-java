package com.learning.tuto;

import java.util.Arrays;
import java.util.Scanner;

import static com.learning.tuto.ArrayMethodsDay.generateSortedArray;

public class ArraysMethodsTwoDay {
    public static void main(String[] args) {

        int[] arr = generateSortedArray(5);
        printArrayWithIndex(arr);

        System.out.println("\nSelecciona un index: ");
        int index1 = scanner.nextInt();
        System.out.println("Selecciona otro index: ");
        int index2 = scanner.nextInt();

        System.out.println("\nNew Arrays by copyOfRange:\n");

        System.out.println("Integer Array: "
                + Arrays.toString(
                Arrays.copyOfRange(arr, index1, index2)));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void printArrayWithIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("index: " + i + " -> " + arr[i] + ", ");
        }
    }
}
