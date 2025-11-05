package bellemarema.jour1;

import java.util.Scanner;
public class Prob5 {
    static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {  
        
         double pourcentRabais=0.25;
         double  montant=lire("entrer votre montant ");
         double  rabais=calculer(montant*pourcentRabais); 
         double total=(montant-rabais);
         
         afficher(""+rabais);
         afficher(""+total );        
         scanner.close();           
         
            
 }
  public static double  lire(String message){

            afficher(message);
            
            double  nb = scanner.nextDouble();         
            return nb;

       

   
    }
    public static double calculer(double  rabais){
     
      return rabais;
    }

         public static void afficher(String message){
            System.out.println(message);
         }
 
}
