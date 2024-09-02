package dev.shez.stacks;

public class MinNode {
    private final int data;
    private final MinNode next;
    private int prevMin;


    public MinNode(int data, MinNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public MinNode getNext() {
        return next;
    }

    public void setPrevMin(int min) {
        prevMin = min;
    }

    public int getPrevMin() {
        return prevMin;
    }
}
