package org.example;

import org.example.Decorator.LuminaireDecorator;
import org.example.Decorator.RibbonDecorator;
import org.example.factory.ToyFactory;
import org.example.observer.Elf;
import org.example.observer.ElfWorker;

public class SantaWorkShop {
    public static void main(String[] args) {
        EventManager event = new EventManager();
        Elf elf1 = new ElfWorker("Lutin 1");
        Elf elf2 = new ElfWorker("Lutin 2");
        event.subscribe(elf1);
        event.subscribe(elf2);

        Toy doll = ToyFactory.createToy("doll");
        Toy car = ToyFactory.createToy("car");

        Toy decorateDoll = new RibbonDecorator(new LuminaireDecorator(doll));
        Toy decorateCar = new LuminaireDecorator(car);

        event.notifyObservers("'Starting toy product....'");
        decorateDoll.assemble();
        event.notifyObservers("Release ! We have finished assembling a decorated doll.");

        decorateCar.assemble();
        event.notifyObservers("Release ! We have finished assembling a decorated car.");



    }
}