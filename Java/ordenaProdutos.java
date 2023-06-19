//import java.util.*;
import java.util.Scanner;

public class ordenaProdutos{
	
	static class Produto {
		int id;
		double preco;
		String nome;
		//construtor: inserir as instancias diretamente nos parametros
		Produto (int id_, double preco_, String nome_) {
			id = id_;
			preco = preco_;
			nome = nome_;
		}
	}
	
	
    public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
    	int n  = in.nextInt();
        Produto[] produtos = new Produto[n];
        
        //populando o produto
        for (int i = 0; i < n; i++){
        	System.out.println("Insira o id do produto: ");
        	int idScan = in.nextInt();
        	System.out.println("Insira o preço do produto: ");
        	double precoScan = in.nextDouble();
        	System.out.println("Insira a descrição do produto: ");
        	String nomeScan = in.next();
        	produtos[i] = new Produto(idScan, precoScan, nomeScan);
        }
		in.close();
    }

    static int buscaBinaria (Produto[] v, int n, String x){//vetor já ordenado
        int min = 0;
        int max = n-1;
        int meio ;

        while(true){
            meio = (min + max)/2;
            if((v[meio].nome.equals(x))){
                return meio;
            }else if(v[meio].nome.compareTo(x) > 0){
                max = meio - 1;
            }else if(v[meio].nome.compareTo(x) < 0) {
                min = meio + 1;
            }
        }
    }

    static void bubbleSort(Produto[] v, int n){
		for(int i = 1; i < n; i++){
			for(int j = n-1; j >= i; j--){
				if(v[j - 1].nome.compareTo(v[j].nome) > 0){
					Produto aux = v[j-1];
					v[j-1] = v[j];
					v[j] = aux;
				}
			}
		}
	}
}

/*comparar Strings:
(String S1, String S2)
S1.compareto(S2)
devolve 0 se S1 == S2; > 0 se S1 > S2; < 0 se S1 < S2*/
