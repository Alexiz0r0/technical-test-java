package com.learning.tuto;

import java.util.Scanner;

public class SecondChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su contraseña: ");
        String pwd = sc.nextLine();

        if (pwd.length() >= 8) {
            System.out.println("pipi");
        }

        
    }
}
