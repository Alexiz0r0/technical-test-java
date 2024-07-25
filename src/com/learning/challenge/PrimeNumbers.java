package com.learning.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de numeros primos: ");
        int qty = sc.nextInt();
        int numItr = 1;
        int numIndex = 0;
        int[] arrPrime = new int[qty];
        do {
            int counter = 0;
            for (int j = 1; j <= numItr / 2; j++) {
                if (numItr % j == 0) {
                    counter += 2;
                }
                if (counter > 2) {
                    break;
                }
                ;
            }
            if (counter == 2) {
                arrPrime[numIndex] = numItr;
                numIndex++;
            }
            numItr += 1;
        } while (numIndex != qty);

        System.out.println(Arrays.toString(arrPrime));

    }
}
