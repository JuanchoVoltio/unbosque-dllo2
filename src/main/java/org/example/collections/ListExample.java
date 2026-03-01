package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); //Mutable List
        List<String> names = List.of("Nero", "Yuma", "Pompilia", "Martín", "Maya", "Chester", "Pekina", "Pirro"); //Read only

        numbers.add(10);
        numbers.add(-10);

        names.add("Hola"); //It will fail
    }
}
