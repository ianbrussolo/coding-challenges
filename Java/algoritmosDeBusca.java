import java.util.Random;
import java.util.Scanner;

public class algoritmosDeBusca {
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();

		Scanner in = new Scanner(System.in);
		int tamanho = in.nextInt();
		int[] v = geraVetorAleatorio(tamanho, Integer.MAX_VALUE);

		//teste 1: busca simples
		//buscasSimplesAleatorias(v, v.length, 10000); //

		//teste 2: busca binaria
		bubbleSort(v, v.length);
		buscasBinariasAleatorias(v, v.length, 10000);

		final long endTime = System.currentTimeMillis();
		System.out.println("Acabou. \nTempo de execução: " + (endTime - startTime)/1000 + " segundos.");

		in.close();
	}
	//gera um vetor de tamanho N com elementos aleatorios sempre menores que MAX
	static int[] geraVetorAleatorio(int n, int max) {
		//para numeros gigantes, colocar "tipo".MAX_VALUE no parametro de max
		int[] v = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			v[i] = r.nextInt(max);
			//printar cada elemento do array
			//System.out.println(v[i]);//
		}
		return v;
	}

	// método que define randomicamente um valor para X, e executa a busca sequencial M vezes
	static void buscasSimplesAleatorias(int[] v, int n, int m) {
		Random r = new Random();
		for (int i = 0; i < m; i++) {
			buscaSequencial(v, n, r.nextInt());
		}
	}

	//varre cada elemento do vetor enquanto i for menor que n (tamanho do vetor)
	static int buscaSequencial(int[] v, int n, int x) {
		for (int i = 0; i < n; i++) {
			if (v[i] == x) {
				System.out.println("Encontrou: " + x + " está na posição " + i);
				return x;
			} 
		}
		return -1;
	}

	static void buscasBinariasAleatorias(int[] v, int n, int m) {
		Random r = new Random();
		for (int i = 0; i < m; i++) {
			System.out.println("buscando");
			buscaBinaria(v, n, r.nextInt());
		}
	}

	// busca binária: corta pela metade o array a cada busca
	static int buscaBinaria(int[] v, int n, int x) {
		int inicio = 0;
		int fim = 0;
		int meio;
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (v[meio] == x) {
				System.out.println("Encontrou: " + x + "está na posição " + meio);
				return meio;
			} else if (v[meio] > x) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		return -1;
	}

	static void troca(int[] v, int i, int j) {
		int aux;
		aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	static void bubbleSort (int [] v, int n){
		for(int i = 0; i < n - 1; i ++){
			for(int j = i + 1; j < n; j++){
				if(v[j] < v[j-1]){
					troca(v, j, j-1);
				}
			}	
		}
	}
	
	
}


