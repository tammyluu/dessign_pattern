package org.example;

public class ClassicHouseBuilder  implements HouseBuilder {
    private House.Builder builder;

    public ClassicHouseBuilder() {
        super();
        this.builder = new House.Builder();
    }

    @Override
    public void buildFloors() {
        builder.setFloors(1);
    }

    @Override
    public void buildRoofType() {
        builder.setRoofType("Gable Roof");
    }

    @Override
    public void buildPool() {
        builder.setHasPool(false);
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
