package dev.shez.test;

import dev.shez.linked.*;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedTest {

    private int getUniqueElementCount(LinkedElement head) {
        HashSet<String> data = new HashSet<>();
        LinkedElement curr = head;
        while(curr != null) {
            data.add(curr.getData());
            curr = curr.getNext();
        }

        return data.size();
    }

    @Test
    public void removeDuplicates() {
        LinkedElement head = LinkedExercises.createLinkedList("December", "January", "February", "December", "July");
        head = LinkedExercises.removeDuplicates(head);

        assertEquals("Expected 4 unique elements to be present in the modified linked list",
                4, getUniqueElementCount(head));
    }

    @Test
    public void removeDuplicatesWithoutBuffer() {
        LinkedElement head = LinkedExercises.createLinkedList("December", "January", "February", "December", "July");
        head = LinkedExercises.removeDuplicatesWithoutBuffer(head);

        assertEquals("Expected 4 unique elements to be present in the modified linked list",
                4, getUniqueElementCount(head));
    }

    @Test
    public void removeDuplicatesWithSingleElement() {
        LinkedElement head = new LinkedElement("First and only!");
        head = LinkedExercises.removeDuplicates(head);

        assertEquals("Expected an unchanged element", "First and only!", head.getData());
        assertNull("Expected an unchanged element", head.getPrev());
        assertNull("Expected an unchanged element", head.getNext());
    }

    @Test
    public void removeEntirelyDuplicatedList() {
        LinkedElement head = LinkedExercises.createLinkedList("This is a duplicate", "This is a duplicate");
        head = LinkedExercises.removeDuplicates(head);

        assertEquals("Expected 1 unique element to be present in the modified linked list",
                1, getUniqueElementCount(head));
        assertNull("Expected previous link to be null", head.getPrev());
        assertNull("Expected next link to be null", head.getNext());

    }

    @Test
    public void getSecondToLast() {
        LinkedElement head = LinkedExercises.createLinkedList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        LinkedElement result = LinkedExercises.findNthToLast(2, head);

        assertEquals("Expected 'Saturday' to be the 2nd to last element", "Saturday", result.getData());
    }

    @Test
    public void nthToLastExceedsListSize() {
        LinkedElement head = LinkedExercises.createLinkedList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        LinkedElement result = LinkedExercises.findNthToLast(8, head);

        assertNull("Expected null return as n exceeds list size", result);

    }
}
