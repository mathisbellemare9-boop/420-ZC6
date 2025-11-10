package bellemarema.jour3;



public class ProbTableau4 {
    

    public static void main(String[] args) {

        int [] tableau = new int[5];
        int Minimum; 
        int Maximum;
        int valeurMinimal =1;
        int valeurMaximal =100;

        
        for (int i = 0; i < tableau.length; i++) {
			tableau[i] = valeurMinimal + (int) (Math.random()*(valeurMaximal));
        }

        Minimum = tableau[0];
        Maximum = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
			if (tableau[i] < Minimum) {
				Minimum = tableau[i];
			}
			if (tableau[i] > Maximum) {
				Maximum = tableau[i];
			}
		}
        for(int i = 0; i < tableau.length; i++) {
			System.out.println(" tableau["+i+"] = " + tableau[i]);
		}
        System.out.println("La valeur minimal est de: " + Minimum);
        System.out.println("La valeur maximal est de :" + Maximum);
    }
}
