package bellemarema.at01;

public class tableau1 {
public class Tableau {

    public static void main(String[] args) {
        int[] tableau = {1, 2, 3}; // Tableau de départ
        int nouvelElement = 4;
        
        tableau = enleverDernierElement(tableau);

        // Appel de la méthode pour ajouter l'élément
        tableau = ajouterElement(tableau, nouvelElement);

        tableau = enleverPremierElement(tableau);

        // Affichage du tableau mis à jour
        System.out.println("Tableau après modification :");
        for (int element : tableau) {
            System.out.print(element + " ");
        }
    }


    // Méthode qui ajoute un élément à un tableau d'entiers
    public static int[] ajouterElement(int[] tableau, int nouvelElement) {
        // Création d'un nouveau tableau avec une taille augmentée de 1
        int[] nouveauTableau = new int[tableau.length + 1];

        // Copie des éléments de l'ancien tableau vers le nouveau tableau
        for (int i = 0; i < tableau.length; i++) {
            nouveauTableau[i] = tableau[i];
        }

        // Ajout du nouvel élément à la fin du nouveau tableau
        nouveauTableau[tableau.length] = nouvelElement;

        return nouveauTableau;
    }

    // Méthode qui enlève le premier élément d'un tableau d'entiers
    public static int[] enleverPremierElement(int[] tableau) {

        // Création d'un nouveau tableau avec une taille réduite de 1
        int[] nouveauTableau = new int[tableau.length - 1];

        // Copie des éléments sauf le premier
        for (int i = 1; i < tableau.length; i++) {
            nouveauTableau[i - 1] = tableau[i];
        }

        return nouveauTableau;
    }
    // Méthode qui enlève le dernier élément d'un tableau d'entiers
    public static int[] enleverDernierElement(int[] tableau) {

        // Création d'un nouveau tableau avec une taille réduite de 1
        int[] nouveauTableau = new int[tableau.length - 1];

        // Copie des éléments sauf le dernier
        for (int i = 0; i < tableau.length - 1; i++) {
            nouveauTableau[i] = tableau[i];
        }

        return nouveauTableau;
    }


}
}
