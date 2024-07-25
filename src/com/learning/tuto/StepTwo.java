package com.learning.tuto;

import java.util.Scanner;

public class StepTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*String name = "";
        int age = 0;

        System.out.println("Ingrese su nombre: ");
        name = scan.next();

        System.out.println("Ingrese su edad: ");
        age = scan.nextInt();

        System.out.println("Su nombres es "+name+" y su edad es "+age);*/

        /* Operadores aritmeticos */

        /*int num1 = 0;
        int num2 = 0;

        System.out.println("Ingrese un numero: ");
        num1 = scan.nextInt();

        System.out.println("Ingrese otro numero: ");
        num2 = scan.nextInt();

        System.out.println("Suma:" + (num1 + num2));
        System.out.println("Resta:" + (num1 - num2));
        System.out.println("Multiplicacion:" + (num1 * num2));
        System.out.println("Division:" + (num1 / num2));
        System.out.println("Modulo:" + (num1 % num2));

        System.out.println(num1 + " < " + num2 + ": " + (num1 < num2));
        System.out.println(num1 + " > " + num2 + ": " + (num1 > num2));
        System.out.println(num1 + " <= " + num2 + ": " + (num1 <= num2));
        System.out.println(num1 + " >= " + num2 + ": " + (num1 >= num2));
        System.out.println(num1 + " == " + num2 + ": " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + ": " + (num1 != num2));*/

        /* Ejercicios Complementarios */

        int birthdate = 0;
        int now = 2024;

        System.out.println("Ingrese su fecha de nacimiento: ");
        birthdate = scan.nextInt();

        int age = now - birthdate;
        System.out.println("Es mayor de 18: " + ((age > 18) ? "es mayor":"no es mayor"));


        int length = 0;
        int width = 0;

        System.out.println("Ingrese el tamaño de la base: ");
        width = scan.nextInt();

        System.out.println("Ingrese el tamaño de la altura: ");
        length = scan.nextInt();

        System.out.println("Perimetro: " + (2*width + 2*length));
        System.out.println("Area: " + (width*length));
    }
}
