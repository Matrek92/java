package view;

import java.util.Scanner;

import controleur.Intervention;
import controleur.Technicien;

public class VueIntervention {
	public static Intervention saisirIntervention()
	{
		Intervention uneIntervention;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la description :");
		String description = sc.next();
		System.out.println("Donner la date Intervention :");
		String dateinter = sc.next();
		System.out.println("Donner le prix :");
		float prix = sc.nextFloat();
		System.out.println("Donner ID client :");
		int idclient = sc.nextInt();
		System.out.println("Donner ID technicien :");
		int idtechnicien = sc.nextInt();
		uneIntervention = new Intervention(description, dateinter, prix, idclient, idtechnicien);
		return uneIntervention;
		
	}
	public static void afficher(Intervention uneIntervention)
	{
		System.out.println("Id Inter  : " + uneIntervention.getIdtechnicien());
		System.out.println("Description : " + uneIntervention.getDescription());
		System.out.println("Date inter     : " + uneIntervention.getDateinter());
		System.out.println("Prix    : " + uneIntervention.getPrix());
		System.out.println("Id client      : " + uneIntervention.getIdclient());
		System.out.println("Id technicien" + uneIntervention.getIdtechnicien());

		
	}
	public static Intervention modifier (Intervention uneIntervention)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Ancienne description : "+uneIntervention.getDescription());
		System.out.println("New Description :");
		uneIntervention.setDescription(sc.next());
		
		System.out.println("Ancienne date Inter : "+uneIntervention.getDateinter());
		System.out.println("New Date Inter :");
		uneIntervention.setDateinter(sc.next());
		
		System.out.println("Ancien Prix : "+uneIntervention.getPrix());
		System.out.println("New prix :");
		uneIntervention.setPrix(sc.nextFloat());
		
		System.out.println("Ancien Id Client : "+uneIntervention.getIdclient());
		System.out.println("New id client :");
		uneIntervention.setIdclient(sc.nextInt());
		
		System.out.println("Ancien Id Technicien : "+uneIntervention.getIdtechnicien());
		System.out.println("New id Technicien :");
		uneIntervention.setIdtechnicien(sc.nextInt());
		return uneIntervention;
		
	}
}
