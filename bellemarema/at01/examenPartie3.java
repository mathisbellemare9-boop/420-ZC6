public class examenPartie3 {

    public static void main(String[] args) {
        int tableau[] = {-36, 27, 7, 8, -21, -1, -14, -29, -27, 10};
        int sommeX = 0;
        int sommeY = 0;
        int z = 0;

        for (int i = 0; i < tableau.length; i++){
            if (tableau[i] % 2 ==0) {
                sommeX = sommeX + tableau[i];
                if (i != 0) {
                    z =(int)(sommeX / i);
                }
            }else{
                sommeY = sommeY + tableau[i];
                z = sommeY % i;
            }
        }
    }
}
