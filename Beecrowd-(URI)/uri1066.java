package beecrowd;
import java.util.Scanner;

public class uri1066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i=0; i < numbers.length; i++) {           
            numbers[i] = in.nextInt();
        }
        int numPares = 0;
        int numImpares = 0;
        int numPositivos = 0;
        int numNegativos = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numPares++;
            } else {
                numImpares++;
            }
            if (numbers[i] > 0) {
                numPositivos++;
            } else if (numbers[i] < 0) {
                numNegativos++;
            }
        }

        System.out.println(numPares +  " valor(es) par(es)");      
        System.out.println(numImpares + " valor(es) impar(es)");
        System.out.println(numPositivos + " valor(es) positivo(s)");
        System.out.println(numNegativos + " valor(es) negativo(s)");
    }
 
}