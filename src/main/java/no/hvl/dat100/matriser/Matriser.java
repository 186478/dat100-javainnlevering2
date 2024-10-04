package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
//oppgave a
		int[][] matrise1 = { { 3, 7, 2, 8 }, { 2, 3, 4, 5 }, { 3, 5, 2, 3 } };
		skrivUt(matrise1);

		System.out.println("__________oppgaveB___________");
		String[][] matrise2 = { { "3", "7", "2", "8" }, { "2", "3", "4", "5" }, { "3", "5", "2", "3" } };
		System.out.println(tilStreng(matrise2));
		
		int[][] matrise3 = {{3, 4, 5, 7}, {2, 3, 5, 7}, {1, 3, 6, 8,} };

	}

	// a) skrive ut matrisen over
	public static void skrivUt(int[][] matrise) {
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				System.out.print(matrise[rad][kol]);

				if (kol < matrise[rad].length - 1) {
					System.out.print(",");
				}

			}
			System.out.println();
		}
	}

	// b) konvertere int til string
	public static String tilStreng(String[][] matrise) {
		StringBuilder sb = new StringBuilder();
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				sb.append(matrise[rad][kol]);
				if (kol < matrise[rad].length - 1) {
					sb.append(", ");
				}
			}
			if (rad < matrise.length - 1) {
				sb.append("\n"); // Linjeskift etter hver rad
			}
		}
		return sb.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		
	

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
