package bellemarema.jour2;
import java.util.Scanner;
public class Prob3 {
  
 
    private static char oldChar;

    //création de la variable phrase
    public static void main(String[] args ){
       Scanner getPhrase = new Scanner(System.in);
      String sPhrase = taperPhrase(getPhrase);

       int iCompteur = compterLettre(sPhrase);
       System.out.println("Il y a "+ iCompteur + "A.");

       remplacerLettre(sPhrase);        

    }

    public static String taperPhrase(Scanner getPhraseScanner){
      System.out.print("Entrer votre phrase : ");
      String sTemp = getPhraseScanner.nextLine();
      System.out.println(sTemp.toUpperCase());
      return sTemp;

    }
    
    public static int compterLettre(String sPhrase){
      int iTemps=0;
      for (int i=0; i < sPhrase.length(); i++){
        if (sPhrase.charAt(i) == 'a') {
          iTemps++;
        }
      }
      return iTemps;
    }

    public static void remplacerLettre(String sPhrase){
      System.out.println(sPhrase.replace('a',  '$' ));
    }
}
