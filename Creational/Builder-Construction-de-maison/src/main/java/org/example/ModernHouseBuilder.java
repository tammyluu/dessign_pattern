package org.example;

public class ModernHouseBuilder implements HouseBuilder {
    private House.Builder builder;

    public ModernHouseBuilder() {
        this.builder = new House.Builder();
    }

    @Override
    public void buildFloors() {
        builder.setFloors(2);
    }

    @Override
    public void buildRoofType() {
        builder.setRoofType("Flat Roof");
    }

    @Override
    public void buildPool() {
        builder.setHasPool(true);
    }

    @Override
    public void buildGarage() {
        builder.setHasGarage(true);
    }

    @Override
    public House getHouse() {
        return builder.build();
    }
}
