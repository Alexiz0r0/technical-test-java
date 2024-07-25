package com.learning.challenge;

import java.util.Scanner;

public class FactorialCalculator {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        int result=1;
        int flagItr= 1;
        do {
            result *= flagItr;
            flagItr++;
        } while (flagItr<=num);
        System.out.println(result);
    }
}
