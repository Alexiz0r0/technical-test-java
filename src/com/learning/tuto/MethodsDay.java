package com.learning.tuto;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsDay {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runTablaMultiplicar(3);
    }

    public static void runTablaMultiplicar() {
        imprimirTablaMultiplicar(pedirNumero());
    }

    public static void runTablaMultiplicar(int qty) {
        int[] list = new int[qty];

        for (int i = 0; i < list.length; i++) {
            list[i] = pedirNumero();
        }

        System.out.println(Arrays.toString(list));

        printLista(list);
    }

    public static int pedirNumero() {
        System.out.print("Ingrese un numero:");
        return sc.nextInt();
    }

    public static void imprimirTablaMultiplicar(int base) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + i + " * " + base + " = " + (i * base));
        }
    }

    public static void printLista(int[] list) {
        for (int j : list) {
            imprimirTablaMultiplicar(j);
            printLines();
        }
    }

    public static void printLines() {
        String[] titleArr = new String[]{"...............", " "};
        for (String s : titleArr) {
            System.out.println(s);
        }
    }
}
