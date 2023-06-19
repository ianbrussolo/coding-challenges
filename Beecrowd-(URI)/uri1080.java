package beecrowd;
import java.io.IOException; 
import java.util.Scanner; 

public class uri1080 { 
    public static void main(String[] args) throws IOException { 

        Scanner scan = new Scanner(System.in); 

        int[] numeros = new int[5];
        for(int i = 0; i < numeros.length; i++){ 
            numeros[i] = scan.nextInt(); 
        } 

        int maior = numeros[0];
        int onde = 0;

        for(int i = 0; i < numeros.length; i++){ 
            if(numeros[i] > maior) { 
                maior = numeros[i]; 
                onde = i; 
            } 
        } 
        System.out.println(maior); 
        System.out.println(onde + 1); 
    } 
} 