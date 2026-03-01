package org.example.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(); //Mutable Set
        Set<String> names = Set.of("Nero", "Yuma", "Pompilia", "Martín", "Maya", "Chester", "Pekina", "Pirro"); //Read only

        numbers.add(10);
        numbers.add(-10);

        names.add("Hola"); //It will fail
    }
}
