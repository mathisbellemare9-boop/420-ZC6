package bellemarema.jour1;

import java.util.Scanner;

public class Prob4 {
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int nbnoteEleve=lire(scanner);
     int nbpassage=60;
      scanner.close();
         comparer(nbnoteEleve, nbpassage);
      
 }
  public static int lire(Scanner scanner){

            
            afficher("enter your grade: ");
            int nbun = scanner.nextInt();
            
            
            return nbun;
       
   
    }
    public static void comparer(int nbnoteEleve, int nbpassage){
  if (nbnoteEleve>=nbpassage) {
            afficher("Bravo, vous avez réussi votre cours de maths" );
        }else{
            afficher("Dommage, vous avez échoué votre cours de maths");
        }
    }

         public static void afficher(String message){
            System.out.println(message);
         }
    }

