package org.example.Decorator;

import org.example.Toy;

public class LuminaireDecorator extends ToyDecorator {


    public LuminaireDecorator(Toy toy) {
        super(toy);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Design luminaire the " + toy.getName() + " toy");
    }
}
