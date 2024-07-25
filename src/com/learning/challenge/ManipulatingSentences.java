package com.learning.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class ManipulatingSentences {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String sentence = "";
        String[] optArr = new String[]{"Crear oración", "Cantidad de caracteres de la oración", "Cantidad de palabras de la oración", "Mostrar palabras ordenadas alfabéticamente", "Ingresar un número y devolver la palabra correspondiente", "Buscar palabra dentro de la oración", "Modificar palabra dentro de la oración", "Agregar contenido a la oración", "Salir"};
        boolean flag = true;
        String regex = "[,\\.\\s]";
        int opt;
        while (flag) {
            printTitle();
            printOpt(updateOptList(optArr, sentence));
            System.out.print("Seleccione un opcion: ");
            opt = sc.nextInt();
            sc.nextLine();
            if (opt == 1) {
                sentence = updateSentence(sentence);
                System.out.println("|_Out_| " + sentence);
            } else if (opt == 2) {
                System.out.println("|_Out_| " + sentence.length());
            } else if (opt == 3) {
                String[] strings = sentence.split(regex);
                System.out.println("|_Out_| " + strings.length);
            } else if (opt == 4) {
                String[] strings = sentence.split(regex);
                Arrays.sort(strings);
                System.out.println("|_Out_| " + Arrays.toString(strings));
            } else if (opt == 5) {
                String[] strings = sentence.split(regex);
                System.out.print("Ingrese un numero entre 0 y " + strings.length);
                int index = sc.nextInt();
                System.out.println(strings[index]);
                sc.nextLine();
            } else if (opt == 6) {
                boolean match = false;
                String[] strings = sentence.split(regex);
                System.out.print("Ingrese una palabra: ");
                String wrd = sc.nextLine();
                for (int i = 0; i < strings.length; i++) {
                    if (strings[i].equals(wrd)) {
                        match = true;
                        break;
                    }
                }
                System.out.println("|_Out_| " + ((match) ? "yes" : "no"));
                sc.nextLine();
            } else if (opt == 7) {
                System.out.print("Ingrese la palabra a remplazar: ");
                String str = sc.nextLine();
                System.out.print("Ingrese la palabra nueva: ");
                String wrd = sc.nextLine();
                sentence = sentence.replace(str, wrd);
                System.out.println("|_Out_| " + sentence);
                sc.nextLine();
            } else if (opt == 8) {
                System.out.print("Ingrese la palabra nueva: ");
                String wrd = sc.nextLine();
                sentence = sentence + " " + wrd;
                System.out.println("|_Out_| " + sentence);
                sc.nextLine();
            } else {
                System.out.println("*** Eligio la opcion " + opt + ": " + optArr[opt - 1]);
                break;
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


    public static String updateSentence(String sentence) {
        String str = "";
        if (sentence.isEmpty()) {
            System.out.print("Ingrese su oración: ");
            str = sc.nextLine();
        } else {
            str = "";
        }

        return str;
    }

    public static String[] updateOptList(String[] arr, String sentence) {
        if (sentence.isEmpty()) {
            arr[0] = "Crear oración";
        } else {
            arr[0] = "Borrar oración";
        }
        return arr;
    }
}
