package beecrowd;
import java.util.Scanner;

public class uri1557 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int tam = in.nextInt();
        while (tam != 0) {
            int[][] matriz = new int[tam][tam];
            int i = 0;
            int j = 0;
            int e = 1;
            for (i = 0; i < matriz.length; i++){
                for (j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = e;
                    e *= 2;
                }
                e = matriz[i][0]*2;
            }  

            int digitos = String.valueOf(matriz[tam - 1][tam - 1]).length();
            for (i = 0; i < matriz.length; i++) {
                for (j = 0; j < matriz.length; j++) {
                    if (j == 0 && j < matriz.length) {
                        System.out.printf("%" + digitos + "d", matriz[i][j]); 
                    } else {
                        System.out.printf(" %" + digitos + "d", matriz[i][j]); 
                    }
                }
                System.out.println();
            }
            System.out.println();
            tam = in.nextInt();
        }
		
	}
}
