package Assignment3_ErrorHandling;

import java.io.*;
import java.io.FileNotFoundException;

public class Q24 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "\"G:\\Java\\CSW-2 Assignments\\Suraj2241019377\\src\\Assignment3_ErrorHandling\\Test.txt\"");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
