package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int A = in.nextInt(); 
    int B = in.nextInt(); 
    int C = in.nextInt(); 
    
    int maiorAB = (A + B + Math.abs(A - B))/2;
    maiorAB = (maiorAB + C + Math.abs(maiorAB - C))/2;
    System.out.println(maiorAB + " eh o maior");
    }
}