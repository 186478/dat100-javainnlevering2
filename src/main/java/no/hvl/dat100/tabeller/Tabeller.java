package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int[] heltallTabell = { 3, 7, 2, 8 };
		skrivUt(heltallTabell);

		int[] strengTabell = { 42, 67, 89 };

		String resultat = tilStreng(strengTabell);
		System.out.println(resultat);
<<<<<<< HEAD
		
		int[] sjekkTabell = {1, 2, 4, 6, 10, 14};
		boolean sjekk = finnesTall(sjekkTabell);
		System.out.println(sjekk);
		

		//String resultat = tilStreng(strengTabell);		
		//System.out.print(resultat);
		
		int [] posisjonTabell = {1,2,3,4,5,6,7};
		//int posisjon = posisjonTall(posisjonTabell, 3);
		//System.out.println("Posisjonen til tallet er: " + posisjon);
		//posisjon = posisjonTall(posisjonTabell, 60);
        //System.out.println(posisjon);
		
		int [] reverserTabell = {1,2,3,4,5,6};
		String nyTabell = reverser(reverserTabell);
		System.out.print(nyTabell);
=======

		int[] sjekkTabell = { 1, 2, 4, 6, 10, 14 };
		boolean sjekk = finnesTall(sjekkTabell, 7);
		System.out.println(sjekk);

		// String resultat = tilStreng(strengTabell);
		// System.out.print(resultat);

		int[] posisjonTabell = { 1, 2, 3, 4, 5, 6, 7 };
		// int posisjon = posisjonTall(posisjonTabell, 3);
		// System.out.println("Posisjonen til tallet er: " + posisjon);
		// posisjon = posisjonTall(posisjonTabell, 60);
		// System.out.println(posisjon);
>>>>>>> ea957a85fe273ad1648a146011609fa396870d85

	}

	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			if (i < tabell.length - 1) {
				System.out.print(", ");
			}
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String resultat = "[";

		for (int i = 0; i < tabell.length; i++) {
			resultat += tabell[i];

			if (i < tabell.length - 1) {
				resultat += ",";
			}
		}

		resultat += "]";

		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}

		return false;
	}

	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int nyTabell = 0;
		
		for (int i = tabell.length; i > 0; i--) {
			nyTabell += tabell[i];
			if (i > 1) {
				
			}
		}
		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
