package bellemarema.at01;

public class Comparer {
 public static void main(String[] args) {
    deuxNombre(5, 4);
 }

// cette methode retourne 0 si x est plus grand....
public static int deuxNombre(int x, int y){

    if(x>y){
        return 0;

    }else if (y<x) {
        return 1;
    }
    
    return 2;

 }
}
