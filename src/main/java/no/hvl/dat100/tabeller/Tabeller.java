package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int [] tabell = {3,7,2,8};
		skrivUt(tabell);

	}

	public static void skrivUt(int[] tabell) {
		
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + ", ");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i <= tabell.length; i++) {
		     if (tabell[i] == tall) {
	                return true; 
	            }
		    }
	        return false;
	 }

	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
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
