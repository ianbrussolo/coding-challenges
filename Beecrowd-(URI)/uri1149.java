package beecrowd;
import java.util.Scanner;

public class uri1149 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A, N, Soma = 0;
        A = in.nextInt();

        while ((N = in.nextInt()) <= 0) {
            N = in.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            Soma += A;
            A++;
        }
        System.out.println(Soma);
    }
}
