package beecrowd;
import java.util.Scanner;

public class uri1534 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			//n é sempre ímpar
			int n = in.nextInt();
			int[][] matriz = new int[n][n];
            //preenchimento com 3
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					matriz[i][j] = 3;
				}
			}

			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					//diagonal principal com 1
					if(i == j){
						matriz[i][j] = 1;
					}
					//diagonal secundaria com 2
					if (i + j == n - 1){
						matriz[i][j] = 2;
					}
					
				}
			}
			//printar matriz
			for (int i = 0; i < matriz.length; i++){
	            for (int j = 0; j < matriz[i].length; j++){
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
			}
		}
	}
}
