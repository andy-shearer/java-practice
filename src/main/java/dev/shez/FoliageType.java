package dev.shez;

public enum FoliageType {
    TREE("Tree"),
    HEDGE("Hedge"),
    SHRUB("Shrub"),
    FLOWER("Flower");

    private final String type;

    FoliageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
