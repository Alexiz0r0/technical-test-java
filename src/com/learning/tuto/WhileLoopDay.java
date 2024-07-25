package com.learning.tuto;

import java.util.Scanner;

public class WhileLoopDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"Comprar producto", "Realizar devolución", "Ver mis pedidos", "Preguntas frecuentes", "Salir"};
        boolean flag = true;
        int opt;
        while (flag) {
            printOpt(arr);
            System.out.println("Seleccione un opcion: ");
            opt = sc.nextInt();
            if (opt == 5) {
                System.out.println("*** Eligio la opcion " + opt + ": " + arr[opt - 1]);
                flag = false;
            } else {
                System.out.println("*** Eligio la opcion " + opt + ": " + arr[opt - 1]);
            }

        }

    }

    public static void printOpt(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("_ " + (i + 1) + ": " + arr[i]);
        }
    }
}
