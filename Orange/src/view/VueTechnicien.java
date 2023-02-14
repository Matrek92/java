package view;

import java.util.Scanner;

import controleur.Client;
import controleur.Technicien;

public class VueTechnicien {
	public static Technicien saisirTechnicien()
	{
		Technicien unTechnicien;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le nom");
		String nom = sc.next();
		System.out.println("Donner le prenom");
		String prenom = sc.next();
		System.out.println("Donner la qualification");
		String qualification = sc.next();
		System.out.println("Donner l'email");
		String email = sc.next();
		System.out.println("Donner le téléphone");
		String tel = sc.next();
		unTechnicien = new Technicien(nom, prenom, email, qualification, tel);
		return unTechnicien;
		
	}
	public static void afficher(Technicien unTechnicien)
	{
		System.out.println("Id Technicien  : " + unTechnicien.getIdtechnicien());
		System.out.println("Nom client : " + unTechnicien.getNom());
		System.out.println("Prénom     : " + unTechnicien.getPrenom());
		System.out.println("Qualification    : " + unTechnicien.getQualification());
		System.out.println("Email      : " + unTechnicien.getEmail());
		System.out.println("Téléphone  : " + unTechnicien.getTel());

		
	}
	public static Technicien modifier (Technicien unTechnicien)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Ancien nom : "+unTechnicien.getNom());
		System.out.println("New Nom :");
		unTechnicien.setNom(sc.next());
		
		System.out.println("Ancien prénom : "+unTechnicien.getPrenom());
		System.out.println("New Prénomom :");
		unTechnicien.setPrenom(sc.next());
		
		System.out.println("Ancien Email : "+unTechnicien.getEmail());
		System.out.println("New Email :");
		unTechnicien.setEmail(sc.next());
		
		System.out.println("Ancienne qualification : "+unTechnicien.getQualification());
		System.out.println("New Adresse :");
		unTechnicien.setQualification(sc.next());
		
		System.out.println("Ancien téléphone : "+unTechnicien.getTel());
		System.out.println("New Tel :");
		unTechnicien.setTel(sc.next());
		return unTechnicien;
		
	}
}
