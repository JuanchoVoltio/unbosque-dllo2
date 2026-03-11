package org.example.lambdas.workshop;

import java.util.List;

public class TestAutomaticDialer {
    public static void main(String[] args) {

    }

    public static List<Person> setupPersons(){
        return List.of(
                new Person("Nero", "Neroide", 20, "male", "1234", "nero@mail.com"),
                new Person("Yuma", "Jumanji", 17, "female", "2234", "yuma@mail.com"),
                new Person("Pompilia", "Martínez", 27, "female", "1235", "pompi@mail.com"),
                new Person("Martín", "Martini", 15, "male", "3234", "elloco@mail.com"),
                new Person("Maya", "Bee", 11, "female", "1236", "maya@mail.com"),
                new Person("Chester", "Ton", 82, "male", "1237", "chesterton@mail.com"),
                new Person("Pekina", "Pecosa", 10, "female", "1238", "pekas@mail.com"),
                new Person("Tolo", "Loris", 42, "male", "1239", "elloris@mail.com"),
                new Person("Maruja", "Loris", 35, "female", "1240", "laloris@mail.com")
            );
    }
}
