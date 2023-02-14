package controleur;
import java.util.ArrayList;
import java.util.Scanner;

public class Controleur {
	
public static void main(String args[])
	{
		int choix = 0;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("_____Gestion de Orange_____");
			System.out.println("1- Gérer les clients");
			System.out.println("2- Gérer les techniciens");
			System.out.println("3- Gérer les interventions");
			System.out.println("0- Quitter");
			System.out.println("Votre choix :");
			choix = sc.nextInt();
			switch(choix) {
			case 1 : C_Client.menuClients();break;
			case 2: C_Technicien.menuTechniciens();break;
			case 3 : C_Intervention.menuInterventions(); break;
			}
		}while(choix!=0);


	}
	
	
}
