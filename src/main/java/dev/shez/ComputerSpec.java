package dev.shez;

public interface ComputerSpec {
    String INTEL_CHIPSET = "core i9";
    String AMD_CHIPSET = "ryzen";

    int getRamSize();
    int getCPUClockRate();
    String getCaseManufacturer();

    static String getDisplayMechanism() {
        return "Display Port";
    }
}
