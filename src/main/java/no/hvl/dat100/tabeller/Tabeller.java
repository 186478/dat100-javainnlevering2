package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int [] heltallTabell = {3,7,2,8};
		//skrivUt(heltallTabell);
		
		int [] strengTabell = {42,67,89};
		String resultat = tilStreng(strengTabell);
		System.out.println(resultat);
		
		
		
		 
		}

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
			
			if (i < tabell.length -1) {
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
	public static boolean finnesTall(int[] Tabell, int tall ) {
		
		
		

		for (int i = 0; i <= Tabell.length; i++) {
		     if (Tabell[i] == tall) {
	                return true;
	            }
		    }
	        return false;
	    
        if (finnesTall(Tabell, tall)) {
	        System.out.println(tall + " finnes i tabellen.");
	    } else {
	        System.out.println(tall + " finnes ikke i tabellen.");
	    }
	}
	
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		
		
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
