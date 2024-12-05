package org.example.factory;

import org.example.Animal;
import org.example.AnimalFactory;
import org.example.entity.Bird;

public class BirdFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Bird();
    }
}
