package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1180 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] array = new int[N]; 
        int menor = 0;
        int posicao = 0;

        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
            if (i == 0) {
                menor = array[i];
                posicao = i;
            } else if (array[i] < menor) {
                menor = array[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
}