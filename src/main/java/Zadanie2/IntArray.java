package Zadanie2;

import java.util.Scanner;

public class IntArray {
    private int intArray[];

    public IntArray(int sizeArray) {
        //this.intArray = intArray;
        this.intArray = new int[sizeArray];
    }

    public void inputIntoIntArray(){
        Scanner inputScaner = new Scanner(System.in);
        System.out.println("Podaj " + intArray.length + " elementów tablicy typu int:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Podaj wartość elementu " + (i + 1) + ": ");
            intArray[i] = inputScaner.nextInt();
        }
    }

    public void printIntArray(){
        System.out.print("[");
        for (int i = 0; i < intArray.length; i++) {
            //    System.out.println("Wartość elementu" + (i+1)  + ": to: " + intArray[i]);

            if (i < (intArray.length - 1))
                System.out.print(intArray[i] + ", ");
            else System.out.print(intArray[i]);
        }
        System.out.println("]");
    }

    public void sortIntArray(){
        System.out.println("Sortowanie bąbelkowe");
        int temp;
        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = 0; j < intArray.length-1; j++) {
                if (intArray[j] > intArray[j+1]) {
                    temp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

}
