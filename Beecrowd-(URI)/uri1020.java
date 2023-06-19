package beecrowd;
import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int idade = in.nextInt();
        int[] contador = new int[3]; //0 = 365; 1 = 30; 2 = 1;
        while (idade >= 365) {
            idade -= 365;
            contador[0]++;
        } 
        while (idade >= 30) {
            idade -= 30;
            contador[1]++;
        } 
        while (idade >= 1) {
            idade -= 1;
            contador[2]++;
        } 
        System.out.println(contador[0] + " ano(s)\n" + contador[1] + " mes(es)\n" + contador[2] + " dia(s)\n");

    }
}

