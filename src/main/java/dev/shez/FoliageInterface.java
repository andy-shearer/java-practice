package dev.shez;

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
