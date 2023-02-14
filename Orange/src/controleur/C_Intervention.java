package controleur;

import java.util.ArrayList;
import java.util.Scanner;

import modele.ModeleIntervention;
import view.VueIntervention;

public class C_Intervention {
	public static void insertIntervention ()
	{
		//instancier un Intervention
		Intervention uneIntervention;
		//saisir ses informations
		uneIntervention = VueIntervention.saisirIntervention();
		//insérer dans la base de données
		ModeleIntervention.insertIntervention(uneIntervention);
		System.out.println("Insertion réussie dans la base de données");
	}
	public static void listerInterventions()
	{
		//on instancie une ArrayList qui récupère les Interventions de la base 
		ArrayList<Intervention> lesInterventions = ModeleIntervention.selectAllInterventions();
		//on parcours l'ArrayList et on affiche les Interventions un par un
		for(Intervention uneIntervention : lesInterventions)
		{
			System.out.println("_____Intervention SUIVANT_____");
			VueIntervention.afficher(uneIntervention);
		}
	}
	public static void supprimerIntervention ()
	{
		//on saisit l'id du Intervention
		int idIntervention;
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner ID Intervention à supprimer : ");
		idIntervention = sc.nextInt();
		//on le supprime de la base de donnée
		ModeleIntervention.deleteIntervention(idIntervention);
		System.out.println("Suppression réussie du Intervention. ");
	}
	public static void modifierIntervention()
	{
		//on demande l'id du Intervention à modifier
		int idIntervention;
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner ID Intervention à modifier : ");
		idIntervention = sc.nextInt();
		//on recherche le Intervention dans la base de données
		Intervention uneIntervention = ModeleIntervention.selectWhereIntervention(idIntervention);
		//on réalise la modification 
		uneIntervention = VueIntervention.modifier(uneIntervention);
		//on update le Intervention dans la base
		ModeleIntervention.updateIntervention(uneIntervention);
		System.out.println("Modification réussie. ");
	}
	public static void menuInterventions () {
		int choix = 0;
		Scanner sc = new Scanner (System.in);
		
		do{
			System.out.println("________MENU Intervention________");
			System.out.println("1- Ajout d'une Intervention");
			System.out.println("2- Lister les Interventions ");
			System.out.println("3- Supprimer une Intervention ");
			System.out.println("4- Modifier une Intervention ");
			System.out.println("0- Quitter");
			System.out.println("Votre choix :");
			choix = sc.nextInt();
			switch(choix) {
			case 1 : insertIntervention();break;
			case 2 : listerInterventions();break;
			case 3 : supprimerIntervention();break;
			case 4 : modifierIntervention();break;
			}
		}while (choix!=0);
	}
}
