
/**
 * 
 * @author Nome completo e número USP
 *
 */
public class Trabalho {

	enum Tipo {
		Peao, Bispo, Cavalo, Torre, Rei, Rainha;
	}

	enum Cor {
		Branca, Preta;
	}

	static class Peca {
		Tipo tipo;
		Cor cor;
		
		Peca() {
		}
		
		Peca(Tipo tipo_, Cor cor_) {
			tipo = tipo_;
			cor = cor_;
		}
	}

	/**
	 * @return Devolve o tabuleiro inicial, com as peças brancas embaixo e as pretas
	 *         em cima, considerando que a linha zero é a linha superior da matriz
	 *         que representa o tabuleiro. As casas vazias devem conter a referência
	 *         para null. Cada casa ocupada deve conter uma referência para um
	 *         objeto do tipo "Peca", representando o tipo e a cor da peça que ocupa
	 *         a casa em questão.
	 */
	static Peca[][] tabuleiroInicial() {
		Peca[][] tab = new Peca[8][8];
		
		return tab;
	}

	/**
	 * @param tab Representa o tabuleiro. Se tab[i][j] = null, então a casa (i,j)
	 *            está vazia. Caso contrário, tab[i][j] contém a peça que está na
	 *            casa (i,j). Assuma que tab[l][c] contém um peão.
	 * @param l   linha em que está o peão
	 * @param c   coluna em que está o peão
	 * @return Devolve uma matriz "mov" booleana 8 x 8, tal que, para toda casa
	 *         (i,j) dentro do tabuleiro, mov[i][j] = true se e somente se o peão
	 *         que está na casa (l,c) puder se movimentar para a casa (i,j)
	 */
	static boolean[][] movsPeao(Peca[][] tab, int l, int c) {
		boolean[][] mov = new boolean[8][8];

		return mov;
	}

	static boolean[][] movsTorre(Peca[][] tab, int l, int c) {
		boolean[][] mov = new boolean[8][8];
		
		return mov;
	}

	static boolean[][] movsBispo(Peca[][] tab, int l, int c) {
		boolean[][] mov = new boolean[8][8];

		return mov;
	}

	static boolean[][] movsCavalo(Peca[][] tab, int l, int c) {
		boolean[][] mov = new boolean[8][8];

		return mov;
	}

	static boolean[][] movsRei(Peca[][] tab, int l, int c) {
		boolean[][] mov = new boolean[8][8];

		return mov;
	}

	static boolean[][] movsRainha(Peca[][] tab, int l, int c) {
		boolean[][] mov = new boolean[8][8];

		return mov;
	}
}
