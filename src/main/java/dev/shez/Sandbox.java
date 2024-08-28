package dev.shez;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sandbox {

    public void testArrays() {
        double[] decimals = new double[9];
        double[] copy = Arrays.copyOfRange(decimals, 3,5);
    }

    public void testPCBuild() {
        MyBuild myBuild = new MyBuild();
        String chipset = MyBuild.AMD_CHIPSET;
    }

    public void testHashgraphs() {
        List<int[][]> visitedPoints = new ArrayList<>();
    }

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> rivers = new ArrayList<>();

        int width = matrix[0].length;
        int height = matrix.length;

        boolean[][] visited = new boolean[width][height];

        for(int xIndex = 0; xIndex < width; xIndex++) {
            for(int yIndex = 0; yIndex < height; yIndex++) {

                if(shouldVisit(xIndex, yIndex, matrix, visited)) {
                    int x = xIndex, y = yIndex, riverSize = 0;
                    do {
                        visited[x][y] = true;
                        riverSize++;

                        if(y+1 < width && shouldVisit(x, y+1, matrix, visited)) {
                            y += 1;
                        } else if(y-1 > 0 && shouldVisit(x, y-1, matrix, visited)) {
                            y -= 1;
                        } else if(x+1 < height && shouldVisit(x+1, y, matrix, visited)) {
                            x += 1;
                        } else {
                            x = -1;
                        }
                    } while(x >= 0);

                    rivers.add(riverSize);
                }

            }
        }

        return rivers;
    }

    private static boolean shouldVisit(int x, int y, int[][] arr, boolean[][] visited) {
        return (arr[x][y] == 1 && !visited[x][y]);
    }

    @Author("Andy")
    public void testMyNewAnnotation() {
        System.out.println("Did it work?");
    }

    /**
     * Split a string that is delimited with underscores and dashes into camel case, preserving the case of the start of
     * the provided string.
     * @param s word to turn to camel case
     * @return {@link String} in camel case
     */
    public static String toCamelCase(String s) {
        String[] words = s.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                    .map(w -> w.substring(0,1).toUpperCase() + w.substring(1))
                    .reduce(words[0], String::concat);
    }

    public <T extends FalconRocket & Serializable, G> List<G> falconsToList(T[] arr, Function<T, G> mapperFunc) {
        return Arrays.stream(arr).map(mapperFunc).collect(Collectors.toList());
    }

    public double sumNumbers (List<? extends Number> items) {
        double result = 0.0;
        for(Number item : items) {
            result += item.doubleValue();
        }
        return result;
    }
    
    public static <T extends Comparable<T>> boolean checkMatchingOrder(List<T> list1, List<T> list2) {
        if(list1.size() != list2.size()) {
            return false;
        }

        for(int i = 0; i < list1.size(); i++ ) {
            if(list1.get(i).compareTo(list2.get(i)) != 0) {
                return false;
            }
        }

        return true;
    }

    public static void printAllEntries(Map<?, ?> map) {
        map.forEach((a, b) -> System.out.println(a + ", " + b));
    }
}

class MyBuild implements ComputerSpec {

    @Override
    public int getRamSize() {
        return 16;
    }

    @Override
    public int getCPUClockRate() {
        return 4;
    }

    @Override
    public String getCaseManufacturer() {
        return "Corsair";
    }

}