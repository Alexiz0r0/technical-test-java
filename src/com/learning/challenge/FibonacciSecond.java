package com.learning.challenge;

import java.util.Scanner;

public class FibonacciSecond {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese un  posicion: ");
        int lastPosition = sc.nextInt();
        int posNow = 0;
        int posAfter = 1;
        int result;

        for (int i = 0; i <= lastPosition; i++) {
            System.out.println(posNow);
            result = posNow + posAfter;
            posNow = posAfter;
            posAfter = result;
        }


    }
}
