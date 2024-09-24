package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int[] heltallTabell = { 3, 7, 2, 8 };
		//skrivUt(heltallTabell);

		int[] strengTabell = { 42, 67, 89 };
		//String resultat = tilStreng(strengTabell);
		//System.out.println(resultat);
		
		int[] sumTabell = {20, 13, 30};
		//int sum = summer(sumTabell);
		//System.out.print(sum);
		
		int[] sjekkTabell = {1, 2, 4, 6, 10, 14};
		//boolean sjekk = finnesTall(sjekkTabell);
		//System.out.println(sjekk);

		int[] posisjonTabell = { 1, 2, 3, 4, 5, 6, 7 };
		// int posisjon = posisjonTall(posisjonTabell, 3);
		// System.out.println("Posisjonen til tallet er: " + posisjon);
		// posisjon = posisjonTall(posisjonTabell, 60);
		// System.out.println(posisjon);
		
		int [] normalTabell = {1,2,3,4,5,6};
		int [] reversertTabell = reverser(normalTabell);
		//for (int tall : reversertTabell) {
        //    System.out.print(tall + " ");
        //}
		
		
		int[] tabell1 = {1, 2, 3};
        int[] tabell2 = {4, 5, 6};
        int[] sammensattTabell = settSammen(tabell1, tabell2);
        for (int tall : sammensattTabell) {
            System.out.print(tall + " ");
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
		
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;

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

		int[] reversert = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
            reversert[i] = tabell[tabell.length - 1 - i];
        }
		
		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensatt = new int[tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
            sammensatt[i] = tabell1[i];
        }
		for (int i = 0; i < tabell2.length; i++) {
            sammensatt[tabell1.length + i] = tabell2[i];
        }
		return sammensatt;

	}
}
