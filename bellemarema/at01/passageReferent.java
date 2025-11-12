public class passageReferent {

    public static void main(String[] args) {
        int[] tableau = {1,2,3};
        changerValeur(tableau);
        System.out.println(tableau[0]); //affchier 99, car le talbeau à été modifier
    }

    public static void changerValeur(int [] tab){
        tab[0] = 99;
    }
}
