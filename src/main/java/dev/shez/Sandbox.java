package dev.shez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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