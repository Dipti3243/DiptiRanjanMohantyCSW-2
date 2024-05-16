package Assignment6_Files;

import java.io.File;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file to be deleted: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("An error occurred while deleting the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

}
