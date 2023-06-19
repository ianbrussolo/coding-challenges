//algoritmo de ordenação
//exercicio do carro: Criar uma classe Carro com 3 atributos (cor, ano, modelo), depois criar um vetor pra armezanar os carros e depois ordenar os carros por ano
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int aux = 0;
        System.out.println("Tamanho do vetor: ");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Insira os elementos: ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("N[" + i + "] = " + array[i]);
        }
        //bubble sort
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    //troca
                    aux = array [j];
                    array[j] = array[i];
                    array[i] = aux;
                } 
            }
        }
        System.out.println("Ordenando:");
        for (int i = 0; i < n; i++) {
            System.out.println("N[" + i + "] = " + array[i]);
        }
        in.close();
    }
}
