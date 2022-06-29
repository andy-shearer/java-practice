package dev.shez;

import java.util.ArrayList;
import java.util.Arrays;

public class Colours {
    private static ArrayList<String> colours = new ArrayList<>(Arrays.asList(
        "Blue",
        "Green",
        "Red",
        "Purple",
        "Orange",
        "Violet",
        "Magenta",
        "Brown"
    ));

    public static void printColours() {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Purple");
        colours.add("Pink");

        printArrayList(colours);
    }

    public static String getNthItem(int index) {
        return (index >= 0 && index < colours.size()) ? colours.get(index) : "";
    }

    public static void sortList() {
        // Sort the list by the number of letters each item contains (smallest first)
        ArrayList<String> sorted = new ArrayList<>(colours);
        sorted.sort((x, y) -> x.length() - y.length());
        printArrayList(sorted);
    }

    private static void printArrayList(ArrayList<String> list) {
        System.out.println("Here's your list:");
        list.forEach(System.out::println);
    }
}
