package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1040 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);

    double nota1 = in.nextDouble();
    nota1 *= 2;
    double nota2 = in.nextDouble();
    nota2 *= 3;
    double nota3 = in.nextDouble();
    nota3 *= 4;
    double nota4 = in.nextDouble();
    double media = (nota1 + nota2 + nota3 + nota4)/10;
    if (media*10 - Math.floor(media*10) > 0.5001) { //metodo para arredondar o valor pro menor
        media = Math.ceil(media*10)/10;
      }

      else {
         media = Math.floor(media*10)/10;
      }
    System.out.println(String.format("Media: %.1f", media));
    
    if (media >= 7) {
        System.out.println("Aluno aprovado.");
    } else if (media < 5) {
        System.out.println("Aluno reprovado.");
    } else if (media >= 5 || media < 7) {
        System.out.println("Aluno em exame.");
        double exame = in.nextDouble();
        System.out.println("Nota do exame: " + exame);
        media = (media + exame)/2;
        if (media >= 5) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        }
        System.out.println(String.format("Media final: %.1f", media));
    }
    }
}