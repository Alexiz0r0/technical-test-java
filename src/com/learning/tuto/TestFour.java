package com.learning.tuto;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.learning.utils.Utils.*;

public class TestFour {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int op = 0;
        int opt = 0;

        System.out.println("** Opt:1 - circulo **");
        System.out.println("** Opt:2 - rectangulo **");

        try {
            op = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("invalid option");
            throw e;
        }

        double res = switch (op) {
            case 1 -> {
                double radio = 0;
                System.out.println("_Ingrese el radio:");
                try {
                    radio = scan.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("invalid option");
                    throw e;
                }
                opt = getOpt();
                yield (opt == 1) ? areaCircle(radio) : perimeterCircle(radio);

            }
            case 2 -> {
                double length = 0;
                double width = 0;

                System.out.println("_Ingrese la altura:");

                try {
                    length = scan.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("invalid option");
                    throw e;
                }
                System.out.println("_Ingrese la base:");
                try {
                    width = scan.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("invalid option");
                    throw e;
                }
                opt = getOpt();
                yield (opt == 1) ? areaRectangle(length, width) : perimeterRectangle(length, width);
            }
            default -> 0;
        };


        System.out.println("-" +
                ((op == 1 && opt == 1) ? "Area del circulo es: " + (res) :
                        (op == 1 && opt == 2) ? "Perimetro del circulo es: " + (res) :
                                (op == 2 && opt == 1) ? "Area del rectangulo es: " + (res) :
                                        (op == 2 && opt == 2) ? "Perimetro del rectangulo es: " + (res) : "--end--"));
    }
}
