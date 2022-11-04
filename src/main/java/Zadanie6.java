import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
