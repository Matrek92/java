package controleur;

import java.util.ArrayList;
import java.util.Scanner;

import modele.ModeleClient;
import view.VueClient;

public class C_Client {	
	
		public static void insertClient ()
		{
			//instancier un client
			Client unClient;
			//saisir ses informations
			unClient = VueClient.saisirClient();
			//insérer dans la base de données
			ModeleClient.insertClient(unClient);
			System.out.println("Insertion réussie dans la base de données");
		}
		public static void listerClients()
		{
			//on instancie une ArrayList qui récupère les clients de la base 
			ArrayList<Client> lesClients = ModeleClient.selectAllClients();
			//on parcours l'ArrayList et on affiche les clients un par un
			for(Client unClient : lesClients)
			{
				System.out.println("_____CLIENT SUIVANT_____");
				VueClient.afficher(unClient);
			}
		}
		public static void supprimerClient ()
		{
			//on saisit l'id du client
			int idclient;
			Scanner sc = new Scanner (System.in);
			System.out.println("Donner ID client à supprimer : ");
			idclient = sc.nextInt();
			//on le supprime de la base de donnée
			ModeleClient.deleteClient(idclient);
			System.out.println("Suppression réussie du client. ");
		}
		public static void modifierClient()
		{
			//on demande l'id du client à modifier
			int idclient;
			Scanner sc = new Scanner (System.in);
			System.out.println("Donner ID client à modifier : ");
			idclient = sc.nextInt();
			//on recherche le client dans la base de données
			Client unClient = ModeleClient.selectWhereClient(idclient);
			//on réalise la modification 
			unClient = VueClient.modifier(unClient);
			//on update le client dans la base
			ModeleClient.updateClient(unClient);
			System.out.println("Modification réussie. ");
		}
		public static void menuClients () {
			int choix = 0;
			Scanner sc = new Scanner (System.in);
			
			do{
				System.out.println("________MENU CLIENT________");
				System.out.println("1- Ajout d'un client");
				System.out.println("2- Lister les clients ");
				System.out.println("3- Supprimer un client ");
				System.out.println("4- Modifier un client ");
				System.out.println("0- Quitter");
				System.out.println("Votre choix :");
				choix = sc.nextInt();
				switch(choix) {
				case 1 : insertClient();break;
				case 2 : listerClients();break;
				case 3 : supprimerClient();break;
				case 4 : modifierClient();break;
				}
			}while (choix!=0);
		}
}
