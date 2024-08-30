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
                prev.setNext(curr.getNext());
            } else {
                tracker.add(curr.getData());
            }

            curr = curr.getNext();
        }

        return head;
    }
}
