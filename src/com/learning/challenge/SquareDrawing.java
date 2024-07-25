package com.learning.challenge;

import java.util.Scanner;

public class SquareDrawing {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese la longitud del cuadrado: ");
        int lenght = sc.nextInt();

        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                if (i == 0 || i == lenght - 1 || j == 0 || j == lenght - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        System.out.println("end");

    }
}
