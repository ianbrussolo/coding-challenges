package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1178 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    double numero = in.nextDouble();
    double[] array = new double[100];
    array[0] = numero;
    System.out.println(String.format("N[0] = %.4f", array[0]));
    
    for (int i = 1; i < array.length; i++){
        array[i] = array[i-1]/2;
        System.out.println(String.format("N["+i+"] = %.4f", array[i]));
    }
    }
}