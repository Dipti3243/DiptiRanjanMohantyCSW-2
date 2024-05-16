package Assignment6_Files;

import java.io.File;
import java.util.Stack;

public class Question4 {
    public static void main(String[] args) {
        String mainDir = "G:\\Java\\CSW-2 Assignments\\Suraj2241019377\\src\\Assignment6_Files";
        File file = new File(mainDir);
        Stack<File> s = new Stack<>();
        s.push(file);
        System.out.println("Content of Directory " + mainDir + " is");
        while (!s.empty()) {
            File tmpF = s.pop();
            if (tmpF.isFile()) {
                System.out.println(tmpF.getName());
            } else if (tmpF.isDirectory()) {
                File[] f = tmpF.listFiles();
                for (File fpp : f) {
                    s.push(fpp);
                }
            }
        }
    }
}
