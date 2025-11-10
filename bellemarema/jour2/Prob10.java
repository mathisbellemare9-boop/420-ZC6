package bellemarema.jour2;

import java.util.Scanner;

public class Prob10 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // création des variable

        int nbr1;
        int nbr2;

        int resultat;
        
        

        System.out.println("Entrer le premier nombre: ");
        nbr1= scanner.nextInt();

        System.out.println("Entrer le deuxième nombre: ");
        nbr2= scanner.nextInt();

        resultat= plusGrand(nbr1,nbr2);
        System.out.println("Le nombre le plus grand est: " + resultat);



    }

    public static int plusGrand(int nbr1, int nbr2){
        if (nbr1> nbr2) {
            return nbr1;
        } else{
            return nbr2;
        }
    }
}
