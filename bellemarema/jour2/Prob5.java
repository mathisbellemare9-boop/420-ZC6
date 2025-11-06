package bellemarema.jour2;

public class Prob5 {

      public static void main(String[] args ){
        String tab[] = {"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        System.out.println("voici l'alphabet de a à z");
        for(int i=0; i<tab.length; i++)
        
      {
        System.out.println(tab[i]);
      }
      System.out.println();
      System.out.println("voici l'alphabet de z à a");
      for(int i=25; i>=0; i--)
      {
        System.out.println(tab[i]);
      }

 }

    
}
