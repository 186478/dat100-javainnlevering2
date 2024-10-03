package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {

		int[][] matrise = { { 3, 7, 2, 8 }, { 2, 3, 4, 5 }, {3, 5, 2, 3 }};

		skrivUt(matrise);
	}

	// a) skrive ut matrisen over
	public static void skrivUt(int[][] matrise) {
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				System.out.print(matrise[rad][kol]);

				if (kol< matrise[rad].length - 1) {
					System.out.print(",");
				}

			}
			System.out.println();
		}
	}

	
	// b)
	public static String tilStreng(int[][] matrise) {


	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");

	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
