package com.learning.tuto;

import java.util.Scanner;

public class StepSeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "The string is a sequence of characters";
        System.out.println("length" + s.length());

        String s1 = "first-";
        String s2 = "second";
        System.out.println(s1.concat(s2));

       /* System.out.println("ingrese una frase");
        String s3 = scanner.nextLine();
        System.out.println("ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("ingrese otro numero");
        int num2 = scanner.nextInt();
        System.out.println("Su frase fu reducida a: " + (s3.substring(num1, num2)));*/

        /*System.out.println("ingrese una palabra");
        String s4 = scanner.nextLine();
        System.out.println("ingrese una letra");
        char c = scanner.next().charAt(0);

        System.out.println("'" + c + "' is Present on '" + s4 + "' ->" + ((s4.indexOf(c) != -1) ? "yes" : "no"));*/

        System.out.println("ingrese una oración");
        String s5 = scanner.nextLine();

        System.out.println("en mayusculas-> " + s5.toUpperCase());
        System.out.println("en minusculas-> " + s5.toLowerCase());
    }
}
