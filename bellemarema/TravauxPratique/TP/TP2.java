package TP;

import java.util.Scanner;

public class TP2 {
    Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {
    
        String sChoix;
                
        
        String[][] Tblequipe = new String[4][0];
        Tblequipe[0] = new String[]{"Junior de Montral;", "MON"};
        Tblequipe[1] = new String[]{"Remparts de Québec;", "QUE"};
        Tblequipe[2] = new String[]{"Aigles de Laval;", "LAV"};
        Tblequipe[3] = new String[]{"Éperviers de Terrebonne;", "TER"};
         int[][] Tbscores = new int[4][5];
         int[][] TblResultalts = new int[4][1];
         int iCompteur = 0;     
            
      
       
       entrerinformation(TblResultalts, iCompteur);

        System.out.println("Travail Pratique #2 - Mathis Bellemare");
        System.out.println("--------------------------------------");
        System.out.println();

     
 }
    public static void entrerinformation(int[][] pTbsResultats,  int pIcompteur) {
        String sEquipe= "";
        int iBut=0;

      
         
    }

}
