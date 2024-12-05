package org.example.entity;

import org.example.Animal;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Le chien fait : Wouf !");
    }
}
