


import java.util.Scanner;

public class TP1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choix;

        System.out.println("TRAVAIL PRATIQUE #1 - Mathis Bellemare");
        System.out.println("--------------------------------------");
        System.out.println();

        // --- Boucle principale du programme ---
        do {
            // Affichage du menu
            System.out.println("Veuillez choisir une option parmi les trois!");
            System.out.println("1) Transformer $$$ en monnaie");
            System.out.println("2) Jeu trouver un nombre mystère");
            System.out.println("3) Quitter");
            System.out.println();
            System.out.print("Choix : ");
            choix = scanner.nextInt();
           

            // Vérifie si l'utilisateur entre une valeur valide
            while (choix != 1 && choix != 2 && choix != 3) {
                 System.out.println("Veuiller choisir une option parmit les trois!");
            System.out.println("1) Transformer $$$ en monnaie");
            System.out.println("2) Jeu trouver un nombre mystère");
            System.out.println("3) Quitter");
            System.out.println();
            System.out.print("Choix :");
            choix = scanner.nextInt();
                
            }

            // --- Traite le choix ---
            if (choix == 1) {
                double dMontant= 0; 
                dMontant= enterMontant(dMontant);
                afficherArgent(dMontant);
                System.out.println("\n Vous avez choisi l'option 1 : Transformer $$$ en monnaie");
                // Tu peux mettre ici ton code de transformation
                System.out.println();
            }

            else if (choix == 2) {
                System.out.println("\n Vous avez choisi l'option 2 : Jeu du nombre mystère");
                jouerNombreMystere(); //  Appel d'une méthode séparée
                System.out.println();
            }

            else if (choix == 3) {
                System.out.println("\n Au revoir!");
            }

        } while (choix != 3); //  La boucle recommence tant que l'utilisateur n'a PAS choisi 3

        scanner.close();
    }
    public static double enterMontant(double dMontant){
        System.out.println("entré votre montant d'argent que vous vouller utiliser");
        dMontant=scanner.nextDouble();
        return dMontant;

    }
    public static void afficherArgent(double dMontant) {

    // Tableau à double entrée :
    // [0] = valeur
    // [1] = texte à afficher
    double[][] tabValeurs = {
        {100, 0}, {50, 0}, {20, 0}, {10, 0}, {5, 0},
        {2, 0}, {1, 0}, {0.25, 0}, {0.10, 0}, {0.05, 0}, {0.01, 0}
    };

    String[] tabTexte = {
        "100$", "50$", "20$", "10$", "5$",
        "2$", "1$", "0.25$", "0.10$", "0.05$", "0.01$"
    };

    String sMessage = "";

    for (int i = 0; i < tabValeurs.length; i++) {
        int iCompteur = 0;

        while (dMontant >= tabValeurs[i][0]) {
            dMontant -= tabValeurs[i][0];
            dMontant = Math.round(dMontant * 100.0) / 100.0; // évite les erreurs décimales
            iCompteur++;
        }

        if (iCompteur > 0) {
            sMessage += iCompteur + "x" + tabTexte[i] + " ";
        }
    }

    System.out.println("vous avez : " + sMessage);
}
    
        
    
    int iCompteur=0;


    // --- Jeu du nombre mystère ---
    public static void jouerNombreMystere() {
        int randomNum = (int) (Math.random() * 21)+1; // 0 à 20
        int numUtilisateur;
        int nbrChances = 7;

        do {
            System.out.print("Entrez un nombre entre 1 et 20 : ");
            
            numUtilisateur = scanner.nextInt();

            if (numUtilisateur > randomNum) {
                System.out.println("Votre nombre est plus grand que le nombre mystère.");
                nbrChances--;
            } else if (numUtilisateur < randomNum) {
                System.out.println("Votre nombre est plus petit que le nombre mystère.");
                nbrChances--;
            } else {
                System.out.println(" Bravo! Vous avez trouvé le nombre mystère!");
                break;
            }

            System.out.println("Il vous reste " + nbrChances + " chance(s).");

        } while (numUtilisateur != randomNum && nbrChances > 0);

        if (nbrChances == 0 && numUtilisateur != randomNum) {
            System.out.println(" Vous avez perdu! Le nombre mystère était : " + randomNum);
        }
    }
}
