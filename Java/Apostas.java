/*input: ler os 14 gols do time da casa, depois os 14 gols do time de fora
  output: numero de vitorias do time da casa, do time de fora, e de empates
  ler numero N (numero de apostas), contendo apenas 1, 2 ou 0, indicando as apostas do jogador
  1 - time da casa; 0 - empate; 2 - time de fora. A cada aposta, printar os pontos.
  Seja t o total arrecadado em apostas. Cada aposta custa 5 reais. Seja P = 85% do valor de t e sejam p1 = 70% do valor de P
  e p2 = 30% do valor de P, o prêmio para quem acertar 14 e 13, respectivamente. Os premios p1 e p2 devem ser divididos
  igualmente entre todos os jogadores q fizeram 14 e 13 pontos, respectivamente. Caso não haja ganhadores, o prêmio fica
  acumulado. Seu programa deve imprimir:
  n° de ganhadores com 14 pontos:
  valor do premio por ganhador:
  n° de ganhadores com 13 pontos:
  valor do premio por ganhador:
  Se o premio acumular, imprimir: premio principal/secundario acumulado*/
  import java.util.Scanner;
  
  public class Apostas {
      public static void main (String[] args){
          Scanner in = new Scanner(System.in);
          int[][] placar = new int[14][2];
          int empates = 0;
          int vitCasa = 0;
          int vitVis = 0;
          int[] resultados = new int[14];
          
          for (int j = 0; j < 2; j ++){
              for (int i = 0; i < 14; i++){
                  placar[i][j] = in.nextInt();
              }
          }
          for (int i = 0; i < 14; i++){
              if (placar[i][0] > placar[i][1]){
                  vitCasa++;
                  resultados[i] = 1; 
              } else if (placar[i][0] < placar[i][1]){
                  vitVis++;
                  resultados[i] = 2;
              } else {
                  empates++;
                  resultados[i] = 0;
              }
          }
          System.out.println("Time da casa: " + vitCasa + "\nEmpate: " + empates + "\nTime de fora: " + vitVis);
          System.out.println("\nApostas:\nTime da casa: coluna 1" + "\nEmpate: coluna 0" + "\nTime de fora: coluna 2");
          
          int apostas = in.nextInt();
          int n = 0;
          int pontos = 0;
          
          for(int i = 0; i <= apostas; i++){
              for (int j = 0; j < 14; j++){
                  n = in.nextInt();
                  if (n == resultados[i]){
                      pontos++;
                      System.out.println("Pontos: " + pontos);
                  }
              }
          }
          in.close();
      }
  }
  
  
