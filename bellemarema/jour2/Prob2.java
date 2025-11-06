package bellemarema.jour2;
import java.util.Scanner;
public class Prob2 { 
    static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args ){
    
        //création de la variable phrase
        int unTableau[] = new int[5];
        unTableau[0] =12;
        System.out.println(unTableau[0]);

        String phrase=lire("Entrer une phrase pour savori le nombre de caractère qy'elle contient");
        System.out.println("le nombre de caractère contenue dans votre phrase est de:" + phrase.length());
         afficher(phrase);

     }   
     //enregistre ce que l'utilisateur écrit et le retourne dans la variable phrase
     public static String lire(String message){
        String phrase;
            
        afficher(message);
            

            phrase =scanner.nextLine(); 
            return phrase;


            //methode pour afficher le message
     }
     public static void afficher(String message){
            System.out.println(message);
         }
}
