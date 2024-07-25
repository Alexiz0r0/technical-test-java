package com.learning.tuto;

import java.util.Scanner;

public class TestSeven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /*System.out.println("ingrese una frase");
        String s1 = sc.nextLine();

        System.out.println("ingrese una letra");
        char s2 = sc.nextLine().charAt(0);

        System.out.println("ingrese otra letra");
        char s3 = sc.nextLine().charAt(0);

        System.out.println("Remplazando... \n" + s1.replace(s2, s3));*/


        /*System.out.println("Ingrese una frase con espacios al incio y final:");
        String s1 = sc.nextLine();

        System.out.println("Eliminando espacios \n" + s1.trim());*/

        /*System.out.println("Ingrese una palabra");
        String s1 = sc.nextLine();

        System.out.println("Ingrese otra palabra");
        String s2 = sc.nextLine();

        System.out.println("'" + s1 + "' y '" + s2 + "' son " + (s1.equals(s2) ? "iguales" : "diferentes"));*/

        System.out.println("Ingrese una palabra");
        String s1 = sc.nextLine();

        System.out.println("'" + s1 + "' sin espacios tiene una longitud de '" + s1.trim().length());

    }
}
