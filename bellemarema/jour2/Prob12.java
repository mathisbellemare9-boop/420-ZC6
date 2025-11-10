package bellemarema.jour2;

import java.util.Scanner;

public class Prob12 {
    static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            int nbrMax;
            int nbrMin;
            int somme;

            System.out.println("entrer un nombre Minimal: ");
            nbrMin= scanner.nextInt();

             System.out.println("entrer un nombre Maximal: ");
            nbrMax= scanner.nextInt();

            if (nbrMin> nbrMax) {
                System.out.println( "Erreur: La valeur Minimal doit être plsu petite que la valeur Maximal");

            }else{
                somme=sommeMinMax(nbrMin,nbrMax);
                System.out.println("La somme des valeur entre la valeur Minimal " +nbrMin+ " et la valeur Maximal "+ nbrMax + " est de: "+somme);
            }
            scanner.close();
 
        }
          public static int sommeMinMax(int min, int max) {
        int somme = 0;

        // Calculer la somme des nombres entre min et max inclus
        for (int i = min; i <= max; i++) {
            somme += i;
        }

        return somme;
    }
}
