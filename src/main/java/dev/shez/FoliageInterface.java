package dev.shez;

enum FoliageType {
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

public interface FoliageInterface {
    FoliageType getFoliageType();
    default String getBark() {
        if(getFoliageType().equals(FoliageType.TREE)) {
            return "Trunk Bark";
        } else {
            return "No Bark";
        }
    }
}
