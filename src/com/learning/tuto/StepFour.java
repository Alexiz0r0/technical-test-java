package com.learning.tuto;

import java.util.Scanner;

import static com.learning.utils.Utils.calculateDiscount;

public class StepFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0;

        /*System.out.println("Ingrese un numero: ");
        num1 = scan.nextInt();*/

        /*if (num1>0) {
            System.out.println("El numero es mayor a cero (positivo)");
        } else if (num1<0) {
            System.out.println("El numero es menor a cero (negativo)");
        } else {
            System.out.println("El numero es cero ");
        }*/

        /*if (num1 >= 90 && num1 <= 100) {
            System.out.println("** A **");
        } else if (num1 >= 80 && num1 <= 89) {
            System.out.println("** B **");
        } else if (num1 >= 70 && num1 <= 79) {
            System.out.println("** C **");
        } else if (num1 >= 60 && num1 <= 69) {
            System.out.println("** D **");
        } else if (num1 >= 0 && num1 <= 59) {
            System.out.println("** F **");
        } else {
            System.out.println("'" + num1 + "' No se encuentra dentro del rango");
        }*/


        /*if ((num1 % 5 == 0) && (num1 % 3 == 0)) {
            System.out.println("'" + num1 + "' es divisible por 5 y 3");
        } else if (num1 % 3 == 0) {
            System.out.println("'" + num1 + "' es divisible por 3");
        } else if (num1 % 5 == 0) {
            System.out.println("'" + num1 + "' es divisible por 5");
        } else {
            System.out.println("'" + num1 + "' NO es divisible por 5 y 3");
        }*/

        String pwd1 = "123asd";
        String pwd2;
        System.out.println("Ingrese su contraseña");
        pwd2 = scan.next();

        if (pwd1.equals(pwd2)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        /*System.out.println("Ingrese el precio del producto: ");
        int price = scan.nextInt();
        double total = 0;

        if (price >= 100) {
            total = price - (price * 0.1);
            *//*total = calculateDiscount(price, 10);*//*
        } else {
            total = price;
        }

        System.out.println("El total es: '" + total + "'");
*/
        /*System.out.println("Ingrese su edad: ");
        int age = scan.nextInt();

        if (age >= 0 && age < 18) {
            System.out.println("Es menor de edad");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Eres adulto");
        } else if (age >= 65) {
            System.out.println("Eres un adulto mayor");
        } else {
            System.out.println("No se encuentra en la categoria");
        }*/

        /*int out = "b".compareTo("a");
        System.out.println("'" + out + "'");*/
    }


}
