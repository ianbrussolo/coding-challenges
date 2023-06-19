package codecademy_projects;

import java.util.ArrayList;
import java.util.Scanner;

public class checaPrimos {
	static Scanner in = new Scanner(System.in);
	static void isPrime() {
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			int contador = 2;
			for (int j = 2; j < number; j++) {
				if (number % j == 0) {
					contador++;
				}
			}
			if (contador > 2 || number == 1) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}
		}
	}

	static ArrayList<Integer> onlyPrimes(int[] numbers) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		forEhPrimo: for (int number : numbers) {
			if (number == 1) {
				continue;
			}

			int contador = 2;

			for (int j = contador; j < number; j++) {
				if (number % j == 0) {
					continue forEhPrimo;
				}
			}

			primes.add(number);
		}
		System.out.println(primes);
		return primes;
	}

	public static void main(String[] args) {
		// isPrime();//
        int n = in.nextInt();
		int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
		checaPrimos.onlyPrimes(numbers);
	}
}
////////////////////////////////////////////////////////////////////////////// com contador
// Import statement:
/*import java.util.ArrayList;
import java.util.Scanner;

public class primos {
	static Scanner in = new Scanner(System.in);

	// Add your methods here:
	static void isPrime() {
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			int contador = 2;
			for (int j = 2; j < number; j++) {
				if (number % j == 0) {
					contador++;
				}
			}
			if (contador > 2 || number == 1) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}
		}
	}

	static ArrayList<Integer> onlyPrimes(int[] numbers) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int number : numbers) {
			if (number == 1) {
				continue;
			}
			
			int contador = 2;
			for (int j = 2; j < number; j++) {
				if (number % j == 0) {
					contador++;
				}
			}
			if (!(contador > 2)) {
				primes.add(number);
			}
		}
		System.out.println(primes);
		return primes;
	}

	public static void main(String[] args) {
		// isPrime();//
		primos pd = new primos();
		int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };
		pd.onlyPrimes(numbers);

	}

}*/


