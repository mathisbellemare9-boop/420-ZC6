package bellemarema.jour3;

public class ProbTableau6 {

    public static void main(String[] args) {
        int tableau[] = {-65, -34, 7, -3, -43, 14, 23, -9, 45, 11};
        int sommeNegatif = 0;
        int sommePositif = 0;
        int tableau2[]  = new int[10];
        int valeurMinimal = -100;
        int valeurMaximal = 100;

        System.out.println("Numero A");
        System.out.println("---------");


        for(int i = 0; i < tableau.length; i++) {
			System.out.println(" tableau["+i+"] = " + tableau[i]);
		}

        for(int i = 0; i < tableau.length; i++){
            if (tableau[i] < 0) {
                sommeNegatif = sommeNegatif + tableau[i];
            }else{
                sommePositif = sommePositif + tableau[i];
            }
        }

        System.out.println("la valeur des sommes Négatives est de: "+sommeNegatif);
        System.out.println("la valeur des sommes Positives est de: "+sommePositif);


    //Tableau 2 numero B

        sommeNegatif = 0;
        sommePositif = 0;

        System.out.println();
        System.out.println("Numero B");
        System.out.println("---------");

        for(int i = 0; i < tableau2.length; i++){
            tableau2[i] = valeurMinimal + (int) (Math.random()* (valeurMaximal*2));           
        }

        for(int i = 0; i < tableau2.length; i++){
            System.out.println(" tableau["+i+"] = " + tableau2[i]);
        }

        for (int i = 0; i < tableau2.length; i++) {
			if (tableau2[i] < 0) {
				sommeNegatif = sommeNegatif + tableau2[i];
			}
			else {
				sommePositif = sommePositif + tableau2[i];
			}
		}
         System.out.println("la valeur des sommes Négatives est de: "+sommeNegatif);
        System.out.println("la valeur des sommes Positives est de: "+sommePositif);
    }
}
