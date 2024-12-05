package org.example.entity;

import org.example.Animal;

public class Cat implements Animal {
    @Override
    public void makeSound() {
       System.out.println("Le chat fait : Miaou !");
    }
}

