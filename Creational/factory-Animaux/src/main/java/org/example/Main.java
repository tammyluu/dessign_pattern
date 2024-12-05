package org.example;

import org.example.factory.BirdFactory;
import org.example.factory.CatFactory;
import org.example.factory.DogFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory birdFactory = new BirdFactory();

        Animal cat = catFactory.createAnimal();
        Animal dog = dogFactory.createAnimal();
        Animal bird = birdFactory.createAnimal();


        cat.makeSound();
        dog.makeSound();
        bird.makeSound();
    }
}