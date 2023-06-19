/*
1) Leia da entrada padrão (Scanner/System.in) um inteiro positivo N e em seguida n triplas de inteiros i, j, k; 
tais que 1 <= i,j,k <= 9. Preencha uma matriz M 9x9 com as triplas lidas, de forme que, para cada triplo i j k, coordenada 
(i,j) de M seja igual a k. As demais coordenadas de M devem ser iguais a zero.
2 )Considere a matriz M preenchida no exercicio 1. Escreva uma função que receba M e uma tripla i j k (entre 1 e 9) 
e devolva "false" se uma das seguintes condições for satisfeita (caso contrario, devolva true): 
  a) a coordenada (i,j) de M contém um valor != 0. 
  b) a linha i já contém o valor k.
3) Mesma coisa do exercicio 2, porém troque a condição b por: c) a coluna j já contém o valor k.
4) Mesma coisa do exercicio 2, porém troque a condição 2 por: 4) a sub matriz 3x3 (A, B, ... I) em que (i,j) está contido já contém o valor k.
5) Faça uma função que devolva a matriz M 9x9.*/
import java.util.Scanner;
	 
public class Sudoku {
    //metodo para printar matriz
    static void imprime(int[][] matriz) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    //posição já estava preenchida? return false se sim
    static boolean verificarPosicao(int[][]matriz, int l, int c){
        if (matriz[l][c] != 0){
            return false;
        }  
        return true;
    }
    //verificar linha para ver se tem numeros repetidos
    static boolean verificarLinha(int[][]matriz, int l, int n){
        for (int i = 0; i < matriz.length; i++){
              if(matriz[l][i] == n){
                return false;
              }
        }
        return true;
    }
    //verificar coluna 
    static boolean verificarColuna(int[][]matriz, int c, int n){
        for (int i = 0; i < matriz.length; i++){
            if(matriz[i][c] == n){
                return false;
            }
        }
        return true;
    }
    //verificar submatriz (bloco de 9)
    static boolean verificarBloco(int[][]matriz, int l, int c, int n){
        int linhaBloco = l - l % 3;
        int colunaBloco = c - l % 3;
        for (int i = linhaBloco; i < linhaBloco + 3; i++) {
            for (int j = colunaBloco; j < colunaBloco + 3; j++) {
                if (matriz[i][j] == n){
                    return false;
                }
            }
        }
        return true;
    }
    //verificar se a jogada eh valida
    static boolean verificarJogada(int[][]matriz, int l, int c, int n){
        if (!verificarLinha(matriz, n, l) && !verificarColuna(matriz, n, c) && !verificarBloco(matriz, n, c, l) && !verificarPosicao(matriz, c, l)){
            System.out.println("Jogada inválida!");
        }
        return true;
    }
    ////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o número de elementos pré-definidos:");
        int qtdinicial = in.nextInt();
        int[][] matriz = new int[9][9];
        //preenchimento previo
        System.out.println("Insira os elementos pré-definidos:");
        for (int i = 0; i < qtdinicial; i++) {
            int l = in.nextInt();
            int c = in.nextInt();
            int n = in.nextInt();
            matriz[l][c] = n;
        }
        imprime(matriz);
          
