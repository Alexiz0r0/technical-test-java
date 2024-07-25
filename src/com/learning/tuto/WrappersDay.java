package com.learning.tuto;

import java.util.Scanner;

public class WrappersDay {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        countDigits();
        sumOfTwoNums();
        checkWhitespace();
        checkDouble();
        checkCharacters();
        checkInteger();
    }

    public static void countDigits() {
        System.out.println("digite un numero entero");
        int num = scan.nextInt();
        String str = String.valueOf(num);
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                flag++;
            }
        }
        System.out.println("el numero contiene " + flag + " digitos");
    }

    public static void sumOfTwoNums() {
        System.out.println("digite un numero entero");
        String numInt = scan.nextLine();

        System.out.println("digite un numero decimal");
        String numDouble = scan.nextLine();

        Integer num;
        Double num2;

        try {
            num = Integer.valueOf(numInt);
        } catch (RuntimeException e) {
            System.out.println("Err: '" + numInt + "' no es un numero entero");
            throw e;
        }

        try {
            num2 = Double.valueOf(numDouble);
        } catch (RuntimeException e) {
            System.out.println("Err: '" + numDouble + "' no es un numero decimal");
            throw e;
        }

        System.out.println(num + " + " + num2 + " = " + (num + num2));
    }

    public static void checkWhitespace() {
        System.out.println("ingrese una frase");
        String phrase = scan.nextLine();
        int flag = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isWhitespace(phrase.charAt(i))) {
                flag++;
            }
        }
        System.out.println((flag == 0 ? "la cadena NO espacios en blanco" : ("la cadena contiene " + flag + " espacios en blanco")));
    }

    public static void checkDouble() {
        System.out.println("digite un numero");
        String numStr = scan.nextLine();
        try {
            Double num = Double.valueOf(numStr);
            System.out.println("el numero es: " + num);
        } catch (RuntimeException e) {
            System.out.println("Err: el numero no es valido");
            throw e;
        }
    }

    public static void checkInteger() {
        System.out.println("digite un numero entero");
        String numInt = scan.nextLine();
        try {
            int num = Integer.parseInt(numInt);
            System.out.println("el numero es: " + num);
        } catch (RuntimeException e) {
            System.out.println("Err: no es un numero entero");
            throw e;
        }
    }

    public static void checkCharacters() {
        System.out.println("ingrese una frase");
        String phrase = scan.nextLine();
        boolean flag = false;
        for (int i = 0; i < phrase.length(); i++) {
            if (!Character.isLetter(phrase.charAt(i))) {
                flag = true;
            }
        }

        System.out.println((flag ? "la cadena NO contiene letras" : "la cadena contiene solo letras"));
    }
}
