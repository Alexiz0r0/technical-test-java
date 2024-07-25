package com.learning.tuto;

import java.util.Scanner;

public class FirstChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        String numStr = sc.nextLine();
        System.out.println("Ingrese una unidad de Medida: Celsius (C) o Fahrenheit (F)");
        char unit = sc.next().charAt(0);
        double num;
        try {
            num = Double.parseDouble(numStr);
            if (unit == 'C' || unit == 'F') {
                System.out.println((unit == 'C') ? (num + " grados Fahrenheit equivale a " + fahrenheitCelsius(num) + " grados Celsius") : (num + " grados Celsius equivale a " + celsiusFahrenheit(num) + " grados Fahrenheit"));

            } else {
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Err: Temperatura no válida. Ingrese una temperatura numérica.");
        }

        sc.close();
    }

    public static double celsiusFahrenheit(double temp) {
        return (temp * 9 / 5) + 32;
    }

    public static double fahrenheitCelsius(double temp) {
        return (temp - 32) * 9 / 5;
    }

}
