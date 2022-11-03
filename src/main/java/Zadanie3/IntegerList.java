package Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {
    public List<Integer> integerList = new ArrayList<>();

    public void setIntegerList() {
        this.integerList.add(5);
        this.integerList.add(5);
        this.integerList.add(5);
        this.integerList.add(5);
    }

    @Override
    public String toString() {
//        return "IntegerList{" +
//                "integerList=" + integerList +
//                '}';
        return "[" + "]";
    }

    public double averange() {
       return integerList.stream()
               .mapToInt( i -> i)
               .average()
               .getAsDouble();
    }
}
