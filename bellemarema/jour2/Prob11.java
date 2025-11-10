package bellemarema.jour2;

import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre entier pour calculer sa factorielle : ");
        int nombre = scanner.nextInt();

        // Vérifier si l'utilisateur a entré un nombre négatif
        if (nombre < 0) {
            System.out.println("La factorielle ne fonctionne qu'avec des nombre entier positif.");
        } else {
            // Appeler la méthode pour calculer la factorielle et afficher le résultat
            long factorielle = calculerFactorielle(nombre);
            System.out.println("La factorielle de " + nombre + " est : " + factorielle);
        }

        scanner.close();
    }
    public static long calculerFactorielle(int n) {
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i; // Multiplie le résultat par i à chaque itération
        }
        return resultat;
    }
    


        


}
