package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1113 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int X;
    int Y;
    while (true) {
        X = in.nextInt();
        Y = in.nextInt();
        if (X > Y) {
            System.out.println("Decrescente");
        } else if (X < Y) {
            System.out.println("Crescente");
        } else if (X == Y) {
            break;
        }
    }
    }
}