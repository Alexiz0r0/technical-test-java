package com.learning.tuto;

import java.util.Scanner;

public class StepThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*int num1 = 0;

        System.out.println("Ingrese un numero: ");

        num1 = scan.nextInt();

        System.out.println("- El numero " + ((num1 % 2 == 0) ? "es par" : "es impar"));*/


        System.out.println("-- Calculetor --");

        int num2 = 0;
        int num3 = 0;
        int ops = 0;

        System.out.println("Ingrese un numero: ");
        num2 = scan.nextInt();

        System.out.println("Ingrese otro numero: ");
        num3 = scan.nextInt();

        System.out.println("* 1 - sumar ");
        System.out.println("* 2 - restar ");
        System.out.println("* 3 - multiplicar ");
        System.out.println("* 4 - dividir ");

        ops = scan.nextInt();

        System.out.println("- El resultado es " +
                ((ops == 1) ? (num2 + num3) : (ops == 2) ? (num2 - num3) : (ops == 3) ? (num2 * num3) : (ops == 4) ? (num2 / num3) : 'F'));


    }


}
