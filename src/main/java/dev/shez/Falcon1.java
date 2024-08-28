package dev.shez;

public class Falcon1 extends FalconRocket {
    private final int numEngines;

    public Falcon1() {
        super("Merlin 1A");
        numEngines = 1;
    }

    public int getNumEngines() {
        return numEngines;
    }

    @Override
    public String toString() {
        return "Falcon One";
    }
}