        //o jogo começa aqui
        System.out.println("Agora comece seu jogo:");
        int jogada = 0;
        while (true) {
            int l = in.nextInt();
            int c = in.nextInt();
            int n = in.nextInt();
            //fim do jogo? 
            if (l == (-1) && c == (-1) && n == (-1)) {
                System.out.println("Jogo finalizado, obrigado!");
                break;
            }
            else if (verificarJogada (matriz, l, c, n)) {
                matriz[l][c] = n;
                imprime(matriz);
                jogada++;
            }
            //preencheu tudo?
            else if(jogada==81){
                System.out.println("Parabéns!");
                break;
            }
        }
        in.close();
    }
}
/*import java.util.*;

public class Sudoku {
    static boolean validarJogada (int[][] matrizref, int linha, int coluna, int num) {
        // Para verificar a posição
        if (matrizref[linha][coluna] != 0) {
            System.out.println("Jogada Invalida\n");
            return false;
        }
        // Para verificar a coluna:
        for (int ln = 0; ln < matrizref[0].length; ln++) {
            if (matrizref[ln][coluna] == num) {
                System.out.println("Jogada Invalida\n");
                return false;
            }

        } // Para verificar a linha:
        for (int cl = 0; cl < matrizref.length; cl++) {
            if (matrizref[linha][cl] == num) {
                System.out.println("Jogada Invalida\n");
                return false;
            }
            
        } // Para verificar a submatriz:
        if (linha % 3 == 0) {
            for (int lin = 0; lin <= 2; lin++) {
                if (coluna % 3 == 0) {
                    for (int col = 0; col <= 2; col++) {
                        if (matrizref[linha + lin][coluna + col] == num) {
                            System.out.println("Jogada Invalida\n");
                            return false;
                        }
                    }
                }

                if (coluna % 3 == 1) {
                    for (int col = 0; col <= 2; col++) {
                        if (matrizref[linha + lin][(coluna - 1) + col] == num) {
                            System.out.println("Jogada Invalida\n");
                            return false;
                        }
                    }
                }

                if (coluna % 3 == 2) {
                    for (int col = 0; col <= 2; col++) {
                        if (matrizref[linha + lin][(coluna - 2) + col] == num) {
                            System.out.println("Jogada Invalida\n");
                            return false;
                        }
                    }
                }
            }
        } if (linha % 3 == 1) {
            for (int lin = 0; lin <= 2; lin++) {
                if (coluna % 3 == 0) {
                    for (int col = 0; col <= 2; col++) {
                        if (matrizref[(linha - 1) + lin][coluna + col] == num) {
                            System.out.println("Jogada Invalida\n");
                            return false;
                        }
                    }
                }

                if (coluna % 3 == 1) {
                    for (int col = 0; col <= 2; col++) {
                        if (matrizref[(linha - 1) + lin][(coluna - 1) + col] == num) {
                            System.out.println("Jogada Invalida\n");
                            return false;
                        }
                    }
                }

                if (coluna % 3 == 2) {
                    for (int col = 0; col <= 2; col++) {
                        if (matrizref[(linha - 1) + lin][(coluna - 2) + col] == num) {
                            System.out.println("Jogada Invalida\n");
                            return false;
                        }
                    }
                }
            }
        } if (linha % 3 == 2) {
            for (int lin = 0; lin <= 2; lin++) {
                if (coluna % 3 == 0) {
                    for (int col = 0; col <= 2; col++) {
                        if (matrizref[(linha - 2) + lin][coluna + col] == num) {
                            System.out.println("Jogada Invalida\n");
                            return false;
                        }
                    }
                }

                if (coluna % 3 == 1) {
                    for (int col = 0; col <= 2; col++) {
                        if (matrizref[(linha - 2) + lin][(coluna - 1) + col] == num) {
                            System.out.println("Jogada Invalida\n");
                            return false;
                        }
                    }
                }

                if (coluna % 3 == 2) {
                    for (int col = 0; col <= 2; col++) {
                        if (matrizref[(linha - 2) + lin][(coluna - 2) + col] == num) {
                            System.out.println("Jogada Invalida\n");
                            return false;
                        }
                    }
                }
            }
        } return true;
    }

    static void imprimirMatriz (int[][] matrizref) {
        for (int ln = 0; ln < matrizref[0].length; ln++) {
            for (int cl = 0; cl < matrizref.length; cl++) {
                System.out.print(matrizref[ln][(cl)] + "  ");
            } System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[9][9];
        int contador = 0;
        while (true) {
            int i = in.nextInt();
            int j = in.nextInt();
            int numero = in.nextInt();
            if (i == (-1) && j == (-1) && numero == (-1)) {
                System.out.println("Jogo finalizado!");
                break;
            }
            else if (validarJogada (matriz, i, j, numero)) {
                matriz[i][j] = numero;
                imprimirMatriz(matriz);
                contador++;
            }
            else if (contador == 81) {
                System.out.println("Jogo completo, parabens!");
                break;
            }
        }
    }
} */	