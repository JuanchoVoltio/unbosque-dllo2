package org.example.abstractclassesandinterfaces;

public class Bird extends FlyingObject implements IAnimal{

    @Override
    public void fly() {
        System.out.println("I'm a bird, i'm using my wings to fly");
    }

    @Override
    public void eat() {
        System.out.println("Yum yum, estoy comiendo");
    }
}
