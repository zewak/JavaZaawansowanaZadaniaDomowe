import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Napisz metodę, która zwraca łańcuch rozdzielany przecinkami na podstawie podanej
 * listy liczb całkowitych. Każdy element powinien być poprzedzony literą „e”, jeśli liczba
 * jest parzysta, i poprzedzona literą „o”, jeśli liczba jest nieparzysta. Na przykład, jeśli lista
 * danych wejściowych to (3,44), wynikiem powinno być „o3, e44”. Użyj strumieni.
 */

public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println("Zadanie6");
        List<Integer> inputList = new ArrayList<>();
        inputList.add(3);
        inputList.add(44);
        inputList.add(17);

        System.out.print("[");
        int i = 0;
        for (Integer s: inputList) {
            System.out.print(s);
            if (i < inputList.size()- 1)
                System.out.print(", ");
            i++;
        }
        System.out.println("]");
        System.out.println("- substring po przecinkach---------------------------------------------");

        System.out.println(stringList(inputList));

    }

    public static String stringList (List <Integer> list) {
        return list.stream()
                .map( i -> i % 2 == 0 ? "e" + i: "o" + i)
            //    .map( i-> i + ", ")
                .collect(Collectors.joining(", "));


    }
}
