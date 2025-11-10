

public class ProbTable8 {
    public static void main(String[] args) {
        
        String tableauEtudiant[]={"Pierre","Andre", "Julie", "Brigitte", "Anne", "Olivier", "Simon", "Nadine"};
        
		int tableauTp1[] = {65, 78, 43, 82, 76, 91, 71, 96};
		int tableauTp2[] = {45, 55, 67, 89, 100, 95, 92, 81};
		int tableauExamen1[] = {34, 65, 21, 67, 75, 54, 69, 54};
		
		double tableauMoyenneEtudiante [] = new double[8];
		double tableauMoyenneEvaluation [] = new double[3];
		
		tableauMoyenneEvaluation[0] = moyEval(tableauTp1);
		tableauMoyenneEvaluation[1] = moyEval(tableauTp2);
		tableauMoyenneEvaluation[2] = moyEval(tableauExamen1);

        for (int i = 0; i < tableauEtudiant.length; i++)
		{
			tableauMoyenneEtudiante[i] = moyEtu(tableauTp1[i], tableauTp2[i], tableauExamen1[i]);
		}

		
		afficherMoy(tableauMoyenneEvaluation[0], "TP 1");
		afficherMoy(tableauMoyenneEvaluation[1], "TP 2");
		afficherMoy(tableauMoyenneEvaluation[2], "Examen 1");

		System.out.println();
		System.out.println("Resultalts des etudiants:");
		System.out.println("-----------------------");
		
		for (int i = 0; i < tableauEtudiant.length; i++)
		{
			afficherMoy(tableauMoyenneEtudiante[i], tableauEtudiant[i]);
		}
	}

	public static double moyEval(int pTab[])
	{
		double moyenne = 0;
		int somme = 0;
		
		for (int i = 0 ; i< pTab.length; i++)
		{
			somme += pTab[i];
		}
		moyenne = somme / pTab.length;
		
		return moyenne;
	}
	
	public static double moyEtu(int pNoteTp1, int pNoteTp2, int pNoteExa1 )
	{
		double moyenne;
		moyenne = (pNoteTp1 + pNoteTp2 + pNoteExa1) / 3;
		return moyenne;
	
	}
	
	public static void afficherMoy(double pEval, String pNomEval)
	{
		System.out.println(pNomEval + ": " + pEval);
		
	}
}

