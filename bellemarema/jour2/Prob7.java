package bellemarema.jour2;

import java.util.Scanner;


public class Prob7 {
   static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
		

		String phrase = null;
		int nbrVoyelle = 0;
		int nbrConsonne = 0;
		
		              
		System.out.println("Entrez une phrase: ");
		
		phrase = scanner.nextLine().toLowerCase();
		
		for (int i = 0; i < phrase.length(); i++)
		{
			if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' ||
					phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u' || phrase.charAt(i) == 'y')
				nbrVoyelle++;
			else if (phrase.charAt(i) == 'b' || phrase.charAt(i) == 'c' || phrase.charAt(i) == 'd' ||
					phrase.charAt(i) == 'f' || phrase.charAt(i) == 'g' || phrase.charAt(i) == 'h' ||
					phrase.charAt(i) == 'j' || phrase.charAt(i) == 'k' || phrase.charAt(i) == 'l' ||
					phrase.charAt(i) == 'm' || phrase.charAt(i) == 'n' || phrase.charAt(i) == 'p' ||
					phrase.charAt(i) == 'q' || phrase.charAt(i) == 'r' || phrase.charAt(i) == 's' ||
					phrase.charAt(i) == 't' || phrase.charAt(i) == 'v' || phrase.charAt(i) == 'w' ||
					phrase.charAt(i) == 'x' || phrase.charAt(i) == 'z' )
				nbrConsonne++;
			
		}
		
		System.out.println("Nombre de caracteres: " +phrase.length() );
		System.out.println("Nombre de voyelles: " +nbrVoyelle );
		System.out.println("Nombre de consonnes: " +nbrConsonne );

	
	}
}
