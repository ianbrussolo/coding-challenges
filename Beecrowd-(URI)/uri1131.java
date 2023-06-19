package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1131 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int vitInter = 0, vitGremio = 0, empates = 0;
    int total = 0, golsInter, golsGremio;
    while(true){
        golsInter = in.nextInt();
        golsGremio = in.nextInt();
        if (golsInter == golsGremio){
            empates++;
        } else if (golsInter > golsGremio){
            vitInter++;
        } else if (golsInter < golsGremio){
            vitGremio++;
        }
        System.out.println("Novo grenal (1-sim 2-nao)");
        int resposta = in.nextInt();
        if (resposta == 1) {
            continue;
        } else if (resposta == 2) {
            break;
        }
    }
    total = vitGremio + vitInter + empates;
    System.out.println(total + " grenais");
    System.out.println("Inter:" + vitInter);
    System.out.println("Gremio:" + vitGremio);
    System.out.println("Empates:" + empates);
    if (vitGremio > vitInter){
        System.out.println("Gremio venceu mais");
    } else if (vitGremio < vitInter){
        System.out.println("Inter venceu mais");
    }
    }
}
