package dev.shez;

public class Quicksort {

    public int[] sort(int[] arr, int startIndex, int endIndex) {
        if(startIndex < endIndex) {
            // Choose a pivot point
            int pivotIndex = Math.floorDiv(endIndex - startIndex, 2) + startIndex;
            int pivotValue = arr[pivotIndex];

            // Move pivot value to end of the section we're working on
            arr = swapValues(arr, pivotIndex, endIndex);
            pivotIndex = endIndex;

            // Pick lower and upper indices
            int leftIndex = startIndex;
            int rightIndex = (pivotIndex - 1); // Pivot value is now at the very end of the array

            // Move indices inwards through the array from either end
            while(leftIndex <= rightIndex) {
                int leftIndexVal = arr[leftIndex];
                int rightIndexVal = arr[rightIndex];

                if(leftIndexVal < pivotValue) {
                    leftIndex++;
                }

                if(rightIndexVal > pivotValue) {
                    rightIndex--;
                }

                if(leftIndexVal > pivotValue && rightIndexVal < pivotValue) {
                    arr = swapValues(arr, leftIndex, rightIndex);
                }
            }

            // Indices have crossed
            arr = swapValues(arr, leftIndex, pivotIndex);

            // Recursive call to sort each sub array aside the pivot value
            arr = sort(arr, startIndex, leftIndex - 1);
            arr = sort(arr, leftIndex + 1, endIndex);

            return arr;
        } else {
            return arr;
        }
    }

    public int[] swapValues(int[] arr, int firstIndex, int secondIndex) {
        int firstValue = arr[firstIndex];
        int secondValue = arr[secondIndex];
        arr[firstIndex] = secondValue; // Move second value to first index
        arr[secondIndex] = firstValue; // Move first value to second index

        return arr;
    }
}
