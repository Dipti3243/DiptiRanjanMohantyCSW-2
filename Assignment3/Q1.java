package Assignment3_ErrorHandling;

public class Q1 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("End of Program");
    }
}
