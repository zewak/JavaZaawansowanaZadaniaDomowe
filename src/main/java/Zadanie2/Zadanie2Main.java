package Zadanie2;

import java.util.Scanner;

/**
 * Napisz program, który odbiera rozmiar tablicy (n) od użytkownika (System.in). Następnie
 * odbierz n liczb od użytkownika i umieść je w tablicy. Zaimplementuj algorytm
 * sortowania bąbelkowego, aby posortować tę tablicę w porządku rosnącym.
 */

public class Zadanie2Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 2 - Tablica int i sortowanie bąbelkowe");

        System.out.print("Podaj rozmiar tablicy: ");
        Scanner inputScaner = new Scanner(System.in);
        int sizeArray = inputScaner.nextInt();
        IntArray intArray1 = new IntArray(sizeArray);

        intArray1.inputIntoIntArray();

        System.out.println("Bez sortowania:");
        intArray1.printIntArray();

        intArray1.sortIntArray();

        System.out.println("Po posortowaniu");
        intArray1.printIntArray();


    }


}
