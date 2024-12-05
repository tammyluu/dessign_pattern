package org.example.factory;

import org.example.Animal;
import org.example.AnimalFactory;
import org.example.entity.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
