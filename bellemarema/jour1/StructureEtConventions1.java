package bellemarema.jour1;

import java.util.Scanner;

public class StructureEtConventions1 {

	//les enfant joue au Balon

	// Les CONSTANTES sont nommées en MAJUSCULE au niveau de la Classe
	// Elles sont dites GLOBALES car elles sont accessibles dans toutes
	// les méthdoes de cette Classe
	// Elles sont CONSTANTES car leur valeur ne changera jamais durant l'exécution
	static final String MSG_HELLO = "Hello";
	static final String MSG_QUESTION = "Quel est ton nom?";
	
	public static void main(String[] args) {
		
		// Une méthode ne déclare que les variables qu'elle utilise localement
		// Ces variables sont dites locales car elle ne sont pas accessible à
		// l'extérieur de la méthode.
		String nomUtilisateur;
		
		// Une méthode ne doit faire qu'une seule chose.
		// Donc, il faut écrire des méthodes pour chaque action à exécuter.

		// Demande le nom de l'utilisateur
		demanderNom();

		// Enregistre le résultat de la saisie clavier dans la variable locale
		nomUtilisateur = saisirNom();

		// Passe en paramètre la variable locale à une autre méthode.
		afficherBonjour(nomUtilisateur);
		
	}
	
	public static void demanderNom() {
		System.out.println(MSG_QUESTION);
	}
	
	public static String saisirNom() {
		// Toutes les variables locales d'une méthode ainsi que les objets
		// d'autres types/Classes doivent être déclarés au début de la méthode
		String nom;
		Scanner lectureClavier = new Scanner(System.in);

		nom = lectureClavier.nextLine();
		lectureClavier.close();

		// Si la méthode retourne une valeur, celle-ci doit être du même type
		// que celui déclaré dans la signature de la méthode
		return nom;
	}
	
	public static void afficherBonjour(String nom) {
		System.out.println(MSG_HELLO + " " + nom);
	}

}