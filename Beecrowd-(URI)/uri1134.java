package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1134 {
 
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    
    int[] contagem = new int[3];
    while(true){
    	int codigo = in.nextInt();
        if (codigo == 1){
            contagem[0] += 1;
        } else if (codigo == 2){
            contagem[1] += 1;
        } else if (codigo == 3){
            contagem[2] += 1;
        } else if (codigo == 4){
        	break;
        }
    }
    int alcool = contagem[0];
    int gasolina = contagem[1];
    int diesel = contagem[2];
    
    System.out.println("MUITO OBRIGADO\n" + "Alcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
    }
 
}