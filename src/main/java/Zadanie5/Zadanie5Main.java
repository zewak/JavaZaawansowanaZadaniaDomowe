package Zadanie5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Mając listę stringów, napisz metodę, która zwraca listę wszystkich ciągów zaczynających
 * się na literę „a” (małe litery) i zawierających dokładnie 3 litery, użyj strumieni.
 */

public class Zadanie5Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 5 - metoda zwraca podlistę strumienia 'a' ");

        List<String> stringList = new ArrayList<>();
        stringList.add("Koń");
        stringList.add("Krowa");
        stringList.add("Droga na Ostrołękę");
        stringList.add("a dajcie tu jakąś muzyczkę");
        stringList.add("aaa");
        stringList.add("abb");
        stringList.add("baa");
        stringList.add("Aaa");

        for (String s: stringList) {
            System.out.println(s);
        }
        System.out.println("-subString---------------------------------------------");

        List<String> subStringList = subList(stringList);

        for (String s: subStringList) {
            System.out.println(s);
        }
    }

    public static List<String> subList(List <String> list) {
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());

    }
}
