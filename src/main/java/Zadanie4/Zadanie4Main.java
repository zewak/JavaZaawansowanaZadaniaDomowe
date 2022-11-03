package Zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Zadanie 4
 * Napisz metodę, która konwertuje wszystkie ciągi z listy na wielkie litery za pomocą strumieni.
 */

public class Zadanie4Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 4 - zamiana wszystkich stringów z listy na Wielkiel litery strumieniami");

        List<String> stringList = new ArrayList<>();
        stringList.add("Koń");
        stringList.add("Krowa");
        stringList.add("Droga na Ostrołękę");
        stringList.add("dajcie tu jakąś muzyczkę");

        List<String> stringUpperList = upperListString(stringList);

        for (String s: stringList) {
            System.out.println(s);
        }
        System.out.println("-toUpperCase---------------------------------------------");

        for (String s: stringUpperList) {
            System.out.println(s);
        }

    }

    public static List<String> upperListString (List <String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }


}
