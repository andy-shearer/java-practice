package dev.shez.test;

import dev.shez.Sandbox;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SandboxTest {

    @Test
    public void testIntegerListEquality() {
        List<Integer> first = IntStream.range(1, 50).boxed().toList();
        List<Integer> second = IntStream.range(1, 50).boxed().toList();
        assertTrue(Sandbox.checkMatchingOrder(first, second));
    }

    @Test
    public void testIntegerListInequality() {
        List<Integer> first = IntStream.range(1, 50).boxed().toList();
        List<Integer> second = IntStream.range(5, 55).boxed().toList();
        assertFalse(Sandbox.checkMatchingOrder(first, second));
    }

    @Test
    public void testStringListEquality() {
        List<String> first = Arrays.asList("Belgium","Germany", "Hungary", "Spain");
        List<String> second = Arrays.asList("Belgium","Germany", "Hungary", "Spain");
        assertTrue(Sandbox.checkMatchingOrder(first, second));
    }

    @Test
    public void testListOrder() {
        List<String> first = Arrays.asList("Matthew","Mark", "Luke", "John");
        List<String> second = Arrays.asList("Matthew","Mark", "Luke", "John");
        second.sort(String::compareTo);
        assertFalse(Sandbox.checkMatchingOrder(first, second));
    }
}
