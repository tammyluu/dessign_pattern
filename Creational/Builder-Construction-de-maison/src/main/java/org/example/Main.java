package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HouseBuilder modernBuilder = new ModernHouseBuilder();
        Director modernDirector = new Director(modernBuilder);
        House modernHouse = modernDirector.constructHouse();
        System.out.println("Modern House: " + modernHouse);


        HouseBuilder classicBuilder = new ClassicHouseBuilder();
        Director traditionalDirector = new Director(classicBuilder);
        House traditionalHouse = traditionalDirector.constructHouse();
        System.out.println("Traditional House: " + traditionalHouse);
    }



}