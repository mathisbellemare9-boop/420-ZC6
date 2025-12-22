import java.util.Scanner;

public class TP3 {

    // tableau à double entrée (max 100 livres)
    // 0 = titre
    // 1 = auteur
    // 2 = categorie
    // 3 = annee (int)
    // 4 = reserve (true/false)
    // 5 = nom utilisateur
    static Object[][] livres = new Object[100][6];
    static int nbLivres = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choix = -1;

        while (choix != 0) {
            afficherMenu();
            choix = lireInt();

            switch (choix) {
                case 1: ajouterLivre(); break;
                case 2: afficherLivres(); break;
                case 3: rechercherLivre(); break;
                case 4: supprimerLivre(); break;
                case 5: afficherParCategorie(); break;
                case 6: reserverLivre(); break;
                case 7: retournerLivre(); break;
                case 0: System.out.println("Bye!"); break;
                default: System.out.println("Option invalide"); break;
            }
        }
    }

    // MENU --------------------------------------------------------

    public static void afficherMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Ajouter un livre");
        System.out.println("2. Afficher tous les livres");
        System.out.println("3. Rechercher un livre");
        System.out.println("4. Supprimer un livre");
        System.out.println("5. Afficher par catégorie");
        System.out.println("6. Réserver un livre");
        System.out.println("7. Retourner un livre");
        System.out.println("0. Quitter");
        System.out.print("Choix : ");
    }

    // OUTILS --------------------------------------------------------

    public static int lireInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }

    public static int trouverLivre(String titre) {
        for (int i = 0; i < nbLivres; i++) {
            if (livres[i][0].toString().equalsIgnoreCase(titre)) {
                return i;
            }
        }
        return -1;
    }

    // 1. AJOUTER --------------------------------------------------------

    public static void ajouterLivre() {
        System.out.println("Titre : ");
        String titre = sc.nextLine();

        if (trouverLivre(titre) != -1) {
            System.out.println("Ce livre existe déjà!");
            return;
        }

        System.out.println("Auteur : ");
        String auteur = sc.nextLine();

        System.out.println("Catégorie : ");
        String cat = sc.nextLine();

        System.out.println("Année : ");
        int annee = lireInt();

        livres[nbLivres][0] = titre;
        livres[nbLivres][1] = auteur;
        livres[nbLivres][2] = cat;
        livres[nbLivres][3] = annee;
        livres[nbLivres][4] = false; // pas réservé
        livres[nbLivres][5] = "";    // personne

        nbLivres++;

        System.out.println("Livre ajouté!");
    }

    // 2. AFFICHER --------------------------------------------------------

    public static void afficherLivres() {
        if (nbLivres == 0) {
            System.out.println("Aucun livre.");
            return;
        }

        for (int i = 0; i < nbLivres; i++) {
            System.out.println((i+1) + ". " + livres[i][0] + " - " + livres[i][1] +
                    " | Catégorie: " + livres[i][2] +
                    " | Année: " + livres[i][3] +
                    ( (boolean)livres[i][4] ? " | RÉSERVÉ par " + livres[i][5]
                                            : " | Disponible"));
        }
    }

    // 3. RECHERCHER --------------------------------------------------------

    public static void rechercherLivre() {
        System.out.print("Titre : ");
        String t = sc.nextLine();

        int pos = trouverLivre(t);

        if (pos == -1) {
            System.out.println("Introuvable.");
        } else {
            System.out.println("Trouvé : " + livres[pos][0] + " (" + livres[pos][2] + ")");
        }
    }

    // 4. SUPPRIMER --------------------------------------------------------

    public static void supprimerLivre() {
        System.out.print("Titre : ");
        String t = sc.nextLine();

        int pos = trouverLivre(t);

        if (pos == -1) {
            System.out.println("Livre inexistant.");
            return;
        }

        // décaler vers le haut
        for (int i = pos; i < nbLivres - 1; i++) {
            livres[i] = livres[i + 1];
        }

        nbLivres--;
        System.out.println("Livre supprimé.");
    }

    // 5. AFFICHER PAR CATÉGORIE --------------------------------------------------------

    public static void afficherParCategorie() {
        System.out.print("Catégorie : ");
        String c = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < nbLivres; i++) {
            if (livres[i][2].toString().equalsIgnoreCase(c)) {
                System.out.println(livres[i][0] + " - " + livres[i][1]);
                found = true;
            }
        }

        if (!found) System.out.println("Rien trouvé.");
    }

    // 6. RÉSERVER --------------------------------------------------------

    public static void reserverLivre() {
        System.out.print("Titre à réserver : ");
        String t = sc.nextLine();

        int pos = trouverLivre(t);

        if (pos == -1) {
            System.out.println("Inexistant.");
            return;
        }

        if ((boolean)livres[pos][4] == true) {
            System.out.println("Déjà réservé.");
            return;
        }

        System.out.print("Nom utilisateur : ");
        String u = sc.nextLine();

        livres[pos][4] = true;
        livres[pos][5] = u;

        System.out.println("Réservé!");
    }

    // 7. RETOURNER --------------------------------------------------------

    public static void retournerLivre() {
        System.out.print("Titre : ");
        String t = sc.nextLine();

        int pos = trouverLivre(t);

        if (pos == -1) {
            System.out.println("Inexistant.");
            return;
        }

        if ((boolean)livres[pos][4] == false) {
            System.out.println("Pas réservé.");
            return;
        }

        livres[pos][4] = false;
        livres[pos][5] = "";

        System.out.println("Livre retourné.");
    }
}

