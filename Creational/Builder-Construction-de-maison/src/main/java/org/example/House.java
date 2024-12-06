package org.example;

public class House {
    private int floors;
    private String roofType;
    private boolean hasPool;
    private boolean hasGarage;

    // Constructeur privé pour empêcher l'instanciation directe
    private House(int floors, String roofType, boolean hasPool, boolean hasGarage) {
        this.floors = floors;
        this.roofType = roofType;
        this.hasPool = hasPool;
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", roofType='" + roofType + '\'' +
                ", hasPool=" + hasPool +
                ", hasGarage=" + hasGarage +
                '}';
    }

    // Builder interne pour le produit final
    public static class Builder {
        private int floors;
        private String roofType;
        private boolean hasPool;
        private boolean hasGarage;

        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public Builder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(floors, roofType, hasPool, hasGarage);
        }
    }
}




