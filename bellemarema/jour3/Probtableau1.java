package bellemarema.jour3;

import java.util.Scanner;

public class Probtableau1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mots = new String[5];

        System.out.println("Veuillez entrer 5 mots (chaque mot ne doit pas dépasser 5 caractères) :");
        for (int i = 0; i < mots.length; i++) {
            String mot;
            while (true) {
                System.out.print("Entrez le mot " + (i + 1) + " (maximum 5 caractères) : ");
                mot = scanner.nextLine();  // Lire le mot saisi par l'utilisateur
                // Vérifier la longueur du mot
                if (mot.length() <= 5) {
                    mots[i] = mot;  // Si le mot est valide, l'ajouter au tableau
                    break;  // Sortir de la boucle et passer à l'itération suivante
                } else {
                    System.out.println("Le mot ne doit pas dépaser  5 caractères. Essayez à nouveau.");
                }
            }
        }

         System.out.println("\nContenu du tableau :");
        for (int i = 0; i < mots.length; i++) {
            System.out.println("Mot " + (i + 1) + ": " + mots[i]);
        }
        // Fermer le scanner
        scanner.close();
    }

}
