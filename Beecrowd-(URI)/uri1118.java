package beecrowd;
import java.io.IOException;
import java.util.Scanner;


public class uri1118 {  
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        double flag = 1;
        while (flag == 1){
            double nota1 = in.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
                nota1 = in.nextDouble();
            } 
            double nota2 = in.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
                nota2 = in.nextDouble();
            }
            double media = (nota1 + nota2)/2;
            System.out.println(String.format("media = %.2f", media));

            System.out.println("novo calculo (1-sim 2-nao)");
            flag = in.nextInt();
            while (flag != 1 && flag != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                flag = in.nextInt();
            }

        }
            
    }
}