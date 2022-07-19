package dev.shez;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] arr) {
        if(arr.length <= 1) {
            return arr;
        }

        // Recursively split the array into smaller sub-arrays
        int splitIndex = (arr.length)/2;
        int[] leftArray = Arrays.copyOfRange(arr, 0, splitIndex);
        int[] rightArray = Arrays.copyOfRange(arr, splitIndex, arr.length);

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        return merge(leftArray, rightArray);
    }

    public int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int lPtr = 0, rPtr = 0;
        while(lPtr < left.length && rPtr < right.length) {
            if(left[lPtr] < right[rPtr]) {
                merged[lPtr+rPtr] = left[lPtr];
                lPtr++;
            } else {
                merged[lPtr+rPtr] = right[rPtr];
                rPtr++;
            }
        }

        while(lPtr < left.length) {
            merged[lPtr+rPtr] = left[lPtr];
            lPtr++;
        }

        while(rPtr < right.length) {
            merged[lPtr+rPtr] = right[rPtr];
            rPtr++;
        }

        return merged;
    }
}
