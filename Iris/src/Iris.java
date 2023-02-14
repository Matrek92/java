import java.util.ArrayList;
import java.util.Scanner;

public class Iris {
	//Conteneur Java : liste des étudiants de la classe mère
	private ArrayList<Etudiant> lesEtudiants ;
	
	public Iris() {
		this.lesEtudiants = new ArrayList<Etudiant>();
	}
	
	public void ajouterEtudiant()
	{
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1- Ajouter un étudiant Initial");
			System.out.println("2- Ajouter un étudiant Alternant");
			System.out.println("0- Quitter ");
			System.out.println("Votre choix : ");
			choix = sc.nextInt();
			switch(choix) {
			case 1 : {
				//instanciation de la classe Initial
				 Initial unInitial= new Initial ();
				//saisie des données
				unInitial.saisir();
				//ajout de l'instance dans l'ArrayList
				this.lesEtudiants.add(unInitial);
				System.out.println("Etudiant initial ajouté avec succès");
			}
			break;
			
			case 2 : {
				//instanciation de la classe Alternant
				 Alternant unAlternant= new Alternant ();
				//saisie des données
				unAlternant.saisir();
				//ajout de l'instance dans l'ArrayList
				this.lesEtudiants.add(unAlternant);
				System.out.println("Etudiant alternant ajouté avec succès");
			}
			break;
			}
		}while (choix != 0);
	}
	public void listerEtudiants ()
	{
		System.out.println("Liste de tous les étudiants");
		for(Etudiant unEtudiant : this.lesEtudiants)
		{
			unEtudiant.afficher();
		}
	}
	public void listerInitiaux()
	{
		System.out.println("Liste des initiaux");
		for(Etudiant unEtudiant : this.lesEtudiants)
		{
			if (unEtudiant instanceof Initial)
			{
				unEtudiant.afficher();
			}
		}
	}
	public void listerAlternants()
	{
		for(Etudiant unEtudiant : this.lesEtudiants)
		{
			if (unEtudiant instanceof Alternant)
			{
				unEtudiant.afficher();
			}
		}
		
	}
	public void totalScolarite ()
	{
		float total = 0;
		for(Etudiant unEtudiant : this.lesEtudiants) 
		{
			if (unEtudiant instanceof Initial) 
			{
				total += Initial.getMontant();
				//methode static appele par sa classe et non l'objet unEtudiant
			}
		}
		System.out.println("Le total de la scolarité : "+total);
	}
	public void listerEntreprise()
	{
		System.out.println("Liste des entreprises");
		for(Etudiant unEtudiant : this.lesEtudiants)
		{
			if(unEtudiant instanceof Alternant)
			{
				System.out.println("Entreprise : "+((Alternant)unEtudiant).getEntreprise());
			}
		}
	}
	public void supprimerEtudiant()
	{
		int numeroCarte ;
		Scanner sc = new Scanner(System.in);
		//vous demandez le numéro de carte
		System.out.println("Donner le numéro de carte :");
		numeroCarte = sc.nextInt();
		//vous parcourez les étudiants
		for(Etudiant unEtudiant : this.lesEtudiants)
		{
			
			//si un étudiant à le meme numero
			if (unEtudiant.getCarteEtudiant() == numeroCarte) {
			//on le supprime avec la méthode remove
			this.lesEtudiants.remove(unEtudiant);
			System.out.println("Etudiant supprime avec succès");
			break; //on quitte la boucle
			}
			
		}
	}
	public void menu () {
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("_______GESTION IRIS______");
			System.out.println("1- Ajouter un étudiant");
			System.out.println("2- Lister les étudiant");
			System.out.println("3- Liste des Initiaux");
			System.out.println("4- Liste des alternants");
			System.out.println("5- Total Scolarité");
			System.out.println("6- Lister les entreprises");
			System.out.println("7- Supprimer un Etudiant");
			System.out.println("0- Quitter");
			System.out.println("Votre choix : ");
			choix = sc.nextInt();
			switch (choix) {
			case 1 : this.ajouterEtudiant();break;
			case 2 : this.listerEtudiants();break;
			case 3 : this.listerInitiaux();break;
			case 4 : this.listerAlternants();break;
			case 5 : this.totalScolarite();break;
			case 6 : this.listerEntreprise();break;
			case 7 : this.supprimerEtudiant();break;
			}
		}while(choix!=0);
	}
	public static void main(String args[])
	{
		Iris monIris = new Iris ();
		monIris.menu();
	}


}
