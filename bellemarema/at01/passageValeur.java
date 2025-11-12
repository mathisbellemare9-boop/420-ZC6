public class passageValeur {

    public static void main(String[] args) {
        int a = 5;
        ajouterUn(a);
        System.out.println(a); // affiche a car x n'est pas utiliser

    }

    public static void ajouterUn(int x){
        x+=1;
    }
}
