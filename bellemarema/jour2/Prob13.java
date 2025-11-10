package bellemarema.jour2;

import java.util.Scanner;

public class Prob13 {
   static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char choix;
        double temperature;
        double fahrenheit;
        double  celsius;

        System.out.println("Veuillez choisir la conversion que vous voulez utiliser");
        System.out.println();
        System.out.println("C pour Celsius convertie en Fahrenheit ");
        System.out.println("F pour Fahrenheit convertie en Celsius");
        System.out.print("Choix :");
        choix = scanner.next().charAt(0);
        
        System.out.println("Veuiller entrer la temperature que vous voulez convertir :");
        temperature=scanner.nextDouble();

        if (choix =='C' || choix =='c') {
              fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f°C = %.2f°F", temperature, fahrenheit);
        } else if (choix == 'F' || choix == 'f') {
             celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f°F = %.2f°C", temperature, celsius);
        } else {
            System.out.println("Choix invalide. Veuillez entrer 'C' ou 'F'.");
        }

        scanner.close(); // Fermer le scanner
        }
         // Méthode pour convertir Celsius en Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

     
}

