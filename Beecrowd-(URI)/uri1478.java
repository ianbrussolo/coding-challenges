package beecrowd;
import java.util.Scanner;

public class uri1478 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int tam = in.nextInt();
        int e;
        while (tam != 0) {
            int[][] matriz = new int[tam][tam];
            ///////////////logica de soma e subtração
            /*int e = 1;
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j <= i; j++){
                    matriz[i][j] = e;
                    if (j - 1 >= 0){
                        matriz[i][j] = matriz[i][j-1] - 1;
                    }
                }
                e++;
            }
            e = tam;
            for (int i = 0; i < matriz.length - 1; i++){
                for (int j = matriz.length - 1; j > i; j--){
                    matriz[i][j] = e;
                    if (j - 1 > i){
                        matriz[i][j - 1] = matriz[i][j] - 1;
                    }
                    e--;
                }
                e = tam - (i + 1);
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
            tam = in.nextInt();*/
            ///////////////////logica de soma e subtração
            ////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////logica de diagonais
            for (int i = 0; i < tam; i++) {
				for (int j = 0; j < tam; j++) {
                    //diferença entre o valor da linha e da coluna aumenta sempre em 1
					matriz[i][j] = 1 + Math.abs(i - j);
				}
			}
			
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < tam; i++) {
				sb.append(String.format("%3d", matriz[i][0]));
				for (int j = 1; j < tam; j++) {
					sb.append(String.format(" %3d", matriz[i][j]));
				}
				sb.append(System.lineSeparator());
			}
			System.out.println(sb);
			
			tam = in.nextInt();
        }
		
	}
}
