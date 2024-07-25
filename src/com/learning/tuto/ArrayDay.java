package com.learning.tuto;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDay {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println("Suma: " + (arr[0] + arr[1] + arr[2]));

        Scanner sc = new Scanner(System.in);
        /*int[] arr1 = new int[4];
        System.out.println("ingrese un numero: ");
        arr1[0] = sc.nextInt();
        System.out.println("ingrese un numero: ");
        arr1[1] = sc.nextInt();
        System.out.println("ingrese un numero: ");
        arr1[2] = sc.nextInt();
        System.out.println("ingrese un numero: ");
        arr1[3] = sc.nextInt();

        int sum = arr1[0] + arr1[1] + arr1[2] + arr1[3];
        double avg = (double) sum / arr1.length;
        System.out.println("Suma: " + sum);
        System.out.println("Avg " + avg);*/

        /*int numMx = 0;
        int[] arr2 = new int[5];
        System.out.println("ingrese un numero: ");
        arr2[0] = sc.nextInt();
        numMx = getMax(numMx, arr2[0]);
        System.out.println("ingrese un numero: ");
        arr2[1] = sc.nextInt();
        numMx = getMax(numMx, arr2[1]);
        System.out.println("ingrese un numero: ");
        arr2[2] = sc.nextInt();
        numMx = getMax(numMx, arr2[2]);
        System.out.println("ingrese un numero: ");
        arr2[3] = sc.nextInt();
        numMx = getMax(numMx, arr2[3]);
        System.out.println("ingrese un numero: ");
        arr2[4] = sc.nextInt();
        numMx = getMax(numMx, arr2[4]);

        System.out.println("El numero mayor es: " + numMx);*/

        /*int[] arr3 = new int[]{1, 3, 5};
        System.out.println("ingrese un numero: ");
        int num5 = sc.nextInt();
        int res = Arrays.binarySearch(arr3, num5);
        System.out.println((res < 0) ? "No se encuentra dentro del Array" : (num5 + " se encuentra dentro del array en el index: " + res));*/

        int[] arr4 = new int[]{3, 5, 7};

        System.out.println("Integer Array: " + Arrays.toString(arr4));

        int[] arr5 = Arrays.copyOf(arr4, 5);
        System.out.println("ingrese un numero: ");
        arr5[3] = sc.nextInt();
        System.out.println("ingrese un numero: ");
        arr5[4] = sc.nextInt();

        System.out.println("New Integer Array: " + Arrays.toString(arr5));

    }

    public static int getMax(int numMx, int input) {
        return Math.max(numMx, input);
    }
}
