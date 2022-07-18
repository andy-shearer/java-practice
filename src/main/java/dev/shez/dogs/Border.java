package dev.shez.dogs;

import dev.shez.DogInterface;
import dev.shez.FoliageInterface;
import dev.shez.FoliageType;

public class Border implements DogInterface, FoliageInterface {

    private static final String BREED = "Border Terrier";

    public String getBreed() {
        return BREED;
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

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Border borderObj) && // Type-check and cast obj to type 'Border' in one line
                (borderObj.getBreed().matches(BREED));
    }
}
