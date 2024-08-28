package dev.shez;

public class SingletonTesting {
    // Mark this variable as 'volatile', meaning it cannot be cached or optimised in any way by the compiler
    // Every read/write of the 'instance' variable must be done directly from the main memory location
    // This is known as creating a 'memory barrier'
    private static volatile SingletonTesting instance;
    private SingletonTesting() {}

    public static SingletonTesting getInstance() {
        // Implement a 'double-checked' lock, by first checking if the instance has already been instantiated - where we can just return it immediately
        SingletonTesting result = instance;
        if(result != null) {
            return result;
        }

        // This is the second part of the 'double-check' - we check again whether the instance has been instantiated, as another thread
        // could have instantiated it between the last check and this current line.
        synchronized (SingletonTesting.class) {
            if(instance == null) {
                instance = new SingletonTesting();
            }

            return instance;
        }
    }

    public String doSomething(int i) {
        return "Hello " + i;
    }
}

class Driver {
    public static void main(String[] args) {
        System.out.println(SingletonTesting.getInstance().doSomething(9));
    }
}
