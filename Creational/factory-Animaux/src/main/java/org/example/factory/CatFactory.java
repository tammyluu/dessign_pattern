package org.example.factory;

import org.example.Animal;
import org.example.AnimalFactory;
import org.example.entity.Cat;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
