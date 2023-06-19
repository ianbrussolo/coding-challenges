package beecrowd;
import java.util.Scanner;

public class uri1827 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
			//n é sempre ímpar
			int n = in.nextInt();
			int[][] matriz = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					//diagonal principal com 2
					if(i == j){
						matriz[i][j] = 2;
					}
					//diagonal secundaria com 3
					if (i + j == n - 1){
						matriz[i][j] = 3;
					}
					
				}
			}
			//preenchimento com 1
			for(int i = n/3; i < n - n/3; i++){
				for(int j = n/3; j < n - n/3; j++){
					matriz[i][j] = 1;
				}
			}
			//elemento central
			matriz[(n/2)][(n/2)] = 4;
			
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
