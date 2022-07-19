package dev.shez.accessor;

import dev.shez.MergeSort;
import dev.shez.Quicksort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //int[] arr = {75, 26, 15, 67, 85, 54, 31, 49, 63};
        int[] arr = {63, 21, 37, 71, -3, 0};
        //int[] arr = {12};
        //int[] arr = {};

        //Quicksort qs = new Quicksort();
        //System.out.println(Arrays.toString(qs.sort(arr, 0, arr.length - 1)));

        MergeSort ms = new MergeSort();
        System.out.println(Arrays.toString(ms.mergeSort(arr)));
    }
}
