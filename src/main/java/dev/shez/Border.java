package dev.shez;

public class Border implements DogInterface, FoliageInterface{
    public String getBreed() {
        return "Border Terrier";
    }

    public FoliageType getFoliageType() {
        return FoliageType.HEDGE;
    }

    /**
     * This getBark function must be overridden, as it is the default method of each unrelated interface
     * that this class implements.
     */
    @Override
    public String getBark() {
        return DogInterface.super.getBark();
    }
}
