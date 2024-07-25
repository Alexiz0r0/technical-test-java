package com.learning.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utils {

    static private final BufferedReader teclado =
            new BufferedReader(new InputStreamReader(System.in));

    static public String input(String x) {
        print(x);
        try {
            return teclado.readLine();
        } catch (Exception e) {
            throw new Error("Error reading keyboard input");
        }
    }

    static public int inputInt(String x) {
        return Integer.parseInt(input(x));
    }

    static public int inputInt() {
        return inputInt("");
    }

    static public double readDouble(String x) {
        return Double.parseDouble(input(x));
    }

    static public double inputDouble() {
        return readDouble("");
    }

    static public void print(String x) {
        System.out.print(x);
    }

    static public void print(int x) {
        System.out.print(x);
    }

    static public void print(double x) {
        System.out.print(x);
    }

    static public void println(String x) {
        System.out.println(x);
    }

    static public void println(int x) {
        System.out.println(x);
    }

    static public void println(double x) {
        System.out.println(x);
    }

    static public double calculateDiscount(int price, double discount) {
        return price - (price * (discount / 100));
    }

    static public double areaCircle(double radio) {
        return Math.PI * radio * radio;
    }

    static public double areaSquare(double length) {
        return length * length;
    }

    static public double areaTriangle(double length, double width) {
        return length * width / 2;
    }

    static public double perimeterCircle(double radio) {
        return Math.PI * radio * 2;
    }

    static public double areaRectangle(double length, double width) {
        return length * width;
    }

    static public double perimeterRectangle(double length, double width) {
        return 2 * length + 2 * width;
    }

    static public int getOpt() {
        System.out.println("** Opt:1 - area **");
        System.out.println("** Opt:2 - perimetro **");
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();
        return op;
    }
}
