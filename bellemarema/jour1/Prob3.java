package bellemarema.jour1;
import java.util.Scanner;

public class Prob3 {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg) {
    
     int age1=lire();
     int age2=lire();
     double moyenne=calculer((age1+age2)/2); 
     afficher(""+moyenne);
         scanner.close();
         comparer(age1, age2);
      
}
  public static int lire(){

            
            afficher("enter your age: ");
            int age = scanner.nextInt();
            
            
            return age;
       

   
    }
    public static void comparer(int age1, int age2){
        
  if (age1>age2) {
            afficher("L'âge de la première personne est la plus grande");
        }else{
            afficher("L'âge de la deuxième personne est la plus grande" );
        }
    }
    public static double  calculer(double  moyenne){
    afficher("la moyenne d'âge des deux personne est de"+ moyenne );
      return moyenne;
    }

         public static void afficher(String message){
            System.out.println(message);
         }
    }

