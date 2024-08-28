package dev.shez;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;
import java.util.List;
import java.util.ArrayList;

public class ConcurrentTaskTester {
    Map<String, Long> accounts = new HashMap<>();
    private long total = 0L;

    public long getTotal() {
        return total;
    }

    public synchronized void deposit(String account, long amount) {
        Long currentBalance = accounts.getOrDefault(account, 0L);
        accounts.put(account, currentBalance + amount);
        total += amount;
    }

    private void stopExecutor(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("termination interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            executor.shutdownNow();
        }
    }

    public static void main(String[] args) {
//        ConcurrentTaskTester tester = new ConcurrentTaskTester();
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        LongStream.range(1,1000).forEach(v -> executor.submit(() -> tester.deposit("acct"+v%10, v)));
//        tester.stopExecutor(executor);
//        System.out.format("Total deposits: %d", tester.getTotal());

        String[] stringArr = {"One", "Two", "Three"};
        List<String> strings;
        //strings = List.of(stringArr);
        strings = Arrays.asList(stringArr);

        strings.forEach(System.out::println);
    }

}
