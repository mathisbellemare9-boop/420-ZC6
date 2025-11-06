package bellemarema.at01;

public class Tableau {
    public static void main(String[] args){
        // Création d'un tableau 2D de 3 lignes et 3 colonnes

        int[][] tableau = new int[3][3];
        // Remplissage du tableau avec les nombre de 1 à 9
        int valeur = 1;
        for (int i =0; i <3; i++) {
            for (int j = 0;j <3; j++){
                tableau[i][j] = valeur++;
            }
        }

        // Affichage du tableau 
        for (int i = 0; i <3; i++) {
            for (int j =0; j < 3; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println(); // Passage à la ligne suivante
        }
    }

}
