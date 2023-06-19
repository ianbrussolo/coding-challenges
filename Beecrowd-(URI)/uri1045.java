package beecrowd;
import java.util.Scanner;

public class uri1045 {
	public static void main (String[] a) {
		Scanner in = new Scanner(System.in);
		double A = in.nextDouble();
		double B = in.nextDouble();
		double C = in.nextDouble();
		double temp;

		if(B > A && B > C) {
			temp = A;
			A = B;
			B = temp;
		} else if(C > A) {
			temp = A;
			A = C;
			C = temp;
		}

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO"); 
		} else { 
			if (A*A < B*B + C*C) System.out.println("TRIANGULO ACUTANGULO");
			if (A*A > B*B + C*C) System.out.println("TRIANGULO OBTUSANGULO");		
			if (A*A == B*B + C*C) System.out.println("TRIANGULO RETANGULO");		
			if ((A == B && A != C) || (B == C && B != A) || (A == C && A != B)) System.out.println("TRIANGULO ISOSCELES");		
			if (A == B && B == C) System.out.println("TRIANGULO EQUILATERO");
		} 
	}
}
