package org.example.entity;

import org.example.Animal;


public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("L'oiseau fait : Cui-cui !");
    }
}
