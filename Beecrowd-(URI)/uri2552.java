package beecrowd;
import java.util.Scanner;

public class uri2552 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int N = in.nextInt();
            int M = in.nextInt();

            int[][] tab = new int[N][M];
            //preenche matriz inicial
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    tab[i][j] = in.nextInt();
                }
            }
            //matriz final
            int[][] tabFinal = new int[N][M];
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    if (tab[i][j] == 1) {
                        tabFinal[i][j] = 9;
                    }
                }
            }
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    //esquerda
                    if (tab[i][j] == 0 && j > 0) {
                        if (tab[i][j - 1] != 0) {
                            tabFinal[i][j]++;
                        }
                    }
                    //direita
                    if (tab[i][j] == 0 && j < tab[i].length - 1) {
                        if (tab[i][j + 1] != 0) {
                            tabFinal[i][j]++;
                        }
                    }
                    //cima
                    if (tab[i][j] == 0 && i < tab.length - 1) {
                        if (tab[i + 1][j] != 0) {
                            tabFinal[i][j]++;
                        }
                    }
                    //baixo
                    if (tab[i][j] == 0 && i > 0) {
                        if (tab[i - 1][j] != 0) {
                            tabFinal[i][j]++;
                        }
                    }
                }
            }
            //printa
            for (int i = 0; i < tabFinal.length; i++) {
                for (int j = 0; j < tabFinal[i].length; j++) {
                    System.out.print(tabFinal[i][j]);
                }
                System.out.println();
            }
        }
    }
}
