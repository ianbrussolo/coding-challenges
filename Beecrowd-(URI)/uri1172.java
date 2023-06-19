package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1172 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);

    int[] X = new int[10];
    for (int i = 0; i < X.length; i++) {
        X[i] = in.nextInt();
        if (X[i] <= 0) {
            X[i] = 1;
        }
    } 
    for (int i = 0; i < X.length; i++) {
        System.out.println("X[" + i + "] = " + X[i]);
    }
    }
}