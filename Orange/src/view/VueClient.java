package view;

import java.util.Scanner;

import controleur.Client;

public class VueClient {
	public static Client saisirClient()
	{
		Client unClient;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le nom");
		String nom = sc.next();
		System.out.println("Donner le prenom");
		String prenom = sc.next();
		System.out.println("Donner l'adresse");
		String adresse = sc.next();
		System.out.println("Donner l'email");
		String email = sc.next();
		System.out.println("Donner le téléphone");
		String tel = sc.next();
		unClient = new Client(nom, prenom, email, adresse, tel);
		return unClient;
		
	}
	public static void afficher(Client unClient)
	{
		System.out.println("Id client  : " + unClient.getIdclient());
		System.out.println("Nom client : " + unClient.getNom());
		System.out.println("Prénom     : " + unClient.getPrenom());
		System.out.println("Adresse    : " + unClient.getAdresse());
		System.out.println("Email      : " + unClient.getEmail());
		System.out.println("Téléphone  : " + unClient.getTel());
	}
	public static Client modifier (Client unClient)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Ancien nom : "+unClient.getNom());
		System.out.println("New Nom :");
		unClient.setNom(sc.next());
		
		System.out.println("Ancien prénom : "+unClient.getPrenom());
		System.out.println("New Prénomom :");
		unClient.setPrenom(sc.next());
		
		System.out.println("Ancien Email : "+unClient.getEmail());
		System.out.println("New Email :");
		unClient.setEmail(sc.next());
		
		System.out.println("Ancienne adresse : "+unClient.getAdresse());
		System.out.println("New Adresse :");
		unClient.setAdresse(sc.next());
		
		System.out.println("Ancien téléphone : "+unClient.getTel());
		System.out.println("New Tel :");
		unClient.setAdresse(sc.next());
		return unClient;
		
	}
}
