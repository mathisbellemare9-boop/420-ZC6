package bellemarema.jour3;

public class ProbTableau5 {

    public static void main(String[] args) {
        int [] tableau = new int[10];
        int longeurTableau;
        int valeurNbrTableau;

        for (int i = 0; i < tableau.length; i++) {
			tableau[i] = (int) (Math.random()*100);
		}

        System.out.println("Avant");
        afficherTableau(tableau);

        longeurTableau= tableau.length-1;

        for(int i = 0; i < tableau.length/2; i++ ){
            valeurNbrTableau = tableau[i];
			tableau[i] = tableau[longeurTableau];
			tableau[longeurTableau] = valeurNbrTableau; 
			
			longeurTableau--;
        }

        System.out.println("Après");
        afficherTableau(tableau);

    }

    public static void afficherTableau(int[] pTab)
	{
		
		System.out.println(" ------" );
		for(int i = 0; i < pTab.length; i++) {
			System.out.println(" tableau["+i+"] = " + pTab[i]);
		}
		
		
	}
}
