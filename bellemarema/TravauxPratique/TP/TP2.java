import java.util.Scanner;

public class TP2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Tableau contenant noms complets et codes
        String[][] Tblequipe = new String[4][2];
        Tblequipe[0] = new String[]{"Junior Montreal", "MON"};
        Tblequipe[1] = new String[]{"Remparts Quebec", "QUE"};
        Tblequipe[2] = new String[]{"Aigles Laval", "LAV"};
        Tblequipe[3] = new String[]{"Éperviers Terrebonne", "TER"};

        // Tableau des statistiques PJ, V, D, N, PTS
        int[][] Tblscores = new int[4][5];

        // Tableau contenant tous les matchs (100 max)
        String[][] TblMatchs = new String[100][4];
        int nbMatchs = 0;

        // Entrer les matchs
        nbMatchs = entrerMatchs(Tblequipe, Tblscores, TblMatchs);

        // Calculer les points finals
        calculerPoints(Tblscores);

        // Affichage final
        System.out.println("TRAVAIL PRATIQUE #2 - Mathis Bellemare");
        System.out.println("--------------------------------------");
        System.out.println();

        // Afficher tous les matchs
        afficherMatchs(TblMatchs, nbMatchs);

        // Afficher le classement TRIÉ
        afficherClassement(Tblequipe, Tblscores);
    }


    // -------------------------------------------
    // MÉTHODE 1 : Entrer les résultats des matchs
    // -------------------------------------------
    public static int entrerMatchs(String[][] equipes, int[][] stats, String[][] matchs) {

        String visiteuse, locale;
        int butsVisiteuse, butsLocale;
        String rep = null;
        int nbMatchs = 0;

        do {
            System.out.println("\nÉquipe VISITEUSE (MON/QUE/LAV/TER ou FIN) : ");
            visiteuse = scanner.next().toUpperCase();

            if (visiteuse.equals("FIN")) {
                break;
            }

            int indexVisiteuse = getIndexEquipe(visiteuse, equipes);
            if (indexVisiteuse == -1) {
                System.out.println("Équipe visiteuse invalide.");
                continue;
            }

            System.out.println("Nombre de buts : ");
            butsVisiteuse = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Équipe LOCALE (MON/QUE/LAV/TER) : ");
            locale = scanner.next().toUpperCase();

            int indexLocale = getIndexEquipe(locale, equipes);
            if (indexLocale == -1) {
                System.out.println("Équipe locale invalide.");
                continue;
            }

            if (indexLocale == indexVisiteuse) {
                System.out.println("ERREUR : une même équipe ne peut pas jouer contre elle-même.");
                continue;
            }

            System.out.println("Nombre de buts : ");
            butsLocale = scanner.nextInt();
            scanner.nextLine();

            // Stockage du match
            matchs[nbMatchs][0] = visiteuse;
            matchs[nbMatchs][1] = Integer.toString(butsVisiteuse);
            matchs[nbMatchs][2] = locale;
            matchs[nbMatchs][3] = Integer.toString(butsLocale);
            nbMatchs++;

            // Parties jouées
            stats[indexVisiteuse][0]++;
            stats[indexLocale][0]++;

            // Victoire / défaite / nulle
            if (butsVisiteuse > butsLocale) {
                stats[indexVisiteuse][1]++;
                stats[indexLocale][2]++;
            } else if (butsVisiteuse < butsLocale) {
                stats[indexLocale][1]++;
                stats[indexVisiteuse][2]++;
            } else {
                stats[indexVisiteuse][3]++;
                stats[indexLocale][3]++;
            }

            System.out.println("Continuer ? (O/N)");
            rep = scanner.next();

        } while (rep.equalsIgnoreCase("O"));

        return nbMatchs;
    }


    // -----------------------------------------------------
    // MÉTHODE 2 : Calculer les points de toutes les équipes
    // -----------------------------------------------------
    public static void calculerPoints(int[][] stats) {

        for (int i = 0; i < 4; i++) {
            int victoires = stats[i][1];
            int nulles = stats[i][3];
            stats[i][4] = victoires * 3 + nulles;
        }
    }


    // -------------------------------------
    // MÉTHODE 3 : Afficher tous les matchs
    // -------------------------------------
    public static void afficherMatchs(String[][] matchs, int nbMatchs) {

        System.out.println("Résultat");
        System.out.println("---------");

        for (int i = 0; i < nbMatchs; i++) {
            System.out.println("Équipe visiteuse : " + matchs[i][0]);
            System.out.println("Nombre de buts : " + matchs[i][1]);
            System.out.println("Équipe locale : " + matchs[i][2]);
            System.out.println("Nombre de buts : " + matchs[i][3]);
            System.out.println();
        }

        System.out.println("Équipe visiteuse : FIN\n");
    }


    // -------------------------------------
    // MÉTHODE 4 : Afficher le classement (TRIÉ)
    // -------------------------------------
    public static void afficherClassement(String[][] equipes, int[][] stats) {

        // 🔥 AJOUT : TRI DU CLASSEMENT PAR POINTS (DESC)
        for (int i = 0; i < 4 - 1; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                if (stats[j][4] < stats[j + 1][4]) {

                    // swap stats
                    int[] tmpStats = stats[j];
                    stats[j] = stats[j + 1];
                    stats[j + 1] = tmpStats;

                    // swap equipes
                    String[] tmpEquipes = equipes[j];
                    equipes[j] = equipes[j + 1];
                    equipes[j + 1] = tmpEquipes;
                }
            }
        }

        System.out.println("Classement\n");
        System.out.println("Équipe                PJ  V  D  N  PTS");
        System.out.println("--------------------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.printf("%-20s %2d  %2d  %2d  %2d  %2d%n",
                    equipes[i][0],
                    stats[i][0], stats[i][1], stats[i][2], stats[i][3], stats[i][4]
            );
        }
    }


    // ------------------------------
    // Chercher l’équipe par son code
    // ------------------------------
    public static int getIndexEquipe(String code, String[][] equipes) {
        for (int i = 0; i < 4; i++) {
            if (equipes[i][1].equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }
}
