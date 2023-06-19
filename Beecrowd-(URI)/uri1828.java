package beecrowd;
import java.util.Scanner;

public class uri1828 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            String maoSheldon = in.next();
            String maoRaj = in.next();
            
            if(maoSheldon.equals("" + maoRaj)){
                System.out.println("Caso #"+i+": De novo!");
            }else{
                if(maoSheldon.equals("tesoura") && (maoRaj.equals("papel") || maoRaj.equals("lagarto"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else if(maoSheldon.equals("papel") && (maoRaj.equals("pedra") || maoRaj.equals("Spock"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else if(maoSheldon.equals("pedra") && (maoRaj.equals("lagarto") || maoRaj.equals("tesoura"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else if(maoSheldon.equals("lagarto") && (maoRaj.equals("papel") || maoRaj.equals("Spock"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else if(maoSheldon.equals("Spock") && (maoRaj.equals("tesoura") || maoRaj.equals("pedra"))){
                    System.out.println("Caso #"+i+": Bazinga!");
                }else{
                    System.out.println("Caso #"+i+": Raj trapaceou!");
                }
            }
        }
    }
}