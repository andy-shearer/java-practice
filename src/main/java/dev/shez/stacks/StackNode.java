package dev.shez.stacks;

public class StackNode {
    private final double data;
    private final StackNode next;

    public StackNode(double data, StackNode next) {
        this.data = data;
        this.next = next;
    }

    public double getData() {
        return data;
    }

    public StackNode getNext() {
        return next;
    }

}
