package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1179 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int[] pares = new int[5];
    int[] impares = new int[5];
    int X, contagemPares = 0, contagemImpares = 0;

    for (int i = 0; i < 15; i++) {
        X = in.nextInt();
        if (X % 2 == 0) {
            pares[contagemPares] = X; 
            contagemPares++;
        } else {
            impares[contagemImpares] = X;
            contagemImpares++;
        }
        if (contagemPares == 5) {
            contagemPares = 0;
            for (int j = 0; j < pares.length; j++) {
                System.out.println("par[" + j + "] = " + pares[j]);
            }
        } else if (contagemImpares == 5) {
            contagemImpares = 0;
            for (int j = 0; j < impares.length; j++) {
                System.out.println("impar[" + j + "] = " + impares[j]);
            }
        }
        
    }
    for (int i = 0; i < contagemImpares; i++) {
        System.out.println("impar[" + i + "] = " + impares[i]);
    }
    for (int i = 0; i < contagemPares; i++) {
        System.out.println("par[" + i + "] = " + pares[i]);
    }
    }
}
