package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1564 {
 
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int N;
    while(in.hasNextInt()) {
        N = in.nextInt();
        if (N == 0) {
            System.out.println("vai ter copa!");
        } else if (N >= 0 && N <= 100) {
            System.out.println("vai ter duas!");
        }
    }
    }
 
}