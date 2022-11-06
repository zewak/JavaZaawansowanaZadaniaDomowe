package Zadanie7;

import javax.naming.event.ObjectChangeListener;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Utwórz klasę Employee z polami id, name oraz salary . Utwórz niezbędne metody i
 * konstruktor. Utwórz 3 instancje klasy Employee i dodaj je do listy. Korzystając ze
 * strumieni, znajdź pierwszego pracownika, który nie jest null i ma pensję co najmniej
 * 30000. Jeśli nie zostanie znaleziony, rzuć wyjątek.
 */

public class Zadanie7Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 7");

        Employee employee1 = new Employee(1, "Bolek", 1000);
        Employee employee2 = new Employee(2, "Lolek", 1000);
        Employee employee3 = new Employee(3, "Tola", 1500);

        // System.out.println(employee1);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        System.out.println("Cała lista: ");
        for (Employee e: employeeList) {
            System.out.println(e);
        }

        System.out.println("Szukamy:");
        Employee findEmployee = employeeList.stream()
                .filter(Objects::nonNull)
                .filter(employee -> employee.getSalary() >= 1500)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not found!"));

        System.out.println(findEmployee);

        // Zadanie 8.
        List <Employee> employeesSorted = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        System.out.println("Zadanie 8 - sortowanie po nazwisku /odwrotnie");
        System.out.println(employeesSorted);

        //Zadanie 9

        Integer maxSalary = employeeList.stream()
                //.map(Employee::getSalary)
                .map(e -> e.getSalary())
                .max(Comparator.naturalOrder())
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Zadanie 9 max salary: "+ maxSalary);



    }


}
