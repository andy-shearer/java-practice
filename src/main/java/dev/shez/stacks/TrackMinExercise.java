package dev.shez.stacks;

/**
 * Achieve O(1) for calls to `push`, `pop`, and `min`.
 * Assumes a set of positive integers stored in the stack.
 */
public class TrackMinExercise {
    private MinNode top = null;
    private int min = -1;

    public void push(int value) {
        MinNode newNode = new MinNode(value, top);
        if(min == -1 || value <= min) {
            newNode.setPrevMin(min);
            min = value;
        }
        top = newNode;
    }

    public int pop() {
        MinNode popped = top;
        if(popped.getData() == min) {
            min = popped.getPrevMin();
        }

        top = popped.getNext();
        return popped.getData();
    }

    public int getMin() {
        return min;
    }
}
