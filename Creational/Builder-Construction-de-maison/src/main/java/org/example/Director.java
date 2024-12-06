package org.example;

public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildFloors();
        houseBuilder.buildRoofType();
        houseBuilder.buildPool();
        houseBuilder.buildGarage();
        return houseBuilder.getHouse();
    }
}
