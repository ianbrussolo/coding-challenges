package beecrowd;
import java.util.Scanner;

public class uri1435 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int tam = in.nextInt();
        while (tam != 0) {
            int[][] matriz = new int[tam][tam];
            //tamanho impar
            if (tam % 2 != 0) {
                for(int e = 1; e <= (matriz.length - 1)/2; e++) {
                    for (int i = e - 1; i <= matriz.length - e; i++){
                        for (int j = e - 1; j <= matriz[i].length - e; j++){
                            matriz[i][j] = e;
                        }
                    }    
                }
                //elemento central
                matriz[(tam)/2][(tam)/2] = (tam + 1)/2;
            //tamanho par
            } else if (tam % 2 == 0) {
                for(int e = 1; e <= (matriz.length)/2; e++) {
                    for (int i = e - 1; i <= matriz.length - e; i++){
                        for (int j = e - 1; j <= matriz[i].length - e; j++){
                            matriz[i][j] = e;
                        }
                    }    
                }
            }
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (j == 0 && j < matriz.length) {
                        System.out.printf("%3d", matriz[i][j]); 
                    } else {
                        System.out.printf(" %3d", matriz[i][j]); 
                    }
                }
                System.out.println();
            }
            System.out.println();
            tam = in.nextInt();
        }
		
	}
}
