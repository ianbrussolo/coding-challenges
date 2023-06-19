//devolver o índice do segundo menor valor de um array
import java.util.Scanner;

public class SegundoMenor {
    public static void preencheVetor(int[] a, int r){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < r; i++){
            a[i] = in.nextInt();
        }
        in.close();
    }
    static void menores(int[] a, int r){
        int menor = a[0];
        int posMenor = 0;
        int segMenor = a[1];
        int posSegMenor = 1;
        //1° loop: armazena o menor valor
        for (int i = 1; i < r; i ++){
            if (a[i] < menor){
                menor = a[i];
                posMenor = i;
                segMenor = a[i-1];
                posSegMenor = i-1;
            } 
        }
        System.out.println("Menor valor: " + "a[" + posMenor + "] = " + menor);
        //2° loop: armazena o segundo menor valor
        for (int i = 0; i < r; i ++){
            if(a[i] < segMenor && a[i] != menor){
                segMenor = a[i];
            }
        }
        System.out.println("Segundo menor valor: " + "a[" + posSegMenor + "] = " + segMenor);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int[] a = new int[r];
        preencheVetor(a, r);
        menores(a, r);
        in.close();
        System.out.println("ola");
    }
}
