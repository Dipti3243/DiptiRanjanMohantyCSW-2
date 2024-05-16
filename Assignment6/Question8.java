package Assignment6_Files;

import java.io.File;

public class Question8 {
    public static void main(String[] args) {

        File file = new File("diary.txt");
        File rename = new File("Datadiary2.txt");
        boolean flag = file.renameTo(rename);

        if (flag == true) {
            System.out.println("File Successfully Rename");
        } else {
            System.out.println("Operation Failed");
        }
    }
}
