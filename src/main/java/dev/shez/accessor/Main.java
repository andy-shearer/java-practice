package dev.shez.accessor;

import dev.shez.dogs.Border;
import dev.shez.DogInterface;
import dev.shez.dogs.Dachshund;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Border b = new Border();
        System.out.println(b.getBark());

        DogInterface myBorder = b;
        DogInterface myDachshund = new Dachshund();

        List<DogInterface> myDogs = Arrays.asList(myBorder, myDachshund);
        for(DogInterface dog : myDogs) {
            System.out.println(dog.getBreed());
        }
    }
}
