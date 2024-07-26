package com.learning.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class StudentRegister {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int capacity = 10;
        int count = 0;
        String[] names = new String[capacity];
        Double[] score = new Double[capacity];
        String[] optArr = new String[]{"Registrar alumno", "Mostrar todos los alumnos", "Mostrar promedio de notas", "Buscar alumno por nombre", "Modificar nota por nombre", "Eliminar alumno por nombre", "Salir"};
        boolean flag = false;
        int opt;
        while (!flag) {
            printTitle();
            printOpt(optArr);
            System.out.print("Seleccione un opcion: ");
            opt = sc.nextInt();
            sc.nextLine();
            if (opt == 1) {
                System.out.print("Ingrese el nombre: ");
                names[count] = sc.nextLine();
                System.out.print("Ingres la nota: ");
                score[count] = sc.nextDouble();
                count++;
                sc.nextLine();
            } else if (opt == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println(" - " + names[i] + " - " + score[i]);
                }
            } else if (opt == 3) {
                double total = 0;
                for (int i = 0; i < count; i++) {
                    total += score[i];
                }
                System.out.println("- Promedio: " + total / count);
            } else if (opt == 4) {
                int index = count + 1;
                System.out.print("Ingrese el nombre: ");
                String studentName = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (names[i].equals(studentName)) {
                        index = i;
                        break;
                    }
                }
                System.out.println(index <= count ? ("- Name: " + names[index] + " Score: " + score[index]) : ("-No data-"));
            } else if (opt == 5) {
                int index = count + 1;
                System.out.print("Ingrese el nombre: ");
                String studentName = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (names[i].equals(studentName)) {
                        index = i;
                        break;
                    }
                }
                if (index <= count) {
                    System.out.print("Ingres la nota: ");
                    score[index] = sc.nextDouble();
                }
                System.out.println(Arrays.toString(names));
                System.out.println(Arrays.toString(score));
            } else if (opt == 6) {
                int index = -1;
                System.out.print("Ingrese el nombre: ");
                String studentName = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (names[i].equals(studentName)) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    for (int i = index; i < count - 1; i++) {
                        names[i] = names[i + 1];
                        score[i] = score[i + 1];
                    }
                    names[count - 1] = null;
                    score[count - 1] = null;
                    count--;
                    System.out.println(Arrays.toString(names));
                    System.out.println(Arrays.toString(score));
                } else {
                    System.out.println("no data");
                }

            } else {
                flag = true;
            }
        }
    }

    public static void printTitle() {
        String[] titleArr = new String[]{"................", ".  . .-. . . . .", "|\\/| |-  |\\| | |", "'  ` `-' ' ` `-'", "................"};
        for (String s : titleArr) {
            System.out.println(s);
        }
    }

    public static void printOpt(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(".. " + (i + 1) + ": " + arr[i]);
        }
    }
}
