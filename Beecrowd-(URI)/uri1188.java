package beecrowd;
import java.util.Scanner;

public class uri1188 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char O = in.next().toUpperCase().charAt(0);;
		double[][] matriz = new double[12][12];
		//preenchendo a matriz
		for (int i = 0; i < 12; i++){
			for (int j = 0; j < 12; j++){
				matriz[i][j] = in.nextDouble();
			}
		}
		double soma = 0;
        int contador = 0;
		for (int i = matriz.length - 1; i > (matriz.length - 1)/2; i--){
            for (int j = matriz.length - i; j < matriz.length - (matriz.length - i) ; j++){
                soma += matriz[i][j];
                contador++;
            }
        }
        
		if (O == 'S'){
			System.out.println(String.format("%.1f", soma));
		} else if (O == 'M'){
			System.out.println(String.format("%.1f", soma/contador));
		}
	}
}
