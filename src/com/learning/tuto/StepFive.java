package com.learning.tuto;

import java.util.Scanner;

import static com.learning.utils.Utils.*;

public class StepFive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int op = 0;

        /*System.out.println("Ingrese un numero: ");
        op =scan.nextInt();*/

        switch (op) {
            case 1:
                System.out.println("**Lunes**");
                break;
            case 2:
                System.out.println("**Martes**");
                break;
            case 3:
                System.out.println("**Miercoles**");
                break;
            case 4:
                System.out.println("**Jueves**");
                break;
            case 5:
                System.out.println("**Viernes**");
                break;
            case 6:
                System.out.println("**Sabado**");
                break;
            case 7:
                System.out.println("**Domingo**");
                break;
            default:
                System.out.println("**Opt invalid**");
                break;
        }

        switch (op) {
            case 1:
                System.out.println("**_Muy deficiente_**");
                break;
            case 2:
                System.out.println("**_Deficiente_**");
                break;
            case 3:
                System.out.println("**_Suficiente_**");
                break;
            case 4:
                System.out.println("**_Notable_*");
                break;
            case 5:
                System.out.println("**_Sobresaliente_**");
                break;
            default:
                System.out.println("**Opt invalid**");
                break;
        }

        /*System.out.println("** Opt:1 **");
        System.out.println("** Opt:2 **");
        System.out.println("** Opt:3 **");

        System.out.println("Seleccione una Opt: ");
        op =scan.nextInt();*/

        switch (op) {
            case 1 -> System.out.println("_Guardar_");
            case 2 -> System.out.println("_Cargar_");
            case 3 -> System.out.println("_Salir_");
            default -> System.out.println("_Opt invalid_");
        }

        System.out.println("** Opt:1 - circulo **");
        System.out.println("** Opt:2 - cuadrado **");
        System.out.println("** Opt:3 - triangulo **");

        System.out.println("Seleccione una Opt: ");
        op = scan.nextInt();

       double res = switch (op) {
            case 1 -> {
                System.out.println("_Ingrese el radio:");
                double radio = scan.nextDouble();
                yield areaCircle(radio);
            }
            case 2 -> {
                System.out.println("_Ingrese el longitud:");
                double length = scan.nextDouble();
                yield areaSquare(length);
            }
            case 3 -> {
                System.out.println("_Ingrese la altura:");
                double length = scan.nextDouble();
                System.out.println("_Ingrese la base:");
                double width = scan.nextDouble();
                yield areaTriangle(length,width);
            }
            default -> 0;
        };

        System.out.println("Seleccione una Opt: ");

        System.out.println("- Area del " +
                ((op == 1) ? "circulo es: " + (res) : (op == 2) ? "cuadrado es: " + (res) : (op == 3) ? "triangulos es: " + (res) : 'F'));


    }
}
