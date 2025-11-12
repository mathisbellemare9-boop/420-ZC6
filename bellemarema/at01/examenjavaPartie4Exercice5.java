public class examenjavaPartie4Exercice5 {
    
      public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tab2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        ajouterCube(tab1, tab2);

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }

    }
    public static void ajouterCube(int[] tab1, int[] tab2) {
        for (int i = 0; i < tab1.length; i++) {
            // Utilisation de Math.pow et du casting int
            tab1[i] = tab1[i] + (int) Math.pow(tab2[i], 3);
        }
    }

 
}
