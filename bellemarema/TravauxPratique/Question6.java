public class Question6 {
    public static void main(String[] args) {
        int tab[] = new int[6];
        tab[0] = -1;

        traiterTableau(tab);
    }

    public static void traiterTableau(int[] tabX) {
        for (int k = 1; k < tabX.length; k++) {
            tabX[k] = k + 10;
            tabX[0] += tabX[0] + k + 10;
        }

        for (int k = 0; k < 6; k++) {
            if(verifierSiNombrePremier(tabX[k])) {
                System.out.println(tabX[k] + "p");
            }else{
                System.out.println(" " + tabX[k] + " ");
            }
        }
    }

    public static boolean verifierSiNombrePremier(int nombre) {
        boolean estPremier = true;
        
        for (int i =2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                estPremier = false;
               
            }            
        }
        return estPremier;
    }
}
