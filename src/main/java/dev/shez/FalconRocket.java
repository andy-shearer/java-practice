package dev.shez;

import java.io.Serializable;

public class FalconRocket implements Serializable {
    private final String engineType;
    private final String fuelType = "Keralox";

    public FalconRocket() {
        engineType = "Merlin 1A";
    }

    public FalconRocket(String _engineType) {
        engineType = _engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
