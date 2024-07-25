package com.learning.tuto;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMethodsThreeDay {

    public static void main(String[] args) {
        System.out.println("ingrese el tamaño del Array: ");
        int length = scanner.nextInt();
        System.out.println("ingrese un numero: ");
        int num = scanner.nextInt();

        int[] arr = new int[length];
        Arrays.fill(arr, num);
        System.out.println("Integer Array on filling: " + Arrays.toString(arr));
    }

    private static final Scanner scanner = new Scanner(System.in);
}
