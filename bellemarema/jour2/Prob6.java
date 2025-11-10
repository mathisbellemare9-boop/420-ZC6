package bellemarema.jour2;

import java.util.Scanner;

    public class Prob6 {
  
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
		// creation des variable

		int nb;
		int min = 0;
		int max = 0;

		double moyenne = 0;
		int somme = 0;
		int ctr = 0;

		

		do 
		{
			// lecture du nombre
			System.out.println("Entrez un nombre: ");
			nb = scanner.nextInt();

			// faire les calculs  
			if (nb != 0 ) 			
			{
				// affecter le min et le max au nb  
				if (min == 0 && max == 0) {
					min = nb;
					max = nb;
				}

				//  nombre plus petit que le min  
				if (nb < min) 
					min = nb;

				//  nombre plus grand que le max  
				if (nb > max) 
					max = nb;

				//  calcul de la somme et du nombre de valeurs  
				somme = somme + nb;
				ctr++;
			}

		} while (nb != 0);	


		//  calcul de la moyenne  
		moyenne = (double) (somme) / ctr;

		// affichage des resultat 
		System.out.println("Min: "+ min); 
		System.out.println("Max: "+ max); 
		System.out.println("Moyenne: "+ moyenne); 
		System.out.println("Somme: "+ somme); 
		System.out.println("Nombre de chiffres: "+ ctr); 


	}

        
       

 
}
