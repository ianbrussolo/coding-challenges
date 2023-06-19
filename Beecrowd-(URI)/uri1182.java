package beecrowd;
import java.util.Scanner;

public class uri1182 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int C = in.nextInt();
		char O = in.next().toUpperCase().charAt(0);;
		double[][] matriz = new double[12][12];
		//preenchendo a matriz
		for (int i = 0; i < 12; i++){
			for (int j = 0; j < 12; j++){
				matriz[i][j] = in.nextDouble();
			}
		}
		double soma = 0;
        for (int i = 0; i < matriz.length; i++){
            soma += matriz[i][C];
        }
		if (O == 'S'){
			System.out.println(String.format("%.1f", soma));
		} else if (O == 'M'){
			System.out.println(String.format("%.1f", soma/12));
		}
	}
}

