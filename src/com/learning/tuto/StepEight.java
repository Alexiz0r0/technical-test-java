package com.learning.tuto;

import java.util.Scanner;

public class StepEight {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        /*System.out.println("ingrese un numero: ");
        int num = scn.nextInt();
        System.out.println("|" + num + "| es " + absCalculator(num));

        System.out.println("ingrese un numero con punto decimal: ");
        double num1 = scn.nextDouble();
        System.out.println("Su valor redondeado de '" + num1 + "' es " + roundCalculator(num1));*/

        System.out.println("numero aleatorio " + randomGenerator(355));

        System.out.println("Ingrese un numero");
        int num = scn.nextInt();

        System.out.println("Ingrese otro numero");
        int num1 = scn.nextInt();

        System.out.println("Resultado: " + powerCalculator(num, num1));

    }

    public static int absCalculator(int num) {
        return Math.abs(num);
    }

    public static double roundCalculator(double num) {
        return Math.round(num);
    }

    public static int randomGenerator(int num) {
        return (int) (Math.floor(Math.random() * num) + 1);
    }

    public static int powerCalculator(int base, int exp) {
        return (int) Math.pow(base, exp);
    }

    public static int randomGenerator(int x, int y) {
        return 0;
    }

}
