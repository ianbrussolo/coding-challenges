package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class uri1061 {
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    //converte de string para inteiro, contando os espaços ocupados por cada conjunto de caracter
        String[] Std1 = in.nextLine().split(" ");
        String[] Sth1 = in.nextLine().replaceAll(" ", "").split(":");
        String[] Std2 = in.nextLine().split(" ");
        String[] Sth2 = in.nextLine().replaceAll(" ", "").split(":");
        int d1 = Integer.parseInt(Std1[1]);
        int h1 = Integer.parseInt(Sth1[0]);
        int m1 = Integer.parseInt(Sth1[1]);
        int s1 = Integer.parseInt(Sth1[2]);
        int d2 = Integer.parseInt(Std2[1]);
        int h2 = Integer.parseInt(Sth2[0]);
        int m2 = Integer.parseInt(Sth2[1]);
        int s2 = Integer.parseInt(Sth2[2]);
        int q1, q2;
        q1 = s1 + m1*60 + h1*60*60 + d1*60*60*24;
        q2 = s2 + m2*60 + h2*60*60 + d2*60*60*24;
        int tempo = q2 - q1;

        System.out.println(tempo/(60*60*24) + " dia(s)");
        tempo = tempo%(60*60*24);
        System.out.println(tempo/(60*60) + " hora(s)");
        tempo = tempo%(60*60);
        System.out.println(tempo/(60) + " minuto(s)");
        tempo = tempo%(60);
        System.out.println(tempo + " segundo(s)");
    }
}
