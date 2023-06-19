package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1153 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] array = new int[n];
    array[0] = n;
    int fatorial = n;

    for (int i = 1; i < n; i++) {
        array [i] = array[i - 1] - 1;
        fatorial = fatorial*array[i];
    }
    System.out.println(fatorial);

    }
}