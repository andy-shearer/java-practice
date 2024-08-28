package dev.shez.accessor;

import dev.shez.Falcon1;
import dev.shez.Falcon9;
import dev.shez.FalconRocket;
import dev.shez.Sandbox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //int[] arr = {75, 26, 15, 67, 85, 54, 31, 49, 63};
        //int[] arr = {63, 21, 37, 71, -3, 0};
        //int[] arr = {12};
        //int[] arr = {};

        //Quicksort qs = new Quicksort();
        //System.out.println(Arrays.toString(qs.sort(arr, 0, arr.length - 1)));

        //MergeSort ms = new MergeSort();
        //System.out.println(Sandbox.toCamelCase("the-Shadow_warrior-LIVES!"));

//        Falcon1 falcon = new Falcon1();
//        System.out.println(String.format("Falcon Rocket Specs:\nFuel Type: %s\nEngine Type: %s\nNumber of Engines: %s",
//                falcon.getFuelType(), falcon.getEngineType(), falcon.getNumEngines()));
//        Integer[] intArr = {1,2,3};
//        String[] stringArr = {"One", "Two", "Three"};
//        FalconRocket[] falcons = {new Falcon1(), new Falcon9()};
//        new Sandbox().falconsToList(falcons, FalconRocket::getEngineType).forEach(System.out::println);

//        Map<String, Integer> balances = new HashMap<>();
//        balances.put("Andy", 183);
//        balances.put("Bob", 53);
//        balances.put("James", 1923);
//        balances.put("Sammy", 491);
//        balances.put("Talia", 13);
//        Sandbox.printAllEntries(balances);

        String s = "∞§ﬁ›ﬂ∞§";
        s = s.toUpperCase();
        for(int i = 0; i < s.length(); i++) {
            // Check for repetition
            int c = s.codePointAt(i);
            System.out.println("Code point at " + i + ": " + c);
            System.out.println("Next index of " + c + ": " + s.indexOf(c, i+1));

            if(s.indexOf(c) == i && s.indexOf(c, i+1) == -1) {
                System.out.println("Answer is " + s.charAt(i));
                System.exit(0);
            }
        }
    }
}
