package com.learning.tuto;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoopDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randInt = rand.nextInt(20) + 1;
        System.out.println(randInt);
        int guess;
        do {
            System.out.println("Ingrese un numero entre 1 y 20");
            guess = scanner.nextInt();
            if (guess > randInt) {
                System.out.println("<<< Número ingresado es mayor que el número aleatorio");
            } else if (guess < randInt) {
                System.out.println("<<< Número ingresado es menor que el número aleatorio");
            }

        } while (randInt != guess);
    }
}
