import java.util.Scanner;

public class Aprovados {
	static Scanner sc1 = new Scanner(System.in);
	static class Aluno {
		String nome;
		int nota1;
		int nota2;
	}
	
	public static void main(String[] args) {
		int cont = sc1.nextInt();
		int[] alunos = new int[cont];
		aloc(cont, alunos);
		Aluno fernando  = new Aluno();
		fernando.nome = sc1.nextLine();

	}

	public static void aloc(int cont, int[]alunos) {
		
		cont = sc1.nextInt();
		alunos = new int[cont];
		
	}
}
