package com.learning.challenge;

import java.util.Scanner;

public class BarGraph {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numsArr = new int[4];
        System.out.println("Ingrese 4 nums entre 1 y 20: ");
        System.out.print("num 1: ");
        numsArr[0] = sc.nextInt();
        System.out.print("num 2: ");
        numsArr[1] = sc.nextInt();
        System.out.print("num 3: ");
        numsArr[2] = sc.nextInt();
        System.out.print("num 4: ");
        numsArr[3] = sc.nextInt();

        for (int i = 0; i < numsArr.length; i++) {
            System.out.println(numsArr[i] + " " + printStars(numsArr[i]));
        }
    }
    public static String printStars(int nums) {
        StringBuilder starsBuilder = new StringBuilder();
        for (int i = 0; i < nums; i++) {
            starsBuilder.append("*");
        }
        return starsBuilder.toString();
    }
}
