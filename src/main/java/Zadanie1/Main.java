package Zadanie1;

import java.util.Scanner;

/**
 * Zadanie 1
 * Odwróć liczbę za pomocą pętli while.
 * Program poprosi użytkownika o wprowadzenie numeru, a następnie odwróci liczbę za pomocą pętli while
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 - odwracanie cyfr w liczbie");
        System.out.print("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int result = 0;
        result = getReversetMumber(inputNumber, result);
        System.out.println("cyfry w odwrotnej kolejności: " + result);
    }

    private static int getReversetMumber(int inputNumber, int result) {
        while (inputNumber > 0) {
            result = result * 10 + inputNumber % 10;
            inputNumber /= 10;
        }
        return result;
    }
}