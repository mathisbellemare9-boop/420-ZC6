package bellemarema.at01;

public class tableau2d {


    public static void main(String[] args) {
        
        int x = 0;
        
        System.out.println("x vaut :" + x);

        changerValeur(x);
        
        System.out.println("a la fin x vaut :" + x);

    }

    public static void changerValeur(int y) {

        System.out.println("y vaut x donc vaut :" + y);

        y = 5;
        
        System.out.println("y vaut maintenant :" + y);
        
    }
}


