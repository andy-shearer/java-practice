package dev.shez.stacks;

public class SimpleStackExercise {
    private final StackNode[] stacks;

    public SimpleStackExercise(int n) {
        stacks = new StackNode[n];
    }

    public void push(int stackId, double data) {
        StackNode newNode = new StackNode(data, stacks[stackId - 1]);
        stacks[stackId - 1] = newNode;
    }

    public double pop(int stackId) {
        StackNode top = stacks[stackId - 1];
        stacks[stackId - 1] = top.getNext();
        return top.getData();
    }

    protected void printFullStack(int stackId) {
        System.out.printf("Printing contents of stack %d: ", stackId);
        StackNode top = stacks[stackId - 1];

        while (top != null) {
            System.out.printf("[Data: %f, hasNext: %b]", top.getData(), top.getNext() != null);
            top = top.getNext();
        }
        System.out.println();
    }
}
