package CodSoft;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text or provide a file to count the words: ");
        String input = scanner.nextLine();

        String text = null;
        try {
            File file = new File(input);
            if (file.exists()) {
                text = new String(Files.readAllBytes(file.toPath()));
            } else {
                text = input;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        String[] words = text.split("\\s+|(?=[.,;:!?])|(?<=[.,;:!?])");
        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        System.out.println("Total count of words: " + wordCount);
    }
}
