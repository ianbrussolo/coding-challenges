package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri2310 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int jogadores = in.nextInt();
    int[] estatisticas = new int[6];

    for (int i = 0; i < jogadores; i++) {
        in.next();
        for (int j = 0; j < estatisticas.length; j++) {
            estatisticas[j] += in.nextInt();
        }
    }
    double bloqueios = (estatisticas[3] * 100.0) / estatisticas[0];
	double saques = (estatisticas[4] * 100.0) / estatisticas[1];
	double ataques = (estatisticas[5] * 100.0) / estatisticas[2];
	System.out.println(String.format("Pontos de Saque: %.2f", bloqueios) + " %.");
	System.out.println(String.format("Pontos de Bloqueio: %.2f", saques) + " %.");
	System.out.println(String.format("Pontos de Ataque: %.2f", ataques) + " %.");
    }
}