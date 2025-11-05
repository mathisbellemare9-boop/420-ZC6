package bellemarema.jour1;
import java.util.Scanner;

 public class Prob1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int nbun=lire(scanner);
     int nbdeux=lire(scanner);
         scanner.close();
         comparer(nbun, nbdeux);
      
 }
  public static int lire(Scanner scanner){

            
            afficher("enter a numbrer: ");
            int nb = scanner.nextInt();
            
            
            return nb;
       

   
    }
    public static void comparer(int nbun, int nbdeux ){
  if (nbun>nbdeux) {
            afficher("La valeur nbun est la plus grande nbun=" + nbun);
        }else{
            afficher("La valeur y est la plus grande nbdeux="+ nbdeux);
        }
    }

         public static void afficher(String message){
            System.out.println(message);
         }
    }

