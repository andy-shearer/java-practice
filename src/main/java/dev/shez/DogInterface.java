package dev.shez;

public interface DogInterface {
    String getBreed();

    default String getBark() {
        return "Woof";
    }
}
