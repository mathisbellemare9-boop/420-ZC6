package bellemarema.jour2;
import java.util.Scanner;
public class Prob4 {
    static Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
     int nombre=0;
    
     do{
        System.out.println("veuillez entrez un nombre entre 0 et 100");
        nombre = scanner.nextInt();
     }while(nombre<0 || nombre>100);
    }      
        

        




 
}
