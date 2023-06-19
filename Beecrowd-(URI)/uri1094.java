package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1094 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    
    char animal;
    int n = in.nextInt();
    int[] testes = new int[n];
    int totalCoelhos = 0;
    int totalRatos = 0;
    int totalSapos = 0;
    int totalCobaias = 0;

    for (int i = 0; i < testes.length; i++) {
        testes[i] = in.nextInt();
        animal = in.next().charAt(0);
        if (animal == 'C') {
            totalCoelhos += testes[i];
        } else if (animal == 'R') {
            totalRatos += testes[i];
        } else if (animal == 'S') {
            totalSapos += testes[i];
        }
    }
    totalCobaias = totalSapos + totalRatos + totalCoelhos;

    System.out.println("Total: " + totalCobaias + " cobaias");
    System.out.println("Total de coelhos: " + totalCoelhos);
    System.out.println("Total de ratos: " + totalRatos);
    System.out.println("Total de sapos: " + totalSapos);
    double percCoelhos = totalCoelhos*100/(double)totalCobaias;
    double percRatos = totalRatos*100/(double)totalCobaias;
    double percSapos = totalSapos*100/(double)totalCobaias;
    System.out.println(String.format("Percentual de coelhos: %.2f", percCoelhos) + " %");
    System.out.println(String.format("Percentual de ratos: %.2f", percRatos) + " %");
    System.out.println(String.format("Percentual de sapos: %.2f", percSapos) + " %");
    }
}