package com.learning.challenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PwdGenerator {
    public static void main(String[] args) {

        System.out.println("Ingrese la longitud de la contraseña: ");
        int length = sc.nextInt();
        char[] pwdArr = checkCharactersArray(length);
        System.out.println(Arrays.toString(pwdArr));
    }

    private static final Scanner sc = new Scanner(System.in);

    public static final Random rand = new Random();

    public static char[] checkCharactersArray(int length) {
        boolean hasUpperCase = true;
        boolean hasLowerCase = true;
        boolean hasDigit = true;
        char[] pwdArr = generateCharactersArray(length);
        while (true) {

            for (char c : pwdArr) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = false;
                }
                if (Character.isLowerCase(c)) {
                    hasLowerCase = false;
                }
                if (Character.isDigit(c)) {
                    hasDigit = false;
                }
            }

            if (!hasUpperCase && !hasLowerCase && !hasDigit) {
                break;
            }

            pwdArr = generateCharactersArray(length);
        }
        return pwdArr;
    }

    public static char[] generateCharactersArray(int length) {
        char[] pwdArr = new char[length];

        for (int i = 0; i < pwdArr.length; i++) {
            pwdArr[i] = generateCheckCharacterValue();
        }

        return pwdArr;
    }

    public static char generateCheckCharacterValue() {
        boolean flag = true;
        char value;
        do {
            value = generateRandomChar();
            if (checkValue(value)) {
                flag = false;
            }
        } while (flag);
        return value;
    }

    public static boolean checkValue(char value) {
        return Character.isUpperCase(value) || Character.isLowerCase(value) || Character.isDigit(value);
    }

    public static char generateRandomChar() {
        int max = 122, min = 48;
        return (char) (rand.nextInt(max - min + 1) + min);
    }

}
