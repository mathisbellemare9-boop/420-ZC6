package bellemarema.TravauxPratique;

import java.util.Scanner;

public class TP1 {
    static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        int choix;

        System.out.println("TRAVAIL PRATIQUE #1 - Mathis Bellemare");
        System.out.println("--------------------------------------");
        System.out.println();


        int randomNum = (int) (Math.random() * 21); // 0 a 20
        int NumUtilisateur=0;
        int NbrChance=7;
        

        do {
            System.out.println("Veuiller choisir une option parmit les trois!");
            System.out.println("1) Transformer $$$ en monnaie");
            System.out.println("2) Jeu trouver un nombre mystère");
            System.out.println("3) Quitter");
            System.out.println();
            System.out.print("Choix :");
            choix = scanner.nextInt();
        } while (choix != 1 && choix != 2 && choix != 3);

        if (choix == 1) {
            System.out.println("bravo vous avez sélectionenr le choix 1");            
        } else if (choix == 2) {
           
            do{ 
                System.out.println("Entrer un nombre pour essayer d'Avoir le même nombre que l'ordinateur");
                System.out.println("" +randomNum);            
                NumUtilisateur=scanner.nextInt();
                
                if (NumUtilisateur> randomNum) {
                    System.out.println("votre nombre est plus grand que le nombre aléatoire");
                }else{
                    System.out.println("votre nombre est plus petit que le nombre aléatoire");
                }
                NbrChance--;
                System.out.println(" il vous reste "+NbrChance +" chance pour trouver le nombre");

            } while (NumUtilisateur != randomNum && NbrChance==0);




        } else {
            System.out.println("Au revoir!");
            return;
        }

    }

}
