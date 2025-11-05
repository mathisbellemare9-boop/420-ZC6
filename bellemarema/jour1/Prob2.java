package bellemarema.jour1;

import java.util.Scanner;

 public class Prob2 {
    static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {  
        
          double heureTravailler=lire("entrer votre nombre d'heure travailler c'est deux dernière semaine");
         double  salaireHoraire=lire("entrer votre salaire par heure ");
         double  salaire=calculer(heureTravailler*salaireHoraire); 
         afficher(""+salaire);         
         scanner.close();           
         
            
 }
  public static double  lire(String message){

            afficher(message);
            
            double  nb = scanner.nextDouble();         
            return nb;

       

   
    }
    public static double  calculer(double  salaire){

      return salaire;
    }

         public static void afficher(String message){
            System.out.println(message);
         }
 }

