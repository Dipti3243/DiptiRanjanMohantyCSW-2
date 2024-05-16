package Assignment6_Files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your diary entry: ");
        String entry = sc.nextLine();
        try {
            FileWriter fw = new FileWriter("diary.txt", true);
            String date = java.time.LocalDateTime.now().toString();

            fw.write("\n" + date + "\n");
            fw.write(entry);
            fw.close();
            System.out.println("Diary entry written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
