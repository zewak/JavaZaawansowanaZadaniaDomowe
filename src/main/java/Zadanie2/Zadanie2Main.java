package Zadanie2;

import java.sql.Array;
import java.util.Scanner;

/**
 * Napisz program, który odbiera rozmiar tablicy (n) od użytkownika (System.in). Następnie
 * odbierz n liczb od użytkownika i umieść je w tablicy. Zaimplementuj algorytm
 * sortowania bąbelkowego, aby posortować tę tablicę w porządku rosnącym.
 */

public class Zadanie2Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 2 - Tablica i sortowanie bąbelkowe");
        System.out.print("Podaj rozmiar tablicy: ");
        Scanner inputScaner = new Scanner(System.in);
        int sizeArray = inputScaner.nextInt();
        int intArray[] = new int[sizeArray];
        System.out.println("Podaj " + sizeArray + " elementów tablicy typu int:");
        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Podaj wartość elementu " + (i + 1) + ": ");
            intArray[i] = inputScaner.nextInt();
        }

        System.out.println("Bez sortowania:");
        System.out.print("[");
        for (int i = 0; i < intArray.length; i++) {
            //    System.out.println("Wartość elementu" + (i+1)  + ": to: " + intArray[i]);

            if (i < (intArray.length - 1))
                System.out.print(intArray[i] + ", ");
            else System.out.print(intArray[i]);
        }
        System.out.println("]");


    }


}
