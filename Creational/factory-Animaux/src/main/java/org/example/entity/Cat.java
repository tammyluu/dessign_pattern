package org.example.entity;

import org.example.Animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
       System.out.println("Le chat fait : Miaou !");
    }
}

