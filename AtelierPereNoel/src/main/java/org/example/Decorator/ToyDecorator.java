package org.example.Decorator;

import org.example.Toy;

public  abstract class ToyDecorator extends Toy {
    protected Toy toy;

    public ToyDecorator(Toy toy) {
        super(toy.getName());
        this.toy = toy;
    }

      @Override
    public void assemble() {
        toy.assemble();

    }

}
