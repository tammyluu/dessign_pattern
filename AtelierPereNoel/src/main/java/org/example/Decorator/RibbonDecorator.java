package org.example.Decorator;

import org.example.Toy;

public class RibbonDecorator extends ToyDecorator{
    public RibbonDecorator(Toy toy) {
        super(toy);
    }

    @Override
    public void assemble() {
        super.assemble();
    }
}
