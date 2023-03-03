package dev.shez;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class TodayICoded {
    Date today;
    String description;

    public TodayICoded() {
        today = new Date();
        description = getDescription();
        writeOut();
    }

    private String getDescription() {
        Scanner input = new Scanner(System.in);
        System.out.print("What did you code today?\n> ");
        return input.nextLine();
    }

    private void writeOut() {
        File file = new File("progress.txt");
        try {
            if(file.exists() || file.createNewFile()) {
                FileWriter writer = new FileWriter(file, true);
                writer.write(String.format("%s - \"%s\"\n", today, description));
                writer.flush();
                System.out.println("Successfully recorded progress.");
            } else {
                System.out.println("Failed to write progress to disk.");
            }
        } catch (IOException e) {
            System.out.printf("Failed to write progress to file with path %s", file.getPath());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TodayICoded();
    }
}
