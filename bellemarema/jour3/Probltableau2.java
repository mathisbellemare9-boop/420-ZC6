package bellemarema.jour3;

import java.util.Scanner;

public class Probltableau2 {
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[] reals = new double[10];
    
        System.out.println("Veuillez entrer 10 nombres réels :");
         for (int i = 0; i < reals.length; i++) {
            System.out.print("Entrez le nombre réel " + (i + 1) + ": ");
            reals[i] = scanner.nextDouble();  // Lire le nombre réel saisi par l'utilisateur
        }
         System.out.println("\nContenu du tableau :");
        for (int i = 0; i < reals.length; i++) {
            System.out.println("Nombre réel " + (i + 1) + ": " + reals[i]);
        }
        scanner.close();

    }
    
}
