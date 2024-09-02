package dev.shez.test;

import dev.shez.stacks.SimpleStackExercise;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SimpleStackTest {
    private final SimpleStackExercise stacks = new SimpleStackExercise(3);
    private static final double DELTA = 1e-15;

    @Test
    public void testPushPopSingleStack() {
        stacks.push(1, 24.13);
        stacks.push(1, 192.1);
        stacks.push(1, 13.62);
        stacks.push(1, 19.35);
        stacks.push(1, 58.12);

        assertEquals(58.12, stacks.pop(1), DELTA);
    }

    @Test
    public void testPushPopMultipleStacks() {
        stacks.push(1, 24.13);
        stacks.push(1, 192.1);
        stacks.push(1, 13.62);

        stacks.push(2, 93.11);
        stacks.push(2, 42.12);
        stacks.push(2, 5.94);

        assertEquals(13.62, stacks.pop(1), DELTA);
        assertEquals(5.94, stacks.pop(2), DELTA);
    }
}
