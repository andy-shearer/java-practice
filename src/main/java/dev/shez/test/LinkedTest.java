package dev.shez.test;

import dev.shez.linked.*;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

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
}
