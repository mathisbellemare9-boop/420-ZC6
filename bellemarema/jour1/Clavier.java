package bellemarema.jour1;

import java.util.Scanner;

public class Clavier {
public static void main(String[] args) {
        String variableTemporaire;
        int intTemporaire;
        Scanner lectureClavier = new Scanner(System.in);

        variableTemporaire = lectureClavier.nextLine();
        lectureClavier.close();

        intTemporaire = lectureClavier.nextInt();
        lectureClavier.close();

    }
}
