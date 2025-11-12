public class examenJavaPartie4Question8a11 {
    public static void main(String[] args) {

        // Tableaux initiaux
        String[] tab_ville = {"Le Caire", "New York", "Paris", "Calcutta", "Barcelone", "Manille", "Montréal", "Hong Kong"};
        double[] tab_superficie = {210, 1214, 105.4, 185, 100.4, 38.55, 363.52, 1104};
        int[] tab_population = {8452409, 8391881, 2211297, 4580544, 1621537, 1660714, 1667700, 7018636};

        // Calcul de densité
        double[] tab_densite = new double[tab_ville.length];
        for (int i = 0; i < tab_ville.length; i++) {
            tab_densite[i] = tab_population[i] / tab_superficie[i];
        }

        // En-tête
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Ville", "Superficie (km²)", "Population", "Densité (hab/km²)");
        System.out.println("--------------------------------------------------------------------------");

        // Affichage complet
        for (int i = 0; i < tab_ville.length; i++) {
            System.out.printf("%-15s %-15.2f %-15d %-15.2f%n",
                    tab_ville[i], tab_superficie[i], tab_population[i], tab_densite[i]);
        }
    }
}
