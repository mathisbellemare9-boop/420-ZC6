package bellemarema.jour1;
import java.util.Scanner;
public class prob6 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int typePlancher;
        double longueur;
        double largeur;
		double surface;
		double prixPlancher;

        final double prixChene=5.0;
        final double prixErable=12.0;
        final double prixPin=10.0;

        String nomClient;

        System.out.println("Bienvenue a l'entreprise BoisFranc");

        System.out.println("Veuillez sélectionner le type de plancher que achetere");
        System.out.println();
        System.out.println("Type de plancher (1-Chene, 2-erable, 3-Pin): ");
        typePlancher=scanner.nextInt();
        scanner.nextLine();

        if (typePlancher ==1 || typePlancher ==2 || typePlancher ==3 ) {
            System.out.println();
            System.out.println("entrer votre nom");
            nomClient=scanner.nextLine();
            

            System.out.println("entrer la longueur desirer");
            longueur=scanner.nextDouble();

            System.out.println("entrer la largeur desirer");
            largeur=scanner.nextDouble();

            surface= largeur*longueur;

            if (typePlancher==1) {
                prixPlancher=surface*prixChene;
            }else if (typePlancher==2) {
                prixPlancher=surface*prixErable;
            }else{
                prixPlancher=surface*prixPin;
            }
            System.out.println("Bonjours " +nomClient);
            System.out.println("la surface du plancher a recourvrir est de " +surface);
            System.out.println("cela vous contera "+prixPlancher+ "$" );

        }else{
            System.out.println("Vous n'avez pas choisit le bon type de plancher");
            return;
        }




    }
}
