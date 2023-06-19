package beecrowd;
import java.util.Scanner;

public class uri1165 {
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
        	int contador = 2;
            int x = in.nextInt();
            for (int j = 2; j < x; j++){
                if(x % j == 0){
                    contador++;
                }
            }
            if (contador > 2 || x == 1){
                System.out.println(x + " nao eh primo");
            } else {
                System.out.println(x + " eh primo");
            }
            x = 0;
        }
            
        }
 
}

