package bellemarema.jour3;

import java.util.Random;

public class ProbTableau7 {

    public static void main(String[] args) {
        int[] tableau = new int[10];
        Random randomNRandom= new Random();

        for(int i=0; i< tableau.length; i++){
        tableau[i] =randomNRandom.nextInt(5);
        }

        System.out.print("Tableau généré: ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
        
        // Appel de la méthode pour afficher les occurrences
        afficherOccurrences(tableau);
    }

    public static void afficherOccurrences(int[] tableau){
       int[] occurrences = new int[5];

       for(int i =0;i< tableau.length; i++ ){
        occurrences[tableau[i]]++;
       }

        for (int i = 0; i < occurrences.length; i++) {
            System.out.println("Le nombre " + i + " apparaît " + occurrences[i] + " fois.");
        }
    }
}
