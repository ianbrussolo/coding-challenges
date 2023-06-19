//encontrar um valor X dentro de um vetor
import java.util.Scanner;

public class buscaSimples {
	public static void main (String[] a) {
		Scanner in = new Scanner(System.in);
		
		while (true){
			int n = in.nextInt();
			if (n < 0) break;
			int[] v = new int[n];
			for (int i = 0; i < n; i++){
				v[i] = in.nextInt();
			}
		
			int x = in.nextInt();
			boolean encontrou = false;
		
			for (int i = 0; i < n; i++){
				if (v[i] == x){
					encontrou = true;
					System.out.println("Encontrou: " + x + " está na posição " + i);
				}
			}
			if (encontrou == false) {
				System.out.println("não encontrou");
			}
		}
		in.close();
		
	}
}