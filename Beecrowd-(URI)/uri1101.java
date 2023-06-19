package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1101 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);

    while(true){
        int M = in.nextInt();
        if (M <= 0){
            break;
        }
        int N = in.nextInt();
        if (N <= 0){
            break;
        }
        int soma = 0;
        if (M >= N){
            for (int i = N; i <= M; i++){
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
        } else if (N >= M){
            for (int i = M; i <= N; i++){
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
        }
    }
    }
}