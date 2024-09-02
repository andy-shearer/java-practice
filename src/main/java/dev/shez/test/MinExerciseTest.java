package dev.shez.test;

import static org.junit.Assert.assertEquals;

import dev.shez.stacks.TrackMinExercise;
import org.junit.Test;

public class MinExerciseTest {
    @Test
    public void testGetMin() {
        TrackMinExercise t = new TrackMinExercise();
        t.push(5);
        t.push(2);
        t.push(8);
        t.push(3);
        t.push(7);

        assertEquals(2, t.getMin());
    }

    @Test
    public void testRepeatedMin() {
        TrackMinExercise t = new TrackMinExercise();
        t.push(5);
        t.push(2);
        t.push(8);
        t.push(2);
        t.push(7);

        assertEquals(2, t.getMin());
    }

    @Test
    public void testUpdatedMin() {
        TrackMinExercise t = new TrackMinExercise();
        t.push(5);
        t.push(4);
        t.push(2);

        assertEquals(2, t.getMin());
        t.push(1);
        assertEquals(1, t.getMin());
    }

    @Test
    public void testDuplicatedMin() {
        TrackMinExercise t = new TrackMinExercise();
        t.push(5);
        t.push(2);
        t.push(2);

        assertEquals(2, t.getMin());
        assertEquals(2, t.pop());
        assertEquals(2, t.getMin());
    }

    @Test
    public void testRemoveAllMins() {
        TrackMinExercise t = new TrackMinExercise();
        t.push(5);
        t.push(2);
        t.push(2);

        assertEquals(2, t.getMin());

        assertEquals(2, t.pop());
        assertEquals(2, t.getMin());

        assertEquals(2, t.pop());
        assertEquals(5, t.getMin());

        assertEquals(5, t.pop());
        assertEquals(-1, t.getMin());
    }
}
