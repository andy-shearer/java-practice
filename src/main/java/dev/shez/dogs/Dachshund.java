package dev.shez.dogs;

import dev.shez.DogInterface;

public class Dachshund implements DogInterface {

    private static final String BREED = "Dachshund";

    public String getBreed() {
        return BREED;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Dachshund borderObj) && // Type-check and cast obj to type 'Border' in one line
                (borderObj.getBreed().matches(BREED));
    }
}
