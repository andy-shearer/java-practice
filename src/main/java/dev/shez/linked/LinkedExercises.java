package dev.shez.linked;

import java.util.HashSet;

public class LinkedExercises {
    public static void printLinkedList(LinkedElement head) {
        LinkedElement curr = head;
        while(curr != null) {
            System.out.printf("Element Contents: %s%nHas Next Element: %b%n%n", curr.getData(), curr.hasNext());
            curr = curr.getNext();
        }
    }

    public static LinkedElement createLinkedList(String... data) {
        LinkedElement prev = null;

        for(String s : data) {
            LinkedElement newElement = new LinkedElement(s, prev);
            if(prev != null) {
                prev.setNext(newElement);
            }
            prev = newElement;
        }

        while(prev != null && prev.getPrev() != null) {
            prev = prev.getPrev();
        }

        return prev;
    }

    public static LinkedElement removeDuplicates(LinkedElement head) {
        HashSet<String> tracker = new HashSet<>();
        LinkedElement curr = head;

        while(curr != null) {
            if(tracker.contains(curr.getData())) {
                LinkedElement prev = curr.getPrev();
                prev.setNext(curr.getNext()); // Remove the duplicated item from the link of the 'next' element in the chain
                if(curr.hasNext()) {
                    curr.getNext().setPrev(prev); // Remove the duplicated item from the link of the 'previous' element in the chain
                }
            } else {
                tracker.add(curr.getData());
            }

            curr = curr.getNext();
        }

        return head;
    }

    public static LinkedElement removeDuplicatesWithoutBuffer(LinkedElement head) {
        LinkedElement curr = head;

        while(curr != null) {
            String data = curr.getData();
            LinkedElement prev = curr.getPrev();
            while (prev != null) {
                if(prev.getData().matches(data)) {
                    // Duplicate, remove!
                    curr.getPrev().setNext(curr.getNext());
                    if(curr.hasNext()) {
                        curr.getNext().setPrev(curr.getPrev());
                    }
                    break;
                } else {
                    prev = prev.getPrev();
                }
            }

            curr = curr.getNext();
        }

        return head;
    }

    public static LinkedElement findNthToLast(int n, LinkedElement head) {
        int counter = 1;
        LinkedElement curr = head;
        LinkedElement result = null;

        while(curr.hasNext()) {
            curr = curr.getNext();
            if(++counter == n) {
                result = head;
            } else if(counter > n) {
                result = result != null ? result.getNext() : null;
            }
        }

        return result;
    }
}
