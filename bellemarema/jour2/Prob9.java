package bellemarema.jour2;

import java.util.Scanner;

public class Prob9 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // création des variable

        double rayon;
        double resultat;

        System.out.println("Veuillez entrer un rayon");
        rayon= scanner.nextDouble();

        resultat = circonference(rayon);

        String resultatFormat = String.format("%.4f", resultat);
         
        System.out.println("La circonference du cercle pour un rayon de " + rayon + " est d'environ " +resultatFormat);

    }

     public static double circonference(double dRayon){
        double resultat;

        resultat=dRayon *2* Math.PI;
        return resultat;
     }


}
