package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
//oppgave a		
		System.out.println("__________oppgave A___________");
		int[][] matrise1 = { { 3, 7, 2, 8 }, { 2, 3, 4, 5 }, { 3, 5, 2, 3 } };
		skrivUt(matrise1);

		System.out.println("__________oppgave B___________");
		String[][] matrise2 = { { "3", "7", "2", "8" }, { "2", "3", "4", "5" }, { "3", "5", "2", "3" } };
		System.out.println(tilStreng(matrise2));

		System.out.println("__________oppgave C___________");
		   int[][] skalertMatrise = skaler(5, matrise1); // Skaler matrisen med 2
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
	public static String tilStreng(String[][] matrise) {
		StringBuilder sb = new StringBuilder();
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				sb.append(matrise[rad][kol]);
	
				}
	        sb.append("\n"); // Legger til ny linje etter hver rad

			}
	    return sb.toString(); // Returnerer strengen, ikke StringBuilder
		
			}
		
	
	

	// c) multipliser me matrisen
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] resultat = new int[matrise.length][matrise[0].length];
		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {
	            resultat[rad][kol] = matrise[rad][kol] * tall; 

			
				}
				

			}
			System.out.println();
			return resultat;
		}
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");

	}

	// e) Valgfri oppgave
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f) Valgfri oppgave
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
