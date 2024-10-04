package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
//oppgave a
		int[][] matrise1 = { { 3, 7, 2, 8 }, { 2, 3, 4, 5 }, { 3, 5, 2, 3 } };
		skrivUt(matrise1);

		System.out.println("__________oppgaveB___________");
		int[][] matrise2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		String streng = tilStreng(matrise2);
		System.out.println(streng);

		int[][] matrise3 = { { 3, 4, 5, 7 }, { 2, 3, 5, 7 }, { 1, 3, 6, 8, } };

		System.out.println("__________oppgave C___________");
		int[][] skalertMatrise = skaler(2, matrise1); // Skaler matrisen med tall
		skrivUt(skalertMatrise); // Skriv ut den skalerte matrisen
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
	public static String tilStreng(int[][] matrise) {
		String streng = "";
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
            	streng += matrise[i][j];
                if (j < matrise[i].length) {
                	streng += " ";
                }
            }
            streng += "\n"; 
        }
        return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] resultat = new int[matrise.length][matrise[0].length];
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				resultat[rad][kol] = matrise[rad][kol] * tall;
			}
		}
		return resultat;
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
