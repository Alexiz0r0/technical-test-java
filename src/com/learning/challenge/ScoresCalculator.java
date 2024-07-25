package com.learning.challenge;

import java.util.Arrays;

import static com.learning.challenge.PwdGenerator.rand;

public class ScoresCalculator {
    public static void main(String[] args) {
        String[] strArr = generateScoresArray(20);
        double[] numsArr = changeStringToDouble(strArr);
        Arrays.sort(numsArr);
        System.out.println(Arrays.toString(numsArr));
        int index = getLowerIndex(numsArr);
        int index2 = getHighIndex(numsArr);
        double[] numsArr1 = Arrays.copyOfRange(numsArr, 0, index + 1);
        double[] numsArr2 = Arrays.copyOfRange(numsArr, index + 1, index2 + 1);
        double[] numsArr3 = Arrays.copyOfRange(numsArr, index2 + 1, numsArr.length);

        System.out.println("::::: * :::::");
        System.out.println("<4: " + Arrays.toString(numsArr1));
        System.out.println(">= 4 & <10: " + Arrays.toString(numsArr2));
        System.out.println(">= 10: " + Arrays.toString(numsArr3));
        System.out.println("::::: * ::::: ");
        System.out.println("Avg: " + calculateAvg(numsArr));
        System.out.println("Avg <4: " + calculateAvg(numsArr1));
        System.out.println("Avg >= 4 & <10: " + calculateAvg(numsArr2));
        System.out.println("Avg >= 10: " + calculateAvg(numsArr3));


    }

    public static double calculateAvg(double[] arr) {
        double sum = 0;
        if (arr.length == 0) return 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static String[] generateScoresArray(int length) {
        String[] scoreArr = new String[length];
        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = String.valueOf(rand.nextInt(11));
        }
        return scoreArr;
    }

    public static double[] changeStringToDouble(String[] strArr) {
        double[] scoreArr = new double[strArr.length];
        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = Double.parseDouble(strArr[i]);
        }
        return scoreArr;
    }

    public static int getLowerIndex(double[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 4) {
                index = i;
            }
        }
        return index;
    }

    public static int getHighIndex(double[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                index = i;
            }
        }
        return index;
    }
}
