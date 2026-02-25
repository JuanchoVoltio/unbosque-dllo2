package org.example.abstractclassesandinterfaces;

public class TestAbstractClasses {
    public static void main(String[] args) {
        FlyingObject f = new Airplane();
        FlyingObject f2 = new Bird();
        IAnimal a1 = (IAnimal) f2;
        f2.fly();
        a1.eat();
    }
}
