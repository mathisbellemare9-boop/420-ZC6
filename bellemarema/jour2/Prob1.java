package bellemarema.jour2;
import java.util.Scanner;
public class Prob1 {
 static Scanner scanner = new Scanner(System.in);
 
    //création de la variable phrase
    public static void main(String[] args ){
        

        String phrase=lire("Entrer une phrase pour qu'elle se transforme Majuscule");
         afficher(phrase);

     }   
     //enregistre ce que l'utilisateur écrit et le retourne dans la variable phrase
     public static String lire(String message){
        String phrase;
            
        afficher(message);
            

            phrase =scanner.nextLine(); 
            return phrase.toUpperCase();


            
     }
     public static void afficher(String message){
            System.out.println(message);
         }


}

