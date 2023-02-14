package controleur;

import java.util.ArrayList;
import java.util.Scanner;

import modele.ModeleTechnicien;
import view.VueTechnicien;

public class C_Technicien {
	public static void insertTechnicien ()
	{
		//instancier un Technicien
		Technicien unTechnicien;
		//saisir ses informations
		unTechnicien = VueTechnicien.saisirTechnicien();
		//insérer dans la base de données
		ModeleTechnicien.insertTechnicien(unTechnicien);
		System.out.println("Insertion réussie dans la base de données");
	}
	public static void listerTechniciens()
	{
		//on instancie une ArrayList qui récupère les Techniciens de la base 
		ArrayList<Technicien> lesTechniciens = ModeleTechnicien.selectAllTechniciens();
		//on parcours l'ArrayList et on affiche les Techniciens un par un
		for(Technicien unTechnicien : lesTechniciens)
		{
			System.out.println("_____Technicien SUIVANT_____");
			VueTechnicien.afficher(unTechnicien);
		}
	}
	public static void supprimerTechnicien ()
	{
		//on saisit l'id du Technicien
		int idTechnicien;
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner ID Technicien à supprimer : ");
		idTechnicien = sc.nextInt();
		//on le supprime de la base de donnée
		ModeleTechnicien.deleteTechnicien(idTechnicien);
		System.out.println("Suppression réussie du Technicien. ");
	}
	public static void modifierTechnicien()
	{
		//on demande l'id du Technicien à modifier
		int idTechnicien;
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner ID Technicien à modifier : ");
		idTechnicien = sc.nextInt();
		//on recherche le Technicien dans la base de données
		Technicien unTechnicien = ModeleTechnicien.selectWhereTechnicien(idTechnicien);
		//on réalise la modification 
		unTechnicien = VueTechnicien.modifier(unTechnicien);
		//on update le Technicien dans la base
		ModeleTechnicien.updateTechnicien(unTechnicien);
		System.out.println("Modification réussie. ");
	}
	public static void menuTechniciens () {
		int choix = 0;
		Scanner sc = new Scanner (System.in);
		
		do{
			System.out.println("________MENU Technicien________");
			System.out.println("1- Ajout d'un Technicien");
			System.out.println("2- Lister les Techniciens ");
			System.out.println("3- Supprimer un Technicien ");
			System.out.println("4- Modifier un Technicien ");
			System.out.println("0- Quitter");
			System.out.println("Votre choix :");
			choix = sc.nextInt();
			switch(choix) {
			case 1 : insertTechnicien();break;
			case 2 : listerTechniciens();break;
			case 3 : supprimerTechnicien();break;
			case 4 : modifierTechnicien();break;
			}
		}while (choix!=0);
	}
}
