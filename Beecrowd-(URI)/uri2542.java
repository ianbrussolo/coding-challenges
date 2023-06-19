package beecrowd;
import java.util.Scanner;

public class uri2542 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt(); //numero de atributos
            int M = in.nextInt(); //baralho marcos
            int L= in.nextInt(); //baralho leonardo

            int[][] baralhoM = new int[M][n];
            for (int i = 0; i < baralhoM.length; i++) {
                for (int j = 0; j < baralhoM[i].length; j++) {
                    baralhoM[i][j] = in.nextInt();
                }
            }

            int[][] baralhoL = new int[L][n];
            for (int i = 0; i < baralhoL.length; i++) {
                for (int j = 0; j < baralhoL[i].length; j++) {
                    baralhoL[i][j] = in.nextInt();
                }
            }

            int cartaM = in.nextInt(); 
            cartaM -= 1;
            int cartaL = in.nextInt();
            cartaL -= 1;
            int atr = in.nextInt();
            atr -= 1;
            
            int Marcos = baralhoM[cartaM][atr];
            int Leonardo = baralhoL[cartaL][atr];

            if (Marcos > Leonardo) {
                System.out.println("Marcos");
            } else if (Leonardo > Marcos) {
                System.out.println("Leonardo");
            } else if (Marcos == Leonardo) {
                System.out.println("Empate");
            }
        }
    }
}
