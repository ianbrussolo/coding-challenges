package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1160 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int testes = in.nextInt();
    int anos;
    for (int i = 1; i <= testes; i++) {
        anos = 0;
        int PA = in.nextInt();
        int PB = in.nextInt();
        double GA = in.nextDouble();
        double GB = in.nextDouble();
        while (PB >= PA) {
            PA += (PA * GA) / 100;
            PB += (PB * GB) / 100;
            anos++;
            if (anos > 100) {
                break;
            }
        }
        if (anos > 100) {
            System.out.println("Mais de 1 seculo.");
        } else {
            System.out.println(anos + " anos");
        }
    }
}
}