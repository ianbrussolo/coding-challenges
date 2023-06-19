package beecrowd;
import java.util.Scanner;
 
public class uri1021 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    /*int vetorNotes[] = {100, 50, 20, 10, 5, 2};
    double vetorCoins[] = {1.0, 0.5, 0.25, 0.1, 0.05, 0.01};
    double total = in.nextDouble();
    int totalNotes = (int) total;
    double totalCoins = total - totalNotes;
    System.out.println("NOTAS:");
    totalCoins += notas(vetorNotes, totalNotes, 0);
    System.out.println("MOEDAS:");
    coins(vetorCoins, totalCoins, 0);
  }
 
  static int notas(int[] vetorNotes, int temp, int vetorPos) {
    int note = vetorNotes[vetorPos];
    System.out.println(temp / note + " note(s) de R$ " + note + ".00");
    temp = temp % note;
    if (vetorPos != vetorNotes.length - 1) {
      return notas(vetorNotes, temp, vetorPos + 1);
    } else {
      return temp;
    }
  }
 
  static void coins(double[] vetorCoins, double temp, int vetorPos) {
    double coin = vetorCoins[vetorPos];
    int print = (int) Math.round(temp / coin);
    temp -= print * coin;
 
    System.out.printf(print + " moeda(s) de R$ %.2f\n", coin);
    if (vetorPos != vetorCoins.length - 1) {
      coins(vetorCoins, temp, vetorPos + 1);
    }
  }
    static */
    double valorInput = in.nextDouble();
    int valor = 0;
    System.out.println("NOTAS:");

    valor = (int) valorInput/100;
    System.out.printf("%d nota(s) de R$100.00%n", valor);
    valorInput = valorInput%100;

    valor = (int) valorInput/50;
    System.out.printf("%d nota(s) de R$50.00%n", valor);
    valorInput = valorInput%50;

    valor = (int) valorInput/20;
    System.out.printf("%d nota(s) de R$20.00%n", valor);
    valorInput = valorInput%20;
    
    valor = (int) valorInput/10;
    System.out.printf("%d nota(s) de R$10.00%n", valor);
    valorInput = valorInput%10;

    valor = (int) valorInput/5;
    System.out.printf("%d nota(s) de R$5.00%n", valor);
    valorInput = valorInput%5;

    valor = (int) valorInput/2;
    System.out.printf("%d nota(s) de R$2.00%n", valor);
    valorInput = valorInput%2;

    valorInput *= 100; 
    System.out.println("MOEDAS:");

    valor = (int) valorInput/100;
    System.out.printf("%d moeda(s) de R$1.00%n", valor);
    valorInput = valorInput%100;

    valor = (int) valorInput/50;
    System.out.printf("%d moeda(s) de R$0.50%n", valor);
    valorInput = valorInput%50;

    valor = (int) valorInput/25;
    System.out.printf("%d moeda(s) de R$0.25%n", valor);
    valorInput = valorInput%25;

    valor = (int) valorInput/10;
    System.out.printf("%d moeda(s) de R$0.10%n", valor);
    valorInput = valorInput%10;

    valor = (int) valorInput/5;
    System.out.printf("%d moeda(s) de R$0.05%n", valor);
    valorInput = valorInput%5;

    valor = (int) valorInput/1;
    System.out.printf("%d moeda(s) de R$0.01%n", valor);
    valorInput = valorInput%1;
  }
}