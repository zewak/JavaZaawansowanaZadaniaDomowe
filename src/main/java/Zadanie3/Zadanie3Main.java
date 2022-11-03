package Zadanie3;

/**
 * Zadanie 3
 * Napisz metodę, która zwraca średnią z listy liczb całkowitych za pomocą strumieni.
 */

public class Zadanie3Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 3 - obliczanie średniej za pomocą strumieni");

        //List<Integer> integerList = new ArrayList<>();

        IntegerList integerList = new IntegerList();

        integerList.setIntegerList();

      //  System.out.println(integerList);
        System.out.println(integerList.averange());
    }
}
