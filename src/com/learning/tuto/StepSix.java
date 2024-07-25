package com.learning.tuto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StepSix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        try {
            System.out.println("** Ingrese un numero **");
            num1 = scan.nextInt();
            System.out.println("** Ingrese otro numero **");
            num2 = scan.nextInt();
            System.out.println("** resultado: " + ((num1 / num2) + 10));

        } catch (InputMismatchException e) {
            /*e.printStackTrace();*/
            System.out.println("Err: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Err: " + e.getMessage());
        }

        /*try {
            System.out.println("** Ingrese un numero **");
            String string = scan.nextLine();
            int num = Integer.parseInt(string);
            System.out.println(" - " + num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Error:" + e.getMessage());
        }*/
    }
}
