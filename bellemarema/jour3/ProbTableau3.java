package bellemarema.jour3;

import java.util.Scanner;

public class ProbTableau3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int [] tab = new int[5];
        int [] tabInverser = new int[5];
       
        for (int i = 0; i < tab.length; i++) {
			tab[i] = (int) (Math.random()*100);

            
		}
        
		for (int i = 0; i <tab.length; i++) {
			tabInverser[(tabInverser.length-1)-i] = tab[i];
		}

        for(int i = 0; i < tab.length; i++) {
			System.out.println(" tableau["+i+"] = " + tab[i]);
		}
		
		for(int i = 0; i < tabInverser.length; i++) {
			System.out.println(" tabInverser["+i+"] = " + tabInverser[i]);
		}
		
    }
}
