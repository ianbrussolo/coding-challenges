package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1159 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);

    int X;
    int[] pares = new int[6];
    int soma;

    while (true) {
        X = in.nextInt();
        pares[0] = X;
        soma = X;
        if (X != 0 && X % 2 == 0) {
            for (int i = 1; i < 5; i++) {
                pares[i] = pares[i - 1] + 2;
                soma += pares[i];
            }
            System.out.println(soma);
        } else if (X != 0 && X % 2 != 0) {
            pares[1] = X + 1;
            soma = pares[1];
            for (int i = 2; i < 6; i++) {
                pares[i] = pares[i - 1] + 2;
                soma += pares[i];
            }
            System.out.println(soma);
        } else {
            break;
        }
    }
    }
}